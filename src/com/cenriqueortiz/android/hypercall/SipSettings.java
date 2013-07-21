/*
 * Based on Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package com.cenriqueortiz.android.hypercall;

import com.cenriqueortiz.hypercall.R;
import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Handles SIP authentication settings for the app.
 */
public class SipSettings extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Note that none of the preferences are actually defined here.
        // They're all in the XML file res/xml/preferences.xml.
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
