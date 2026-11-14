package defpackage;

import android.net.Uri;
import com.opera.android.browser.NavigationHistory;
import com.opera.android.browser.TabInfo;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public interface b9l {
    boolean A();

    int B();

    void C(boolean z, boolean z2, Callback callback);

    hh4 D(Runnable runnable);

    void E(int i, boolean z, Callback callback);

    String G();

    String I();

    boolean J();

    int K();

    boolean M(boolean z);

    void N();

    boolean O();

    int P();

    boolean Q(Callback callback);

    zg R();

    boolean S();

    default p6l T() {
        return m() ? p6l.b : p6l.a;
    }

    vz5 U();

    void V();

    void X();

    int Y();

    TabInfo a();

    void b();

    qwi b0();

    void c();

    boolean c0();

    void d();

    void d0(String str, boolean z, Callback callback);

    void dispose();

    boolean f();

    boolean g();

    int getId();

    String getUrl();

    NavigationHistory i();

    boolean isActive();

    boolean isAudioMuted();

    boolean isLoading();

    void k(boolean z);

    boolean m();

    boolean n();

    void o();

    void p();

    void q();

    boolean r();

    boolean s(TabInfo tabInfo);

    void setAudioMuted(boolean z);

    void show();

    esk t();

    void u();

    boolean v();

    boolean x(Uri uri, Callback callback);

    t59 y();

    boolean z();
}
