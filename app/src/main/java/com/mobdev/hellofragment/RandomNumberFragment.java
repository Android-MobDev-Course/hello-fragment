package com.mobdev.hellofragment;

import java.util.Random;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/**
 * Created by Marco Picone (picone.m@gmail.com) 12/03/2020
 */
public class RandomNumberFragment extends Fragment {

	private static final String TAG = "RandomNumberFragment";

	private TextView numberTextView = null;
	private Button randomButton = null;
	private Random random = null;

	public RandomNumberFragment() {
		Log.d(TAG, "Constructor called !");
		this.random = new Random();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

		Log.d(TAG, "onCreateView method called");

		View rootView = inflater.inflate(R.layout.random_number_fragment, container, false);

		//Retrieve TextView UI Object
		numberTextView  = (TextView)rootView.findViewById(R.id.numberTextView);

		//Retrieve a Button UI Object and set an inline listener
		randomButton  = (Button)rootView.findViewById(R.id.randomButton);

		randomButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int randomNum = random.nextInt(1000 + 1);
				numberTextView.setText(String.valueOf(randomNum));
			}
		});

		return rootView;
	}

}