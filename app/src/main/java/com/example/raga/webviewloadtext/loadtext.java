package com.example.raga.webviewloadtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class loadtext extends AppCompatActivity {
    WebView wvinfoIlkom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadtext);

        wvinfoIlkom =(WebView)findViewById(R.id.wvtext);

        String data = "kontent1:\n" +
                "        negara adalah tempat berkumpulnya masyrakat disuatu wilayah dan diorganisasikan oleh pemerintahan berdaulat";

        String htmltext=" %s ";
        String filehtml="<html><body style=\"text-align:jsutify\">"+data+" </body> </html>";

        wvinfoIlkom.loadData(String.format(htmltext, filehtml), "text/html","utf-8");
    }
}
