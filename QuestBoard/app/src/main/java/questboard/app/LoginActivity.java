package questboard.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class LoginActivity extends Activity
{
	//init login activity components
	private EditText username = null;
	private EditText password = null;
	private Button login;
	private Button register;
	private Button close;

	//to send back to MainActivity
	static int LOGGED_IN = 0;//assume not logged in

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		username = (EditText) findViewById(R.id.enter_name);
		password = (EditText) findViewById(R.id.enter_pass);
		login = (Button) findViewById(R.id.login);
		register = (Button) findViewById(R.id.register);
		close = (Button) findViewById(R.id.close);
	}

	public void Login(View view)
	{
		//set text from text fields to strings
		String name = username.getText().toString();
		String pass = password.getText().toString();

		//check if credentials are correct
		if(name == "Lancelot" && pass == "arthurDoesntKnow")//success!
		{
			LOGGED_IN = 1;//a quester logged in


		}
		else
		{
			//add an "invalid username or password" string to the login screen
			//idea: set it to invisible on startup, make it visible here?


			//remove this code later
			if(name != "Lancelot")//username is incorrect
			{
				//finish
			}
			if(pass != "arthurDoesntKnow")//password is incorrect
			{
				//finish
			}
		}

		setResult(LOGGED_IN);
		//finish
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
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

}