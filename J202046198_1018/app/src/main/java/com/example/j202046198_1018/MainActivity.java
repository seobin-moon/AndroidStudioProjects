//dlg.setItems(versionArray, new DialogInterface.OnClickListener() {
//public void onClick(DialogInterface dialog, int which) {
//        Toast.makeText(getApplicationContext(), versionArray[which],
//        Toast.LENGTH_LONG).show();
//        }
//        });
package com.example.j202046198_1018;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button button1;

    // TextView textView, textView2;
    //EditText editText, editText2;
    // View dialogView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기");
        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.button1);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();
        if (itemId == R.id.itemRed) {
            baseLayout.setBackgroundColor(Color.RED);
            return true;
        } else if (itemId == R.id.itemGreen) {
            baseLayout.setBackgroundColor(Color.GREEN);
            return true;
        } else if (itemId == R.id.itemBlue) {
            baseLayout.setBackgroundColor(Color.BLUE);
            return true;
        } else if (itemId == R.id.subRotate) {
            button1.setRotation(45);
            return true;
        } else if (itemId == R.id.subSize) {
            button1.setScaleX(2);
            return true;
        } // switch, case문 쓰니깐 에러나서 if, else if문으로 바꿈 (error: constant expression required)
        return false;
    }
}

        //String[] versionArray = new String[] {"Q(10)", "R(11)", "S(122)", "T(13)"};
        //boolean[] checkArray = new boolean[] {false, false, false, false};

     /*
        registerForContextMenu(baseLayout);
        registerForContextMenu(button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView = (View) View.inflate(MainActivity.this, R.layout.dialog1, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("대화상자 제목");
                // dlg.setMessage("대화상자 내용입니다.");
                // 목록을 출력하기 위해 setMessage 대신에 item을 보여주기
                dlg.setView(dialogView);
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                editText = (EditText) dialogView.findViewById(R.id.editTextText);
                                editText2 = (EditText) dialogView.findViewById(R.id.editTextText2);
                                Toast.makeText(getApplicationContext(),
                                        "이름 : "+editText.getText()toString() +
                                                ", 이메일" + editText2.getText().toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        });
                        dlg.setNegativeButton("취소", null);
                dlg.show();
                // 대화상자는 클릭하기 전까지는 항상 떠있어야 함.
                // Toast 메세지는 잠깐 나왔다가 사라지는 메세지임.
            }
        });
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menuInflater = getMenuInflater();

        if (v == baseLayout) {
            menuInflater.inflate(R.menu.context1_menu, menu);
        }
        else if (v == button) {
            menuInflater.inflate(R.menu.context2_menu, menu);
        }
    }

    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.contextRed) {
            baseLayout.setBackgroundColor(Color.RED);
        }
        else if (item.getItemId() == R.id.contextGreen) {
            baseLayout.setBackgroundColor(Color.GREEN);
        }
        else if (item.getItemId() == R.id.contextBlue) {
            baseLayout.setBackgroundColor(Color.BLUE);
        }

        return super.onContextItemSelected(item); // id가 충돌되지 않도록만 하면 됨
    }
    public void onCreateOptionsMenu(Menu menu) {
        //MenuInflater menuInflater = getMenuInflater();
        //menuInflater.inflate(R.menu.menu_main, menu);
        // 위를 주석 처리 하면 점 3개(...)가 안나옴

        menu.add(0, 1, 0, "빨강");
        menu.add(0, 2, 0, "초록");
        menu.add(0, 3, 0, "파랑");

        SubMenu subMenu = menu.addSubMenu("버튼 변경");
        subMenu.add(0, 4, 0, "회전");
        subMenu.add(0, 5, 0, "확대");

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == 1) { // 1은 R.id.itemRed (xml 안만들고 쓰는 방법)
            baseLayout.setBackgroundColor(Color.RED);
        }
        else if (item.getItemId() == 2) { // 2는 R.id.itemGreen

        }
        else if (item.getItemId() == 3) {

        }
        else if (item.getItemId() == R.id.subRotate) {
            button.setRotation(45);
        }
        else if (item.getItemId() == R.id.subSize) {
            button.setScaleX(2);
        }
    }
}
*/