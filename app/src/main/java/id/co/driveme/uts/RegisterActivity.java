package id.co.driveme.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class RegisterActivity extends AppCompatActivity {

    Button buttonRegister;
    TextView buttonBack;
    EditText  nama, tglLahir, email, userName, password, re_password;
    DatePickerDialog.OnDateSetListener setListener;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        buttonRegister = findViewById(R.id.btn_register);
        buttonBack = findViewById(R.id.btn_back);
        nama = findViewById(R.id.nama);
        tglLahir = findViewById(R.id.tanggalLahir);
        email = findViewById(R.id.email);
        userName = findViewById(R.id.username);
        password = findViewById(R.id.password);
        re_password = findViewById(R.id.re_password);

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        tglLahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        RegisterActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        month = month+1;
                        String date = day+"/"+month+"/"+year;
                        tglLahir.setText(date);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String str_nama = nama.getText().toString();
                String str_tanggal = tglLahir.getText().toString();
                String str_email = email.getText().toString();
                String str_username = userName.getText().toString();
                String str_password = password.getText().toString();
                String str_re_password = re_password.getText().toString();

                if(str_nama.isEmpty() || str_tanggal.isEmpty() || str_email.isEmpty() || str_username.isEmpty() || str_password.isEmpty() || str_re_password.isEmpty())
                {
                    Toast.makeText(RegisterActivity.this, "input data according to format", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(str_password.equals(str_re_password))
                    {
                        Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                        intent.putExtra("nama",str_nama);
                        intent.putExtra("tanggalLahir",str_tanggal);
                        intent.putExtra("email",str_email);
                        intent.putExtra("username",str_username);
                        intent.putExtra("password",str_password);
                        Toast.makeText(RegisterActivity.this, "your account is actived", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(RegisterActivity.this, "password does not match, retype your password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}