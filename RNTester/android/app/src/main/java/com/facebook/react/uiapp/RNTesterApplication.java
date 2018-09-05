/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 */

package com.facebook.react.uiapp;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.growingio.android.plugin.rn.GrowingIOPackage;
import com.growingio.android.sdk.collection.Configuration;
import com.growingio.android.sdk.collection.GrowingIO;

import java.util.Arrays;
import java.util.List;

public class RNTesterApplication extends Application implements ReactApplication {
  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public String getJSMainModuleName() {
      return "RNTester/js/RNTesterApp.android";
    }

    @Override
    public String getBundleAssetName() {
      return "RNTesterApp.android.bundle";
    }

    @Override
    public boolean getUseDeveloperSupport() {
      return true;
    }

    @Override
    public List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
        new MainReactPackage(), new GrowingIOPackage()
      );
    }
  };

  @Override
  public void onCreate() {
    super.onCreate();
    GrowingIO.startWithConfiguration(this,
      new Configuration().setDebugMode(true)
        .setTestMode(true));
  }

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }
};
