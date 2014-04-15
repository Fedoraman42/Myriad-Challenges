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

	//init list of accepted login credentials
	ArrayList<String> TempUser = new ArrayList<String>();
	ArrayList<ArrayList<String>> KnownUsers = new ArrayList<ArrayList<String>>();

	TempUser.add("Lancelot");
	TempUser.add("arthurDoesntKnow");
	TempUser.add("Quester");
	KnownUsers.add(TempUser);

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		username = (EditText) findViewById(R.id.enter_name);
		password = (EditText) findViewById(R.id.enter_pass);
		login = (Button) findViewById(R.id.login);
		register = (Button) findViewById(R.id.register);
	}

	public void Login(View view)
	{
		int i;

		for(i = 0; i < TempUser.size(); i++)//loop through stored login credentials
		{

		}
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