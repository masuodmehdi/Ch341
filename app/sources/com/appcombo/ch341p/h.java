package com.appcombo.ch341p;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appcombo.ch341p.ch341ActivityPlus;
import java.io.File;

final class h implements az {
    final /* synthetic */ ch341ActivityPlus a;

    h(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void a(File file) {
        if (file != null && this.a.E != null && file.length() > 0) {
            try {
                this.a.setContentView(C0000R.layout.wbview);
                WebView webView = (WebView) this.a.findViewById(C0000R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.addJavascriptInterface(new ch341ActivityPlus.WebAppInterface(this.a.getBaseContext()), "Android");
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("http://127.0.0.1:8080" + file.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
