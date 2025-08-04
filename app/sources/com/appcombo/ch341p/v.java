package com.appcombo.ch341p;

import android.content.DialogInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appcombo.ch341p.ch341ActivityPlus;

final class v implements DialogInterface.OnClickListener {
    final /* synthetic */ ch341ActivityPlus a;

    v(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.setContentView(C0000R.layout.wbview);
        WebView webView = (WebView) this.a.findViewById(C0000R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new ch341ActivityPlus.WebAppInterface(this.a), "Android");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(String.valueOf(this.a.G) + "/query.php?qqid=" + Integer.toHexString((int) this.a.u));
    }
}
