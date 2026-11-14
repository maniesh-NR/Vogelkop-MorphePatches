package ads_mobile_sdk;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.f43;
import defpackage.prb;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class zt1 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public WeakReference c = new WeakReference(null);
    public WeakReference d = new WeakReference(null);
    public WeakReference e = new WeakReference(null);
    public WeakReference f = new WeakReference(null);

    public prb a(f43 f43Var, ImageView.ScaleType scaleType, LinkedHashMap linkedHashMap) {
        return new prb();
    }

    public void a() {
    }

    public void a(int i, View view) {
    }

    public abstract void a(View view, f43 f43Var, LinkedHashMap linkedHashMap, ImageView.ScaleType scaleType);

    public abstract void a(FrameLayout frameLayout, ImageView.ScaleType scaleType, Map map);

    public abstract void a(f43 f43Var);

    public void a(f43 f43Var, MotionEvent motionEvent) {
    }

    public abstract void a(WeakReference weakReference, f43 f43Var, LinkedHashMap linkedHashMap, ew1 ew1Var, ew1 ew1Var2);

    public void a$1() {
    }

    public prb b(f43 f43Var, ImageView.ScaleType scaleType, LinkedHashMap linkedHashMap) {
        return new prb();
    }

    public void b(FrameLayout frameLayout, ImageView.ScaleType scaleType, Map map) {
    }

    public void c() {
    }

    public boolean d() {
        return true;
    }

    public int e() {
        return 0;
    }

    public boolean k() {
        return false;
    }
}
