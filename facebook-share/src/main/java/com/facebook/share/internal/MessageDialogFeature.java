/*
 * Copyright (c) 2014-present, Facebook, Inc. All rights reserved.
 *
 * You are hereby granted a non-exclusive, worldwide, royalty-free license to use,
 * copy, modify, and distribute this software in source code or binary form for use
 * in connection with the web services and APIs provided by Facebook.
 *
 * As with any software that integrates with the Facebook platform, your use of
 * this software is subject to the Facebook Developer Principles and Policies
 * [http://developers.facebook.com/policy/]. This copyright notice shall be
 * included in all copies or substantial portions of the software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;
import com.facebook.internal.NativeProtocol;

/**
 * com.facebook.share.internal is solely for the use of other packages within the
 * Facebook SDK for Android. Use of any of the classes in this package is
 * unsupported, and they may be modified or removed without warning at any time.
 */
public enum MessageDialogFeature implements DialogFeature {
    /**
     * Indicates whether the native Message dialog itself is supported by the installed version of
     * the Facebook Messenger application.
     */
    MESSAGE_DIALOG(NativeProtocol.PROTOCOL_VERSION_20140204),
    /**
     * Indicates whether the native Message dialog supports sharing of photo images.
     */
    PHOTOS(NativeProtocol.PROTOCOL_VERSION_20140324),
    /**
     * Indicates whether the native Message dialog supports sharing of videos.
     */
    VIDEO(NativeProtocol.PROTOCOL_VERSION_20141218),

    /**
     * Indicates whether the native Message dialog supports sharing of Messenger generic template
     * Content.
     */
    MESSENGER_GENERIC_TEMPLATE(NativeProtocol.PROTOCOL_VERSION_20171115),

    /**
     * Indicates whether the native Message dialog supports sharing of Messenger open graph music
     * template content.
     */
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(NativeProtocol.PROTOCOL_VERSION_20171115),

    /**
     * Indicates whether the native Message dialog supports sharing of Messenger media template
     * content.
     */
    MESSENGER_MEDIA_TEMPLATE(NativeProtocol.PROTOCOL_VERSION_20171115),
    ;

    private int minVersion;

    MessageDialogFeature(int minVersion) {
        this.minVersion = minVersion;
    }

    /**
     * This method is for internal use only.
     */
    public String getAction() {
        return NativeProtocol.ACTION_MESSAGE_DIALOG;
    }

    /**
     * This method is for internal use only.
     */
    public int getMinVersion() {
        return minVersion;
    }
}
