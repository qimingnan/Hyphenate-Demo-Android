package com.hyphenate.chatuidemo.ui.user;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.hyphenate.chat.EMClient;
import com.hyphenate.chatuidemo.R;
import com.hyphenate.chatuidemo.ui.BaseActivity;
import com.hyphenate.exceptions.HyphenateException;
import com.hyphenate.util.EMLog;

/**
 * Created by lzan13 on 2016/10/24.
 */

public class AddContactsActivity extends BaseActivity {

    private String TAG = AddContactsActivity.class.getSimpleName();

    private BaseActivity mActivity;

    @BindView(R.id.edit_search_contacts) EditText mSearchView;
    @BindView(R.id.btn_add_contacts) Button mAddContactsBtn;

    private String addUsername;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.em_activity_add_contacts);

        ButterKnife.bind(this);

        mActivity = this;

        getSupportActionBar().setTitle(R.string.em_contacts_add);
        getActionBarToolbar().setNavigationIcon(R.drawable.em_ic_back);
        getActionBarToolbar().setNavigationOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                finish();
            }
        });
    }

    @OnClick(R.id.btn_add_contacts) void addContacts() {
        addUsername = mSearchView.getText().toString().trim();
        if (TextUtils.isEmpty(addUsername)) {
            Toast.makeText(mActivity, R.string.em_hint_input_not_null, Toast.LENGTH_LONG).show();
            return;
        }
        new Thread(new Runnable() {
            @Override public void run() {
                try {
                    EMClient.getInstance().contactManager().addContact(addUsername, "Add friends");
                    runOnUiThread(new Runnable() {
                        @Override public void run() {
                            Toast.makeText(mActivity, R.string.em_contacts_application_success,
                                    Toast.LENGTH_LONG).show();
                        }
                    });
                } catch (HyphenateException e) {
                    e.printStackTrace();
                    int errorCode = e.getErrorCode();
                    String errorMsg = e.getMessage();
                    EMLog.e(TAG, "add contacts: error - " + errorCode + ", msg - " + errorMsg);
                    runOnUiThread(new Runnable() {
                        @Override public void run() {
                            Toast.makeText(mActivity, R.string.em_contacts_application_failed,
                                    Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }
        }).start();
    }
}
