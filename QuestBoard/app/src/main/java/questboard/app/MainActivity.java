package questboard.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity
{
	static final int LOGIN_REQUEST = 1;
	static final int LOGGED_IN = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//call LoginActivity, wait for successful login
		Intent loginIntent = new Intent(this, LoginActivity.class);
		startActivityForResult(loginIntent, LOGIN_REQUEST);

		//handle result from the login activity
		//this.onActivityResult(LOGIN_REQUEST, LOGGED_IN, loginIntent);//is this right?
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings)
			return true;
		return super.onOptionsItemSelected(item);
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		if(requestCode == LOGIN_REQUEST)
		{
			if(resultCode == 1)//user logged in as a quester
			{
				//load quester's main view


				//finish
			}
			else if(resultCode == 2)//user logged in as a quest giver
			{
				//load quest giver's main view


				//finish
			}
			else//something messed up, show an error and end the program
			{
				//finish
			}
		}
		else//something messed up, show an error and end the program
		{
			//finish
		}
	}
}