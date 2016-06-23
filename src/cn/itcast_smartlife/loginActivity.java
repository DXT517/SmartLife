package cn.itcast_smartlife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends Activity implements OnClickListener {

	private EditText edtIp;
	private EditText edtPort;

	private Button btnCon;
	private Button btnBack;

	// private String ip;
	// private String port;
	// private String againCon;

	// private Socket socket;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.login_layout);

		// Intent intent = getIntent();
		// ip = intent.getStringExtra("serverIP");
		// port = intent.getStringExtra("severPort");

		edtIp = (EditText) findViewById(R.id.edit_ip);
		edtPort = (EditText) findViewById(R.id.edit_port);

		btnCon = (Button) findViewById(R.id.btn_connect);
		btnBack = (Button) findViewById(R.id.btn_back);

		// edtIp.setOnClickListener(this);
		// edtPort.setOnClickListener(this);
		btnCon.setOnClickListener(this);
		btnBack.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_connect:

			// ������Ӱ�ť
			// try {
			// ��ȡ��ip��port֮�����ӷ�����
			String ip = edtIp.getText().toString();
			String port = edtPort.getText().toString();

			if (!ip.equals("") && !port.equals("")) {

				// Toast.makeText(this, "ip is" + ip + "port is " +
				// port,Toast.LENGTH_LONG).show();
				// socket = new Socket(ip, port);

				// Toast.makeText(this, "�������ӳɹ���", Toast.LENGTH_LONG).show();

				// �����ӳɹ�����ת��ע�
				Intent intent = new Intent(loginActivity.this,
						MainActivity.class);

				// ����һ����������������
				intent.putExtra("serverIP", ip);
				intent.putExtra("severPort", port);
				// intent.putExtra("Socket", socket);
				startActivity(intent);

				// } catch (Exception e) {
				// TODO Auto-generated catch block
				// Toast.makeText(this, "��������ʧ��", Toast.LENGTH_LONG).show();
				// }
			} else {
				Toast.makeText(this, "�������������ip��ַ�Ͷ˿ں�", Toast.LENGTH_LONG)
						.show();

			}
			break;

		case R.id.btn_back:
			// ����˳���ť
			finish();

			break;
		}

	}

}
