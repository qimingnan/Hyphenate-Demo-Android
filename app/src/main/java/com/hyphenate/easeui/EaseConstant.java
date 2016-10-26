/**
 * Copyright (C) 2016 Hyphenate Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hyphenate.easeui;

public class EaseConstant {
    // call attr key
    public static final String MESSAGE_ATTR_IS_VOICE_CALL = "is_voice_call";
    public static final String MESSAGE_ATTR_IS_VIDEO_CALL = "is_video_call";

    public static final String MESSAGE_ATTR_IS_BIG_EXPRESSION = "em_is_big_expression";
    public static final String MESSAGE_ATTR_EXPRESSION_ID = "em_expression_id";

    public static final String MESSAGE_ATTR_AT_MSG = "em_at_message";

    public static final int CHATTYPE_SINGLE = 1;
    public static final int CHATTYPE_GROUP = 2;
    public static final int CHATTYPE_CHATROOM = 3;

    public static final String EXTRA_CHAT_TYPE = "chatType";
    public static final String EXTRA_USER_ID = "userId";
    public static final String EXTRA_IS_INCOMING_CALL = "isIncomingCall";
    public static final String EXTRA_FROM = "from";
    public static final String EXTRA_TYPE = "type";
    public static final String EXTRA_TO = "to";

    public static final String CONVERSATION_NAME_APPLICATION = "em_application";
    public static final String MESSAGE_ATTR_TYPE = "em_type";
    public static final String MESSAGE_ATTR_USERNAME = "em_username";
    public static final String MESSAGE_ATTR_REASON = "em_reason";
    public static final String MESSAGE_ATTR_STATUS = "em_status";

    // Broadcast action
    public static final String BROADCAST_ACTION_CALL = "com.hyphenate.action.call";
    public static final String BROADCAST_ACTION_CONTACTS = "com.hyphenate.action.contacts";
    public static final String BROADCAST_ACTION_APPLICATION = "com.hyphenate.action.application";
}
