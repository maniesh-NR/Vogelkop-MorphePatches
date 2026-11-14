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
public final class l23 extends vmp {
    public final Context a;
    public final qr0 b;
    public final mip c;
    public final nx5 d;
    public SensorManager e;
    public Sensor f;
    public long g;
    public int h;
    public d91 i;
    public boolean j;

    public l23(Context context, qr0 qr0Var, mip mipVar, nx5 nx5Var) {
        this.a = context;
        this.b = qr0Var;
        this.c = mipVar;
        this.d = nx5Var;
        on7 on7Var = pn7.b;
        this.g = cs5.x0(0, un7.d);
    }

    public final void a() {
        synchronized (this) {
            if (this.j) {
                SensorManager sensorManager = this.e;
                if (sensorManager == null) {
                    sensorManager = null;
                }
                Sensor sensor = this.f;
                if (sensor == null) {
                    sensor = null;
                }
                sensorManager.unregisterListener(this, sensor);
                xu0.b("Stopped listening for shake gestures.", null);
                this.j = false;
            }
        }
    }

    @Override // defpackage.vmp
    public final void a(SensorEvent sensorEvent) {
        qr0 qr0Var = this.b;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:inspector:shake_enabled", Boolean.TRUE, fo.a)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f3 * f3) + (f2 * f2) + (f * f))) >= ((Number) qr0Var.a("gads:inspector:shake_strength", Float.valueOf(2.0f), fo.a$10)).floatValue()) {
                on7 on7Var = pn7.b;
                this.c.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                un7 un7Var = un7.d;
                long jY0 = cs5.y0(jElapsedRealtime, un7Var);
                long j = this.g;
                pn7 pn7Var = new pn7(cs5.x0(500, un7Var));
                fo foVar = fo.a$18;
                if (pn7.c(jY0, pn7.m(j, ((pn7) qr0Var.a("gads:inspector:shake_interval", pn7Var, foVar)).a)) < 0) {
                    return;
                }
                if (pn7.c(jY0, pn7.m(this.g, ((pn7) qr0Var.a("gads:inspector:shake_reset_time_ms", new pn7(cs5.x0(PathInterpolatorCompat.MAX_NUM_POINTS, un7Var)), foVar)).a)) > 0) {
                    this.h = 0;
                }
                xu0.b("Shake detected.", null);
                this.g = jY0;
                this.h++;
                defpackage.na2.B(this.d, h.a, null, new fsg(new u6k((byte) 18, null, this), null, (byte) 3), 2);
            }
        }
    }
}
