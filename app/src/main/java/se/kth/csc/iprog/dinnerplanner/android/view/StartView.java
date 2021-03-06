package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.TextView;

import se.kth.csc.iprog.dinnerplanner.android.R;

public class StartView {

	View view;

	public StartView(View view) {

		// store in the class the reference to the Android View
		this.view = view;

		TextView example = (TextView) view.findViewById(R.id.example_text);
		example.setText("Welcome to Dinner Planner! \n\n" +
                "Here you will be able to easily plan your dinner.\n\n" +
                "On the next page start by selecting number of participants. Then select your courses.\n\n" +
                "Watch Magic Happen!");

		// Setup the rest of the view layout
	}

}
