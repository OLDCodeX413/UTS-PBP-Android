package id.co.driveme.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    TextView registerButton;
    EditText nama, tglLahir, email, userName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        registerButton = findViewById(R.id.btn_register);
        loginButton = findViewById(R.id.btn_login);
        userName = findViewById(R.id.username);
        password = findViewById(R.id.password);
        registerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);

            }
        });

        loginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                String str_userName = userName.getText().toString();
                String str_password = password.getText().toString();
                String str_adminName = "test";
                String str_adminPassword = "test";
                Intent put = getIntent();
                String put_data1 = put.getStringExtra("nama");
                String put_data2 = put.getStringExtra("tanggalLahir");
                String put_data3 = put.getStringExtra("email");
                String put_data4 = put.getStringExtra("username");
                String put_data5 = put.getStringExtra("password");

                if(str_userName.equals(put_data4)&&str_password.equals(put_data5))
                {
                    Intent intent = new Intent(LoginActivity.this,NavigationDrawerActivity.class);
                    intent.putExtra("nama",put_data1);
                    intent.putExtra("tanggalLahir",put_data2);
                    intent.putExtra("email",put_data3);
                    intent.putExtra("username",put_data4);
                    intent.putExtra("password",put_data5);
                    Toast.makeText(LoginActivity.this, "welcome "+put_data1, Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }

                else if (str_adminName.equals(userName.getText().toString())&&str_adminPassword.equals(password.getText().toString()))
                {
                    Intent intent = new Intent(LoginActivity.this,NavigationDrawerActivity.class);
                    Toast.makeText(LoginActivity.this, "this is superadmin account", Toast.LENGTH_SHORT).show();
                    intent.putExtra("nama","superadmin");
                    intent.putExtra("tanggalLahir","1/1/2000");
                    intent.putExtra("email","superadmin@gmail.com");
                    startActivity(intent);
                }

                else
                {
                    Toast.makeText(LoginActivity.this, "email or password not match", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}