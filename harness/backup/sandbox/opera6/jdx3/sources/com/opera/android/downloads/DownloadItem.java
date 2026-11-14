package com.opera.android.downloads;

import defpackage.re7;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public interface DownloadItem {
    void a(String str);

    long b();

    String c();

    void cancel();

    void d(String str);

    int e();

    WebContents f();

    String g();

    long getId();

    int getState();

    String getUrl();

    String h();

    long i();

    boolean j(re7 re7Var);

    long k();

    boolean l();

    int m();

    long n();

    void o(int i);

    String p();

    void remove();
}
