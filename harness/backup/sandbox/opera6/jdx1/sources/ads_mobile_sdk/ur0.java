package ads_mobile_sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import defpackage.cs5;
import defpackage.fsg;
import defpackage.mip;
import defpackage.u6k;
import defpackage.vmp;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class ur0 extends vmp {
    public final Context a;
    public final qr0 b;
    public final mip c;
    public final nx5 d;
    public SensorManager e;
    public Sensor f;
    public float g;
    public float h;
    public long i;
    public int j;
    public boolean k;
    public boolean l;
    public d91 m;
    public boolean n;

    public ur0(Context context, qr0 qr0Var, mip mipVar, nx5 nx5Var) {
        this.a = context;
        this.b = qr0Var;
        this.c = mipVar;
        this.d = nx5Var;
        on7 on7Var = pn7.b;
        mipVar.getClass();
        this.i = cs5.y0(SystemClock.elapsedRealtime(), un7.d);
    }

    public final void a() {
        synchronized (this) {
            if (this.n) {
                SensorManager sensorManager = this.e;
                if (sensorManager == null) {
                    sensorManager = null;
                }
                Sensor sensor = this.f;
                if (sensor == null) {
                    sensor = null;
                }
                sensorManager.unregisterListener(this, sensor);
                this.n = false;
                xu0.b("Stopped listening for flick gestures.", null);
            }
        }
    }

    @Override // defpackage.vmp
    public final void a(SensorEvent sensorEvent) {
        Float fValueOf = Float.valueOf(45.0f);
        qr0 qr0Var = this.b;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:inspector:flick_enabled", Boolean.TRUE, fo.a)).booleanValue()) {
            on7 on7Var = pn7.b;
            this.c.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            un7 un7Var = un7.d;
            long jY0 = cs5.y0(jElapsedRealtime, un7Var);
            if (pn7.c(jY0, pn7.m(this.i, ((pn7) qr0Var.a("gads:inspector:flick_reset_time_ms", new pn7(cs5.x0(PathInterpolatorCompat.MAX_NUM_POINTS, un7Var)), fo.a$18)).a)) > 0) {
                this.j = 0;
                this.i = jY0;
                this.k = false;
                this.l = false;
                this.g = this.h;
            }
            float f = this.h + (sensorEvent.values[1] * 4.0f);
            this.h = f;
            float f2 = this.g;
            fo foVar = fo.a$10;
            float fFloatValue = ((Number) qr0Var.a("gads:inspector:flick_rotation_threshold", fValueOf, foVar)).floatValue() + f2;
            float f3 = this.h;
            if (f > fFloatValue) {
                this.g = f3;
                this.l = true;
            } else if (f3 < this.g - ((Number) qr0Var.a("gads:inspector:flick_rotation_threshold", fValueOf, foVar)).floatValue()) {
                this.g = this.h;
                this.k = true;
            }
            if (Float.isInfinite(this.h)) {
                this.h = 0.0f;
                this.g = 0.0f;
            }
            if (this.k && this.l) {
                xu0.b("Flick detected.", null);
                this.i = jY0;
                this.j++;
                this.k = false;
                this.l = false;
                defpackage.na2.B(this.d, h.a, null, new fsg(new u6k((byte) 29, null, this), null, (byte) 3), 2);
            }
        }
    }
}
