package dev.android.aj.aj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebChromeClient chromeclient = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView wb = (WebView)findViewById(R.id.webView);
        wb.getSettings().setJavaScriptEnabled(true);
        if (chromeclient == null) {
            chromeclient = new WebChromeClient();
            wb.setWebChromeClient(chromeclient);
        }
        wb.loadUrl("file:///android_asset/www/index.html");
    }
}
