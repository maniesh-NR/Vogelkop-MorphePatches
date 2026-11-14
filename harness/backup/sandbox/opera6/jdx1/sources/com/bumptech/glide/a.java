package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import defpackage.a36;
import defpackage.a4d;
import defpackage.avj;
import defpackage.bzh;
import defpackage.c34;
import defpackage.ceh;
import defpackage.cpj;
import defpackage.d14;
import defpackage.d19;
import defpackage.dh7;
import defpackage.drj;
import defpackage.dvj;
import defpackage.e34;
import defpackage.eg3;
import defpackage.f38;
import defpackage.f3k;
import defpackage.fg3;
import defpackage.g34;
import defpackage.hh8;
import defpackage.hv5;
import defpackage.i9b;
import defpackage.ioj;
import defpackage.jr6;
import defpackage.kwh;
import defpackage.kx9;
import defpackage.l19;
import defpackage.mnl;
import defpackage.mwh;
import defpackage.p3n;
import defpackage.p3p;
import defpackage.qii;
import defpackage.r05;
import defpackage.rbe;
import defpackage.ry9;
import defpackage.s16;
import defpackage.sx9;
import defpackage.tfk;
import defpackage.ujp;
import defpackage.ulp;
import defpackage.vtp;
import defpackage.vw6;
import defpackage.vy9;
import defpackage.w3d;
import defpackage.wy9;
import defpackage.xy9;
import defpackage.zg3;
import defpackage.zy9;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a i;
    public static volatile boolean j;
    public final zg3 a;
    public final a4d b;
    public final ry9 c;
    public final tah d;
    public final jl6 e;
    public final mwh f;
    public final wu5 g;
    public final ArrayList h = new ArrayList();

    public a(Context context, f38 f38Var, a4d a4dVar, zg3 zg3Var, jl6 jl6Var, mwh mwhVar, wu5 wu5Var, wu5 wu5Var2, ArrayMap arrayMap, List list) {
        this.a = zg3Var;
        this.e = jl6Var;
        this.b = a4dVar;
        this.f = mwhVar;
        this.g = wu5Var;
        Resources resources = context.getResources();
        tah tahVar = new tah();
        this.d = tahVar;
        jr6 jr6Var = new jr6();
        d14 d14Var = (d14) tahVar.h;
        synchronized (d14Var) {
            d14Var.a.add(jr6Var);
        }
        hh8 hh8Var = new hh8();
        d14 d14Var2 = (d14) tahVar.h;
        synchronized (d14Var2) {
            d14Var2.a.add(hh8Var);
        }
        ArrayList arrayListT = tahVar.t();
        e34 e34Var = new e34(context, arrayListT, zg3Var, jl6Var);
        p3n p3nVar = new p3n(zg3Var, new ioj((byte) 8));
        dh7 dh7Var = new dh7(tahVar.t(), resources.getDisplayMetrics(), zg3Var, jl6Var);
        c34 c34Var = new c34(dh7Var, (byte) 0);
        eg3 eg3Var = new eg3(dh7Var, jl6Var, (byte) 2);
        sx9 sx9Var = new sx9(context);
        vw6 vw6Var = new vw6(resources, (byte) 1);
        isd isdVar = new isd(resources, (byte) 19);
        bzh bzhVar = new bzh(resources);
        lld lldVar = new lld(resources, (byte) 20);
        fg3 fg3Var = new fg3(jl6Var);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        rbe rbeVar = new rbe((byte) 24);
        s16 s16Var = new s16();
        ContentResolver contentResolver = context.getContentResolver();
        tahVar.d(ByteBuffer.class, new ulp((byte) 26));
        tahVar.d(InputStream.class, new qie(jl6Var, (byte) 27));
        tahVar.h("Bitmap", ByteBuffer.class, Bitmap.class, c34Var);
        tahVar.h("Bitmap", InputStream.class, Bitmap.class, eg3Var);
        tahVar.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new c34(dh7Var, (byte) 1));
        tahVar.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, p3nVar);
        tahVar.h("Bitmap", AssetFileDescriptor.class, Bitmap.class, new p3n(zg3Var, new avj((byte) 7)));
        rbe rbeVar2 = rbe.A;
        tahVar.g(Bitmap.class, Bitmap.class, rbeVar2);
        tahVar.h("Bitmap", Bitmap.class, Bitmap.class, new d19((byte) 1));
        tahVar.f(Bitmap.class, fg3Var);
        tahVar.h("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new eg3(resources, c34Var));
        tahVar.h("BitmapDrawable", InputStream.class, BitmapDrawable.class, new eg3(resources, eg3Var));
        tahVar.h("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new eg3(resources, p3nVar));
        tahVar.f(BitmapDrawable.class, new i16(zg3Var, fg3Var, (byte) 6));
        tahVar.h("Gif", InputStream.class, kx9.class, new tfk(arrayListT, e34Var, jl6Var));
        tahVar.h("Gif", ByteBuffer.class, kx9.class, e34Var);
        tahVar.f(kx9.class, new a36());
        tahVar.g(f3k.class, f3k.class, rbeVar2);
        tahVar.h("Bitmap", f3k.class, Bitmap.class, new sx9(zg3Var));
        tahVar.h("legacy_append", Uri.class, Drawable.class, sx9Var);
        tahVar.h("legacy_append", Uri.class, Bitmap.class, new eg3(sx9Var, zg3Var, (byte) 1));
        tahVar.F(new g34((byte) 0));
        tahVar.g(File.class, ByteBuffer.class, new psp());
        tahVar.g(File.class, InputStream.class, new l19(new ix5((byte) 9), (byte) 10));
        tahVar.h("legacy_append", File.class, File.class, new d19((byte) 0));
        tahVar.g(File.class, ParcelFileDescriptor.class, new l19(new hv5(), (byte) 10));
        tahVar.g(File.class, File.class, rbeVar2);
        tahVar.F(new i9b(jl6Var));
        tahVar.F(new g34((byte) 2));
        Class cls = Integer.TYPE;
        tahVar.g(cls, InputStream.class, vw6Var);
        tahVar.g(cls, ParcelFileDescriptor.class, bzhVar);
        tahVar.g(Integer.class, InputStream.class, vw6Var);
        tahVar.g(Integer.class, ParcelFileDescriptor.class, bzhVar);
        tahVar.g(Integer.class, Uri.class, isdVar);
        tahVar.g(cls, AssetFileDescriptor.class, lldVar);
        tahVar.g(Integer.class, AssetFileDescriptor.class, lldVar);
        tahVar.g(cls, Uri.class, isdVar);
        tahVar.g(String.class, InputStream.class, new qe6());
        tahVar.g(Uri.class, InputStream.class, new qe6());
        tahVar.g(String.class, InputStream.class, new drj((byte) 2));
        tahVar.g(String.class, ParcelFileDescriptor.class, new dpj((byte) 2));
        tahVar.g(String.class, AssetFileDescriptor.class, new cpj((byte) 2));
        tahVar.g(Uri.class, InputStream.class, new ir5());
        tahVar.g(Uri.class, InputStream.class, new ole(context.getAssets()));
        tahVar.g(Uri.class, ParcelFileDescriptor.class, new zy9(context.getAssets()));
        tahVar.g(Uri.class, InputStream.class, new n0c(context, false));
        tahVar.g(Uri.class, InputStream.class, new c61(context, 0));
        tahVar.g(Uri.class, InputStream.class, new ceh(context, InputStream.class));
        tahVar.g(Uri.class, ParcelFileDescriptor.class, new ceh(context, ParcelFileDescriptor.class));
        tahVar.g(Uri.class, InputStream.class, new u7k(contentResolver));
        tahVar.g(Uri.class, ParcelFileDescriptor.class, new bxk(contentResolver, (byte) 6));
        tahVar.g(Uri.class, AssetFileDescriptor.class, new mnl(contentResolver));
        tahVar.g(Uri.class, InputStream.class, new drj((byte) 7));
        tahVar.g(URL.class, InputStream.class, new dpj((byte) 7));
        tahVar.g(Uri.class, File.class, new nx(context));
        tahVar.g(xy9.class, InputStream.class, new qq6((byte) 18));
        tahVar.g(byte[].class, ByteBuffer.class, new qii());
        tahVar.g(byte[].class, InputStream.class, new ujp((byte) 26));
        tahVar.g(Uri.class, Uri.class, rbeVar2);
        tahVar.g(Drawable.class, Drawable.class, rbeVar2);
        tahVar.h("legacy_append", Drawable.class, Drawable.class, new d19((byte) 2));
        tahVar.G(Bitmap.class, BitmapDrawable.class, new u59(resources, (byte) 17));
        tahVar.G(Bitmap.class, byte[].class, rbeVar);
        tahVar.G(Drawable.class, byte[].class, new ua7(zg3Var, rbeVar, s16Var, (byte) 2));
        tahVar.G(kx9.class, byte[].class, s16Var);
        p3n p3nVar2 = new p3n(zg3Var, new dvj((byte) 7));
        tahVar.h("legacy_append", ByteBuffer.class, Bitmap.class, p3nVar2);
        tahVar.h("legacy_append", ByteBuffer.class, BitmapDrawable.class, new eg3(resources, p3nVar2));
        this.c = new ry9(context, jl6Var, tahVar, wu5Var2, arrayMap, list, f38Var);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws PackageManager.NameNotFoundException, ClassNotFoundException {
        if (j) {
            qp2.n("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
            return;
        }
        j = true;
        ArrayMap arrayMap = new ArrayMap(0);
        wu5 wu5Var = new wu5();
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY);
            if (applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        vtp.S(str);
                        throw null;
                    }
                }
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.O().isEmpty()) {
                generatedAppGlideModule.O();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    throw p3p.g(it);
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    throw p3p.g(it2);
                }
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                throw p3p.g(it3);
            }
            if (wy9.b == 0) {
                wy9.b = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i2 = wy9.b;
            PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
            vy9 vy9Var = new vy9("source", false);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            wy9 wy9Var = new wy9(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, priorityBlockingQueue, vy9Var));
            wy9 wy9Var2 = new wy9(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new vy9("disk-cache", true)));
            if (wy9.b == 0) {
                wy9.b = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i3 = wy9.b >= 4 ? 2 : 1;
            wy9 wy9Var3 = new wy9(new ThreadPoolExecutor(i3, i3, 0L, timeUnit, new PriorityBlockingQueue(), new vy9("animation", true)));
            r05 r05Var = new r05(new z63(applicationContext));
            wu5 wu5Var2 = new wu5();
            int i4 = r05Var.b;
            zg3 w3dVar = i4 > 0 ? new w3d(i4) : new qii();
            jl6 jl6Var = new jl6(r05Var.d);
            a4d a4dVar = new a4d(r05Var.c);
            a aVar = new a(applicationContext, new f38(a4dVar, new qfb(applicationContext), wy9Var2, wy9Var, new wy9(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, timeUnit, new SynchronousQueue(), new vy9("source-unlimited", false))), wy9Var3), a4dVar, w3dVar, jl6Var, new mwh(), wu5Var2, wu5Var, arrayMap, Collections.EMPTY_LIST);
            Iterator it4 = arrayList.iterator();
            if (it4.hasNext()) {
                throw p3p.g(it4);
            }
            applicationContext.registerComponentCallbacks(aVar);
            i = aVar;
            j = false;
        } catch (PackageManager.NameNotFoundException e) {
            h9o.s("Unable to find metadata to parse GlideModules", e);
        }
    }

    public static a b(Context context) {
        if (i == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                h9o.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
                return null;
            } catch (InstantiationException e2) {
                h9o.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                h9o.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                h9o.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
                return null;
            }
            synchronized (a.class) {
                if (i == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return i;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            qp2.o("You must call this method on the main thread");
            return;
        }
        this.b.l(0L);
        this.a.e();
        jl6 jl6Var = this.e;
        synchronized (jl6Var) {
            jl6Var.h(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        long j2;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            qp2.o("You must call this method on the main thread");
            return;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((kwh) obj).getClass();
        }
        a4d a4dVar = this.b;
        if (i2 >= 40) {
            a4dVar.l(0L);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (a4dVar) {
                j2 = ((t59) a4dVar).a;
            }
            a4dVar.l(j2 / 2);
        }
        this.a.c(i2);
        jl6 jl6Var = this.e;
        synchronized (jl6Var) {
            if (i2 >= 40) {
                synchronized (jl6Var) {
                    try {
                        jl6Var.h(0);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (i2 >= 20 || i2 == 15) {
                jl6Var.h(jl6Var.b / 2);
            }
        }
    }
}
