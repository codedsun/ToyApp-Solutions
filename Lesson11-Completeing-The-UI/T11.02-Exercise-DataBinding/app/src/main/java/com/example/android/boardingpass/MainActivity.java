package com.example.android.boardingpass;

/*
* Copyright (C) 2016 The Android Open Source Project
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

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.boardingpass.databinding.ActivityMainBinding;
import com.example.android.boardingpass.utilities.FakeDataUtils;

import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding; BoardingPassInfo boardingPassInfo;

    //TOO (3) Create a data binding instance called mBinding of type ActivityMainBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        boardingPassInfo = FakeDataUtils.generateFakeBoardingPassInfo();
        displayBoardingPassInfo(boardingPassInfo);
        // TOD (4) Set the Content View using DataBindingUtil to the activity_main layout

        // TOO (5) Load a BoardingPassInfo object with fake data using FakeDataUtils

        // TDO (9) Call displayBoardingPassInfo and pass the fake BoardingInfo instance

    }

    private void displayBoardingPassInfo(BoardingPassInfo info) {

        activityMainBinding.textViewPassengerName.setText(info.passengerName);

        // TDO (6) Use mBinding to set the Text in all the textViews using the data in info

        // TOO (7) Use a SimpleDateFormat formatter to set the formatted value in time text views

        // TOO (8) Use TimeUnit methods to format the total minutes until boarding

    }
}

