package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class g0k extends GLSurfaceView {
    public static final /* synthetic */ int l = 0;
    public final CopyOnWriteArrayList a;
    public final SensorManager b;
    public final Sensor c;
    public final jsf d;
    public final Handler e;
    public final mmi f;
    public SurfaceTexture g;
    public Surface h;
    public final boolean i;
    public boolean j;
    public boolean k;

    public g0k(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList();
        this.e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        mmi mmiVar = new mmi();
        this.f = mmiVar;
        f0k f0kVar = new f0k(this, mmiVar);
        View.OnTouchListener nxlVar = new nxl(context, f0kVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.d = new jsf(windowManager.getDefaultDisplay(), nxlVar, f0kVar);
        this.i = true;
        setEGLContextClientVersion(2);
        setRenderer(f0kVar);
        setOnTouchListener(nxlVar);
    }

    public final void a() {
        boolean z = this.i && this.j;
        Sensor sensor = this.c;
        if (sensor == null || z == this.k) {
            return;
        }
        jsf jsfVar = this.d;
        SensorManager sensorManager = this.b;
        if (z) {
            sensorManager.registerListener(jsfVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(jsfVar);
        }
        this.k = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new mni(this, (byte) 19));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.j = true;
        a();
    }
}
