/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.camera.util;

import android.content.Context;

import com.android.camera.remote.RemoteCameraModule;
import com.android.camera.remote.RemoteShutterListener;

public class RemoteShutterHelper {
    public static RemoteShutterListener create(Context context) {
        return new RemoteShutterListener() {
            @Override
            public void onPictureTaken(byte[] photoData) {
            }

            @Override
            public void onModuleReady(RemoteCameraModule module) {
            }

            @Override
            public void onModuleExit() {
            }
        };
    }
}
