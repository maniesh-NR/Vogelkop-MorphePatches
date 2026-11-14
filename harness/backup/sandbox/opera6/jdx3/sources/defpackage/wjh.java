package defpackage;

import J.N;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.media.MediaMetadata;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.BrowserActivity;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.ToolbarProgressBar;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wjh implements o7h {
    public static final yg9 g = new yg9((byte) 19);
    public static final hr5 h = new hr5();
    public static final cpj i = new cpj((byte) 12);
    public static volatile wjh j;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public wjh(byte b) {
        this.a = b;
        switch (b) {
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                this.b = new Object();
                this.d = new cf2(0);
                this.e = new dee();
                this.f = new dee();
                break;
            case 12:
                this.b = new ConcurrentHashMap();
                this.c = new ConcurrentHashMap();
                this.d = new f30((byte) 7);
                this.e = new f30((byte) 8);
                this.f = new ConcurrentHashMap();
                break;
            case 13:
                this.b = new ReentrantReadWriteLock(false);
                this.c = new HashMap();
                this.d = new AtomicInteger();
                this.e = new ArrayList();
                break;
            case 25:
                this.b = new int[10];
                this.c = new int[10];
                this.d = new int[10];
                this.e = new int[10];
                this.f = new int[10];
                break;
        }
    }

    public wjh(ai aiVar) {
        this.a = (byte) 0;
        this.b = aiVar;
        this.c = new pde(Boolean.FALSE);
        this.d = new pde(0);
        this.e = new sa2((byte) 6);
        this.f = new vjh(ujh.c, null);
    }

    public wjh(Context context) {
        this.a = (byte) 3;
        File file = new File(context.getNoBackupFilesDir(), "opera_ads");
        this.b = file;
        this.c = "ads";
        this.d = new File(file, "download");
        this.e = z4c.b(new zmo(this, (byte) 1));
        this.f = z4c.b(new zmo(this, (byte) 0));
    }

    public wjh(Context context, umi umiVar, egd[] egdVarArr, r9g r9gVar) {
        this.a = (byte) 21;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.b = context;
        this.c = umiVar;
        Collections.addAll(arrayList, egdVarArr);
        this.f = r9gVar;
        k();
    }

    public wjh(BrowserActivity browserActivity, qim qimVar, b7f b7fVar) {
        this.a = (byte) 11;
        this.f = browserActivity;
        this.e = new HashMap();
        this.b = browserActivity;
        this.c = qimVar;
        this.d = b7fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.view.View, android.widget.ProgressBar, com.opera.android.custom_views.ToolbarProgressBar] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.graphics.drawable.InsetDrawable] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.graphics.drawable.InsetDrawable] */
    public wjh(ToolbarProgressBar toolbarProgressBar) {
        int i2;
        int i3;
        this.a = (byte) 2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.c = gradientDrawable2;
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.e = gradientDrawable3;
        int iA = fan.a(0.0f, toolbarProgressBar.getContext().getResources());
        int iA2 = fan.a(0.0f, toolbarProgressBar.getResources());
        q4h q4hVar = new q4h();
        this.d = q4hVar;
        this.f = h;
        Context context = toolbarProgressBar.getContext();
        int iL = hr5.l(context);
        gradientDrawable.setShape(0);
        float f = iA;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(iL);
        ScaleDrawable scaleDrawable = new ScaleDrawable(gradientDrawable, 3, 1.0f, -1.0f);
        int iT = f03.t(2130969343, context, 2131102491);
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(iT);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable2, scaleDrawable});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        if (iA2 <= 0) {
            i2 = 1;
            i3 = 2131102491;
        } else {
            i2 = 1;
            i3 = 2131102491;
            layerDrawable = new InsetDrawable((Drawable) layerDrawable, 0, iA2, 0, iA2);
        }
        toolbarProgressBar.setProgressDrawable(layerDrawable);
        Context context2 = toolbarProgressBar.getContext();
        int iT2 = f03.t(2130969343, context2, i3);
        int iL2 = hr5.l(context2);
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(f);
        gradientDrawable3.setColor(iT2);
        q4hVar.setShape(0);
        q4hVar.setCornerRadius(f);
        q4hVar.setColor(iL2);
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = gradientDrawable3;
        drawableArr[i2] = q4hVar;
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        layerDrawable2.setId(0, R.id.background);
        layerDrawable2.setId(i2, R.id.progress);
        toolbarProgressBar.setIndeterminateDrawable(iA2 > 0 ? new InsetDrawable((Drawable) layerDrawable2, 0, iA2, 0, iA2) : layerDrawable2);
    }

    public wjh(SettingsManager settingsManager, x5f x5fVar, rr3 rr3Var, sy syVar) {
        this.a = (byte) 28;
        this.b = settingsManager;
        this.c = x5fVar;
        s9 s9Var = new s9(this, (byte) 14);
        this.d = s9Var;
        this.e = syVar;
        if (rr3Var == null || !settingsManager.i("enable_newsfeed")) {
            return;
        }
        settingsManager.F(s9Var);
        this.f = new o59(rr3Var);
    }

    public wjh(db dbVar, Activity activity, ab abVar, String str, Callback callback) {
        this.a = (byte) 4;
        this.b = activity;
        this.c = abVar;
        this.d = str;
        this.e = callback;
        this.f = dbVar;
    }

    public wjh(fe5 fe5Var, RecyclerView recyclerView, View view, iv7 iv7Var, hd hdVar, lv7 lv7Var, lv7 lv7Var2, jv3 jv3Var) {
        this.a = (byte) 26;
        this.b = recyclerView;
        this.c = view;
        this.d = iv7Var;
        this.e = hdVar;
        x77 x77Var = new x77(lv7Var, this, lv7Var2, false, (byte) 5);
        byte b = 3;
        wf wfVar = new wf(b);
        final byte b2 = 0;
        wfVar.setHasStableIds(false);
        byte b3 = 4;
        wfVar.J(eu7.class, new yt7(b2), new au7(x77Var, b2), new a3j(b3));
        byte b4 = 1;
        wfVar.J(du7.class, new ge5(x77Var, jv3Var, (byte) 15), new yt7(b4), new a3j(b3));
        byte b5 = 2;
        wfVar.J(cu7.class, new yt7(b5), new au7(x77Var, b4), new a3j(b3));
        wfVar.J(fu7.class, new au7(x77Var, b5), new yt7(b), new a3j(b3));
        this.f = wfVar;
        recyclerView.y0(wfVar);
        ((qde) hdVar.g).j(fe5Var, new ug(new Function1(this) { // from class: xt7
            public final /* synthetic */ wjh b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                l08 l08Var;
                w7d du7Var;
                byte b6 = b2;
                wjh wjhVar = this.b;
                switch (b6) {
                    case 0:
                        List<jx1> list = (List) obj;
                        wf wfVar2 = (wf) wjhVar.f;
                        if (list.isEmpty()) {
                            l08Var = l08.a;
                        } else {
                            l08 arrayList = new ArrayList();
                            for (jx1 jx1Var : list) {
                                if (jx1Var != null) {
                                    if (jx1Var instanceof sx1) {
                                        du7Var = new eu7(((sx1) jx1Var).a);
                                    } else if (jx1Var instanceof rx1) {
                                        rx1 rx1Var = (rx1) jx1Var;
                                        String str = rx1Var.a;
                                        wxe wxeVar = rx1Var.b;
                                        if (wxeVar != null) {
                                            if (wxeVar instanceof qx1) {
                                                qx1 qx1Var = (qx1) wxeVar;
                                                du7Var = new du7(str, new nw0(qx1Var.m, qx1Var.o));
                                            } else if (wxeVar instanceof tx1) {
                                                du7Var = new du7(str, new ow0(((tx1) wxeVar).m.toString()));
                                            }
                                        }
                                        h9o.p();
                                        break;
                                    } else if (jx1Var instanceof px1) {
                                        du7Var = new cu7(((px1) jx1Var).a);
                                    } else if (jx1Var instanceof fz1) {
                                        fz1 fz1Var = (fz1) jx1Var;
                                        Uri uri = fz1Var.c;
                                        String str2 = fz1Var.a;
                                        du7Var = uri != null ? new du7(str2, new ow0(String.valueOf(uri))) : new fu7(str2, fz1Var.b);
                                    }
                                    arrayList.add(du7Var);
                                }
                                h9o.p();
                                break;
                            }
                            l08Var = arrayList;
                        }
                        wfVar2.getClass();
                        eme emeVar = new eme(wfVar2);
                        ArrayList arrayList2 = (ArrayList) wfVar2.d;
                        j87 j87VarK = uup.k(new ik(arrayList2, l08Var, (byte) 1), true);
                        arrayList2.clear();
                        arrayList2.addAll((Collection) l08Var);
                        j87VarK.a(emeVar);
                        wjhVar.C();
                        break;
                    default:
                        wjhVar.C();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 15));
        final byte b6 = 1;
        iv7Var.f.j(fe5Var, new ug(new Function1(this) { // from class: xt7
            public final /* synthetic */ wjh b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                l08 l08Var;
                w7d du7Var;
                byte b62 = b6;
                wjh wjhVar = this.b;
                switch (b62) {
                    case 0:
                        List<jx1> list = (List) obj;
                        wf wfVar2 = (wf) wjhVar.f;
                        if (list.isEmpty()) {
                            l08Var = l08.a;
                        } else {
                            l08 arrayList = new ArrayList();
                            for (jx1 jx1Var : list) {
                                if (jx1Var != null) {
                                    if (jx1Var instanceof sx1) {
                                        du7Var = new eu7(((sx1) jx1Var).a);
                                    } else if (jx1Var instanceof rx1) {
                                        rx1 rx1Var = (rx1) jx1Var;
                                        String str = rx1Var.a;
                                        wxe wxeVar = rx1Var.b;
                                        if (wxeVar != null) {
                                            if (wxeVar instanceof qx1) {
                                                qx1 qx1Var = (qx1) wxeVar;
                                                du7Var = new du7(str, new nw0(qx1Var.m, qx1Var.o));
                                            } else if (wxeVar instanceof tx1) {
                                                du7Var = new du7(str, new ow0(((tx1) wxeVar).m.toString()));
                                            }
                                        }
                                        h9o.p();
                                        break;
                                    } else if (jx1Var instanceof px1) {
                                        du7Var = new cu7(((px1) jx1Var).a);
                                    } else if (jx1Var instanceof fz1) {
                                        fz1 fz1Var = (fz1) jx1Var;
                                        Uri uri = fz1Var.c;
                                        String str2 = fz1Var.a;
                                        du7Var = uri != null ? new du7(str2, new ow0(String.valueOf(uri))) : new fu7(str2, fz1Var.b);
                                    }
                                    arrayList.add(du7Var);
                                }
                                h9o.p();
                                break;
                            }
                            l08Var = arrayList;
                        }
                        wfVar2.getClass();
                        eme emeVar = new eme(wfVar2);
                        ArrayList arrayList2 = (ArrayList) wfVar2.d;
                        j87 j87VarK = uup.k(new ik(arrayList2, l08Var, (byte) 1), true);
                        arrayList2.clear();
                        arrayList2.addAll((Collection) l08Var);
                        j87VarK.a(emeVar);
                        wjhVar.C();
                        break;
                    default:
                        wjhVar.C();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 15));
        C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wjh(fe5 fe5Var, fyj fyjVar, ImageView imageView, StylingImageButton stylingImageButton, m0a m0aVar, pde pdeVar, q2 q2Var) {
        this.a = (byte) 27;
        this.b = fyjVar;
        this.c = imageView;
        this.d = stylingImageButton;
        this.e = m0aVar;
        this.f = q2Var;
        final byte b = 0;
        m0aVar.e.j(fe5Var, new ug(new Function1(this) { // from class: ru7
            public final /* synthetic */ wjh b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                wjh wjhVar = this.b;
                switch (b2) {
                    case 0:
                        wjhVar.C();
                        break;
                    default:
                        wjhVar.C();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 17));
        final byte b2 = 1;
        pdeVar.j(fe5Var, new ug(new Function1(this) { // from class: ru7
            public final /* synthetic */ wjh b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                wjh wjhVar = this.b;
                switch (b22) {
                    case 0:
                        wjhVar.C();
                        break;
                    default:
                        wjhVar.C();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 17));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: su7
            public final /* synthetic */ wjh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                wjh wjhVar = this.b;
                switch (b3) {
                    case 0:
                        new xw((m0a) wjhVar.e).p((ImageView) wjhVar.c);
                        ((q2) wjhVar.f).invoke();
                        break;
                    default:
                        new xw((m0a) wjhVar.e).p((ImageView) wjhVar.c);
                        ((q2) wjhVar.f).invoke();
                        break;
                }
            }
        });
        if (stylingImageButton != 0) {
            stylingImageButton.setOnClickListener(new View.OnClickListener(this) { // from class: su7
                public final /* synthetic */ wjh b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b2;
                    wjh wjhVar = this.b;
                    switch (b3) {
                        case 0:
                            new xw((m0a) wjhVar.e).p((ImageView) wjhVar.c);
                            ((q2) wjhVar.f).invoke();
                            break;
                        default:
                            new xw((m0a) wjhVar.e).p((ImageView) wjhVar.c);
                            ((q2) wjhVar.f).invoke();
                            break;
                    }
                }
            });
        }
    }

    public wjh(gjm gjmVar, fe5 fe5Var, isd isdVar, j1k j1kVar) {
        this.a = (byte) 16;
        this.b = gjmVar;
        this.c = fe5Var;
        this.d = isdVar;
        this.e = j1kVar;
        this.f = new kze(Boolean.FALSE);
    }

    public /* synthetic */ wjh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public wjh(List list) {
        this.a = (byte) 7;
        List list2 = list;
        int iA = qbd.a(k95.o(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj : list2) {
            linkedHashMap.put(Long.valueOf(((gy0) obj).b()), obj);
        }
        this.b = linkedHashMap;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(6, 1);
        long timeInMillis = calendar.getTimeInMillis();
        on7 on7Var = pn7.b;
        long jF = pn7.f(cs5.x0(24, un7.g));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gy0 gy0Var = (gy0) it.next();
            long j2 = (timeInMillis - gy0Var.b) / jF;
            if (j2 >= 0) {
                if (j2 == 0) {
                    ((ArrayList) this.d).add(gy0Var);
                } else if (j2 == 1) {
                    ((ArrayList) this.e).add(gy0Var);
                } else {
                    ((ArrayList) this.f).add(gy0Var);
                }
            }
        }
    }

    public wjh(ju juVar, umi umiVar) {
        this.a = (byte) 5;
        this.f = juVar;
        this.b = umiVar;
    }

    public wjh(ke5 ke5Var) {
        this.a = (byte) 15;
        this.b = new ArrayList(ke5Var.a);
        this.c = new ArrayList(ke5Var.b);
        this.d = new ArrayList(ke5Var.c);
        List list = (List) ke5Var.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new r94((Pair) it.next(), (byte) 10));
        }
        this.e = arrayList;
        List list2 = (List) ke5Var.g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new je5((jj6) it2.next(), (byte) 1));
        }
        this.f = arrayList2;
    }

    public wjh(kze kzeVar, Context context, umi umiVar, x5f x5fVar) {
        this.a = (byte) 17;
        this.b = kzeVar;
        this.c = context;
        this.d = umiVar;
        this.e = x5fVar;
        this.f = new ode();
        kzeVar.k(new cl4(new tk6(this, (byte) 0), (byte) 7));
    }

    public wjh(mp6 mp6Var, r16 r16Var) {
        this.a = (byte) 19;
        this.b = mp6Var;
        this.f = r16Var;
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public wjh(tcc tccVar, k6l k6lVar, Function1 function1, Function1 function12) {
        this.a = (byte) 6;
        this.b = k6lVar;
        this.c = function1;
        this.d = function12;
        this.e = new c4(this, (byte) 14);
        byte b = 0;
        aib.C(k6lVar.s, tccVar, new qz(this, b));
        tccVar.a(new rz(this, b));
    }

    public wjh(zd4 zd4Var, zd4 zd4Var2, wtk wtkVar) {
        this.a = (byte) 24;
        this.c = zd4Var;
        this.d = zd4Var2;
        this.b = wtkVar;
    }

    public wjh(int[] iArr, int i2, nyf[] nyfVarArr) {
        ia5 ia5Var;
        this.a = (byte) 1;
        this.f = new float[3];
        this.e = nyfVarArr;
        int[] iArr2 = new int[32768];
        this.c = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int iR = (r(Color.red(i4), 8, 5) << 10) | (r(Color.green(i4), 8, 5) << 5) | r(Color.blue(i4), 8, 5);
            iArr[i3] = iR;
            iArr2[iR] = iArr2[iR] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                int iRgb = Color.rgb(r((i6 >> 10) & 31, 5, 8), r((i6 >> 5) & 31, 5, 8), r(i6 & 31, 5, 8));
                float[] fArr = (float[]) this.f;
                ab5.a(Color.red(iRgb), Color.green(iRgb), Color.blue(iRgb), fArr);
                if (z(fArr)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.b = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i5 <= i2) {
            this.d = new ArrayList();
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = iArr3[i9];
                ((ArrayList) this.d).add(new oyf(Color.rgb(r((i10 >> 10) & 31, 5, 8), r((i10 >> 5) & 31, 5, 8), r(i10 & 31, 5, 8)), iArr2[i10]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i2, g);
        priorityQueue.offer(new ia5(this, 0, ((int[]) this.b).length - 1));
        while (priorityQueue.size() < i2 && (ia5Var = (ia5) priorityQueue.poll()) != null) {
            int i11 = ia5Var.b;
            int iMin = ia5Var.a;
            if ((i11 + 1) - iMin <= 1) {
                break;
            }
            wjh wjhVar = ia5Var.j;
            if ((i11 + 1) - iMin <= 1) {
                qp2.n("Can not split a box with only 1 color");
                throw null;
            }
            int i12 = ia5Var.e - ia5Var.d;
            int i13 = ia5Var.g - ia5Var.f;
            int i14 = ia5Var.i - ia5Var.h;
            int i15 = (i12 < i13 || i12 < i14) ? (i13 < i12 || i13 < i14) ? -1 : -2 : -3;
            int[] iArr4 = (int[]) wjhVar.b;
            int[] iArr5 = (int[]) wjhVar.c;
            q(i15, iMin, i11, iArr4);
            Arrays.sort(iArr4, iMin, ia5Var.b + 1);
            q(i15, iMin, ia5Var.b, iArr4);
            int i16 = ia5Var.c / 2;
            int i17 = 0;
            int i18 = iMin;
            while (true) {
                int i19 = ia5Var.b;
                if (i18 > i19) {
                    break;
                }
                i17 += iArr5[iArr4[i18]];
                if (i17 >= i16) {
                    iMin = Math.min(i19 - 1, i18);
                    break;
                }
                i18++;
            }
            ia5 ia5Var2 = new ia5(wjhVar, iMin + 1, ia5Var.b);
            ia5Var.b = iMin;
            ia5Var.a();
            priorityQueue.offer(ia5Var2);
            priorityQueue.offer(ia5Var);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            ia5 ia5Var3 = (ia5) it.next();
            wjh wjhVar2 = ia5Var3.j;
            int[] iArr6 = (int[]) wjhVar2.b;
            int[] iArr7 = (int[]) wjhVar2.c;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            for (int i24 = ia5Var3.a; i24 <= ia5Var3.b; i24++) {
                int i25 = iArr6[i24];
                int i26 = iArr7[i25];
                i21 += i26;
                i20 = (((i25 >> 10) & 31) * i26) + i20;
                i22 = (((i25 >> 5) & 31) * i26) + i22;
                i23 += i26 * (i25 & 31);
            }
            float f = i21;
            oyf oyfVar = new oyf(Color.rgb(r(Math.round(i20 / f), 5, 8), r(Math.round(i22 / f), 5, 8), r(Math.round(i23 / f), 5, 8)), i21);
            if (!z(oyfVar.b())) {
                arrayList.add(oyfVar);
            }
        }
        this.d = arrayList;
    }

    public static void B(String str, InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null) {
            StringBuilder sbR = p3p.r(str, ": ");
            sbR.append(cause.getMessage());
            throw new RuntimeException(sbR.toString(), cause);
        }
        StringBuilder sbR2 = p3p.r(str, ": ");
        sbR2.append(invocationTargetException.getMessage());
        throw new RuntimeException(sbR2.toString(), invocationTargetException);
    }

    public static wjh h(CaptioningManager.CaptionStyle captionStyle) {
        if (captionStyle == null) {
            return new wjh(null, null, null, null, null, (byte) 14);
        }
        Integer numValueOf = captionStyle.hasBackgroundColor() ? Integer.valueOf(captionStyle.backgroundColor) : null;
        Integer numValueOf2 = captionStyle.hasEdgeColor() ? Integer.valueOf(captionStyle.edgeColor) : null;
        Integer numValueOf3 = captionStyle.hasEdgeType() ? Integer.valueOf(captionStyle.edgeType) : null;
        Integer numValueOf4 = captionStyle.hasForegroundColor() ? Integer.valueOf(captionStyle.foregroundColor) : null;
        captionStyle.hasWindowColor();
        return new wjh(numValueOf, numValueOf2, numValueOf3, numValueOf4, captionStyle.getTypeface(), (byte) 14);
    }

    public static void i(Object obj, dc8 dc8Var) {
        try {
            dc8Var.a(obj);
        } catch (InvocationTargetException e) {
            B("Could not dispatch event: " + obj.getClass() + " to handler " + dc8Var, e);
            throw null;
        }
    }

    public static void j(dc8 dc8Var, cd8 cd8Var) {
        try {
            Object objA = cd8Var.a();
            if (objA == null) {
                return;
            }
            i(objA, dc8Var);
        } catch (InvocationTargetException e) {
            B("Producer " + cd8Var + " threw an exception.", e);
            throw null;
        }
    }

    public static void q(int i2, int i3, int i4, int[] iArr) {
        if (i2 == -2) {
            while (i3 <= i4) {
                int i5 = iArr[i3];
                iArr[i3] = (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5) | (i5 & 31);
                i3++;
            }
            return;
        }
        if (i2 == -1) {
            while (i3 <= i4) {
                int i6 = iArr[i3];
                iArr[i3] = ((i6 & 31) << 10) | (((i6 >> 5) & 31) << 5) | ((i6 >> 10) & 31);
                i3++;
            }
        }
    }

    public static int r(int i2, int i3, int i4) {
        return (i4 > i3 ? i2 << (i4 - i3) : i2 >> (i3 - i4)) & ((1 << i4) - 1);
    }

    public final void A() {
        if (((String) this.f) == null) {
            return;
        }
        N.MLHk67wk((c4) this.e);
        this.f = null;
    }

    public final void C() {
        switch (this.a) {
            case 26:
                boolean z = ((iv7) this.d).b() && !((Collection) ((qde) ((hd) this.e).g).g()).isEmpty();
                ((RecyclerView) this.b).setVisibility(z ? 0 : 8);
                View view = (View) this.c;
                if (view != null) {
                    view.setVisibility(z ? 0 : 8);
                    break;
                }
                break;
            default:
                ImageView imageView = (ImageView) this.c;
                l0a l0aVar = (l0a) ((m0a) this.e).e.g();
                l0aVar.getClass();
                dyj dyjVar = ((fyj) this.b).a;
                dyj dyjVar2 = dyj.a;
                AppCompatImageView appCompatImageView = (StylingImageButton) this.d;
                if (appCompatImageView == null) {
                    imageView.setVisibility(8);
                    break;
                } else {
                    l0aVar.b.isEmpty();
                    imageView.setVisibility(8);
                    appCompatImageView.setVisibility(8);
                    break;
                }
        }
    }

    public final void a(pe6 pe6Var, s15 s15Var) {
        ((ArrayList) this.c).add(new Pair(pe6Var, s15Var));
    }

    public final void b(fz8 fz8Var, s15 s15Var) {
        ((ArrayList) this.e).add(new gb3(fz8Var, s15Var, (byte) 16));
    }

    public final ph4 c(fw2 fw2Var, Function0 function0) {
        int i2;
        int i3;
        int i4;
        nqh nqhVar = new nqh();
        nqhVar.a = -1;
        synchronized (this.b) {
            Throwable th = (Throwable) this.c;
            if (th != null) {
                fw2Var.b(th);
                return rbe.q;
            }
            cf2 cf2Var = (cf2) this.d;
            do {
                i2 = cf2Var.get();
                i3 = i2 + 1;
            } while (!cf2Var.compareAndSet(i2, i3));
            boolean z = (134217727 & i3) == 1;
            nqhVar.a = (i3 >>> 27) & 15;
            ((dee) this.e).a(fw2Var);
            if (z) {
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    synchronized (this.b) {
                        if (((Throwable) this.c) == null) {
                            this.c = th2;
                            dee deeVar = (dee) this.e;
                            Object[] objArr = deeVar.a;
                            int i5 = deeVar.b;
                            for (int i6 = 0; i6 < i5; i6++) {
                                ((fw2) objArr[i6]).b(th2);
                            }
                            ((dee) this.e).d();
                            cf2 cf2Var2 = (cf2) this.d;
                            do {
                                i4 = cf2Var2.get();
                            } while (!cf2Var2.compareAndSet(i4, ((((i4 >>> 27) & 15) + 1) & 15) << 27));
                        }
                    }
                }
            }
            return new k5o(new hv((Object) fw2Var, (Object) this, (Object) nqhVar, (byte) 4));
        }
    }

    public final po2 d() {
        String strConcat = ((g07) this.b) == null ? " surface" : "";
        if (((List) this.c) == null) {
            strConcat = strConcat.concat(" sharedSurfaces");
        }
        if (((Integer) this.d) == null) {
            strConcat = strConcat.concat(" mirrorMode");
        }
        if (((Integer) this.e) == null) {
            strConcat = strConcat.concat(" surfaceGroupId");
        }
        if (((ip7) this.f) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (strConcat.isEmpty()) {
            return new po2((g07) this.b, (List) this.c, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), (ip7) this.f);
        }
        qp2.n("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #2 {all -> 0x009d, blocks: (B:9:0x0035, B:11:0x003b, B:13:0x0047, B:15:0x0053, B:16:0x0057, B:17:0x0068, B:19:0x006e, B:22:0x0079), top: B:44:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.d
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            java.lang.Object r1 = r4.b
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = (java.util.concurrent.locks.ReentrantReadWriteLock) r1
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            r2.lock()
            java.lang.Object r2 = r4.f     // Catch: java.lang.Throwable -> Lb8
            ke4 r2 = (ke4) r2     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto L1a
            r4.w(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb8
            goto Lb0
        L1a:
            r2 = r7
            java.lang.Object r7 = r4.c     // Catch: java.lang.Throwable -> Lb8
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Throwable -> Lb8
            h84 r7 = (defpackage.h84) r7     // Catch: java.lang.Throwable -> Lb8
            if (r7 != 0) goto La7
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r1.readLock()
            r7.unlock()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r1.writeLock()
            r7.lock()
            java.lang.Object r7 = r4.f     // Catch: java.lang.Throwable -> L9d
            ke4 r7 = (ke4) r7     // Catch: java.lang.Throwable -> L9d
            if (r7 != 0) goto L79
            java.lang.Object r7 = r4.c     // Catch: java.lang.Throwable -> L9d
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Throwable -> L9d
            h84 r7 = (defpackage.h84) r7     // Catch: java.lang.Throwable -> L9d
            if (r7 != 0) goto L68
            java.lang.Object r7 = r4.c     // Catch: java.lang.Throwable -> L9d
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch: java.lang.Throwable -> L9d
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L9d
            r3 = 256(0x100, float:3.59E-43)
            if (r7 < r3) goto L57
            r0.incrementAndGet()     // Catch: java.lang.Throwable -> L9d
            goto L71
        L57:
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r5
            h84 r5 = new h84     // Catch: java.lang.Throwable -> L9d
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r4 = r4.c     // Catch: java.lang.Throwable -> L9d
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L9d
            r4.put(r10, r5)     // Catch: java.lang.Throwable -> L9d
            r7 = r5
        L68:
            boolean r4 = r7.a(r2)     // Catch: java.lang.Throwable -> L9d
            if (r4 != 0) goto L71
            r0.incrementAndGet()     // Catch: java.lang.Throwable -> L9d
        L71:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r1.writeLock()
            r4.unlock()
            return
        L79:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r1.readLock()     // Catch: java.lang.Throwable -> L9d
            r7.lock()     // Catch: java.lang.Throwable -> L9d
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r7 = r1.writeLock()
            r7.unlock()
            r7 = r2
            r4.w(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L93
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            r4.unlock()
            return
        L93:
            r0 = move-exception
            r4 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r1.readLock()
            r5.unlock()
            throw r4
        L9d:
            r0 = move-exception
            r4 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r1.writeLock()
            r5.unlock()
            throw r4
        La7:
            boolean r4 = r7.a(r2)     // Catch: java.lang.Throwable -> Lb8
            if (r4 != 0) goto Lb0
            r0.incrementAndGet()     // Catch: java.lang.Throwable -> Lb8
        Lb0:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            r4.unlock()
            return
        Lb8:
            r0 = move-exception
            r4 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r1.readLock()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjh.e(java.lang.String, int, int, int, int, int):void");
    }

    public final void f(b2l b2lVar) {
        if (((Boolean) ((Function1) this.c).invoke(b2lVar)).booleanValue()) {
            d7l d7lVar = (d7l) b2lVar;
            String strI0 = d7lVar.i0();
            String str = (String) N.MfdpAXw7(strI0);
            if (Intrinsics.a(str, "unavailable")) {
                if (((String) this.f) == null) {
                    N.MHJ6j1st((c4) this.e);
                }
                this.f = strI0;
                return;
            }
            A();
            if (Intrinsics.a(str, "unavailable") || Intrinsics.a(str, "uncategorized")) {
                return;
            }
            ArrayList arrayListR = aik.r(true, str, ';');
            int size = arrayListR.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListR.get(i2);
                i2++;
                if (Integer.parseInt((String) obj) == 1) {
                    ((Function1) this.d).invoke(d7lVar);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(zd4 zd4Var, zd4 zd4Var2, ntk ntkVar, ntk ntkVar2, Map.Entry entry) {
        ntk ntkVar3 = (ntk) entry.getValue();
        Objects.toString(ntkVar3);
        uo2 uo2Var = new uo2(ntkVar.g.a, ((dn2) entry.getKey()).a.d, ntkVar.c ? zd4Var : null, ((dn2) entry.getKey()).a.f, ((dn2) entry.getKey()).a.g);
        uo2 uo2Var2 = new uo2(ntkVar2.g.a, ((dn2) entry.getKey()).b.d, ntkVar2.c ? zd4Var2 : null, ((dn2) entry.getKey()).b.f, ((dn2) entry.getKey()).b.g);
        short s = ((dn2) entry.getKey()).a.c;
        ntkVar3.getClass();
        xug.i();
        ntkVar3.b();
        jpo.n("Consumer can only be linked once.", !ntkVar3.j);
        ntkVar3.j = true;
        mtk mtkVar = ntkVar3.l;
        fr4 fr4VarI0 = k1g.i0(mtkVar.c(), new ltk(ntkVar3, mtkVar, s, uo2Var, uo2Var2), x7d.l());
        fr4VarI0.addListener(new wr9(fr4VarI0, new i16((byte) 14, (Object) this, (Object) ntkVar3, false), 0 == true ? 1 : 0), x7d.l());
    }

    public final Object get() {
        return new dv6((Executor) ((o7h) this.b).get(), (pxd) ((o7h) this.c).get(), (x77) ((shf) this.d).get(), (ydi) ((o7h) this.e).get(), (ydi) ((o7h) this.f).get());
    }

    public final void k() {
        umi umiVar = (umi) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        final byte b = 0;
        if (arrayList.isEmpty()) {
            ((r9g) this.f).a((mkg[]) ((ArrayList) this.e).toArray(new mkg[0]));
            return;
        }
        final egd egdVar = (egd) arrayList.remove(0);
        o29 o29VarB = egdVar.b();
        o29 o29Var = o29.AUDIO_PLAYLIST;
        final Context context = (Context) this.b;
        if (o29VarB == o29Var) {
            Uri uriC = egdVar.c();
            hu5 hu5Var = new hu5((Object) this, (Object) egdVar, (byte) 4);
            Pattern pattern = zkg.a;
            nml nmlVarB = umiVar.b(new ow3(context, uriC, (byte) 6));
            nmlVarB.b(umiVar.f(new r9g((Object) hu5Var, (byte) 5)));
            nmlVarB.a(null);
            return;
        }
        final wu5 wu5Var = new wu5();
        final xm5 xm5Var = new xm5(this);
        final MediaMetadata.Builder builder = new MediaMetadata.Builder();
        final Uri uriC2 = egdVar.c();
        if (egdVar.b() == o29.AUDIO) {
            nml nmlVarB2 = umiVar.b(new esk(wu5Var, context, egdVar, builder, uriC2) { // from class: eyd
                public final /* synthetic */ Context a;
                public final /* synthetic */ egd b;
                public final /* synthetic */ MediaMetadata.Builder c;
                public final /* synthetic */ Uri d;

                {
                    this.a = context;
                    this.b = egdVar;
                    this.c = builder;
                    this.d = uriC2;
                }

                public final Object get() throws IOException {
                    Bitmap bitmapDecodeByteArray;
                    Context context2 = this.a;
                    egd egdVar2 = this.b;
                    MediaMetadata.Builder builder2 = this.c;
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(context2, egdVar2.c());
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(1);
                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(13);
                        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(2);
                        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
                        long j2 = 0;
                        if (strExtractMetadata4 != null) {
                            try {
                                j2 = Long.parseLong(strExtractMetadata4);
                            } catch (NumberFormatException unused) {
                            }
                        }
                        long j3 = j2;
                        String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(7);
                        byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
                        if (embeddedPicture != null) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inPreferredConfig = Bitmap.Config.RGB_565;
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length, options);
                        } else {
                            bitmapDecodeByteArray = null;
                        }
                        wu5.e(strExtractMetadata5, bitmapDecodeByteArray, strExtractMetadata3, strExtractMetadata2, strExtractMetadata, j3, builder2);
                    } catch (RuntimeException unused2) {
                    } catch (Throwable th) {
                        try {
                            mediaMetadataRetriever.release();
                            throw th;
                        } catch (IOException unused3) {
                            throw th;
                        }
                    }
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException unused4) {
                    }
                    Uri uri = this.d;
                    if (zi4.E(uri)) {
                        wu5.d(context2, uri, builder2);
                    }
                    return builder2.build();
                }
            });
            final byte b2 = 1;
            nmlVarB2.b(umiVar.f(new n5o() { // from class: dyd
                public final Object g(Object obj) {
                    byte b3 = b2;
                    egd egdVar2 = egdVar;
                    xm5 xm5Var2 = xm5Var;
                    MediaMetadata mediaMetadata = (MediaMetadata) obj;
                    switch (b3) {
                        case 0:
                            xm5Var2.D(egdVar2, mediaMetadata);
                            break;
                        default:
                            xm5Var2.D(egdVar2, mediaMetadata);
                            break;
                    }
                    return null;
                }
            }));
            nmlVarB2.a(null);
            return;
        }
        if (!zi4.E(uriC2)) {
            xm5Var.D(egdVar, builder.build());
            return;
        }
        nml nmlVarB3 = umiVar.b(new z82(wu5Var, context, uriC2, builder));
        nmlVarB3.b(umiVar.f(new n5o() { // from class: dyd
            public final Object g(Object obj) {
                byte b3 = b;
                egd egdVar2 = egdVar;
                xm5 xm5Var2 = xm5Var;
                MediaMetadata mediaMetadata = (MediaMetadata) obj;
                switch (b3) {
                    case 0:
                        xm5Var2.D(egdVar2, mediaMetadata);
                        break;
                    default:
                        xm5Var2.D(egdVar2, mediaMetadata);
                        break;
                }
                return null;
            }
        }));
        nmlVarB3.a(null);
    }

    public final void l(Function1 function1) {
        int i2;
        synchronized (this.b) {
            dee deeVar = (dee) this.e;
            this.e = (dee) this.f;
            this.f = deeVar;
            cf2 cf2Var = (cf2) this.d;
            do {
                i2 = cf2Var.get();
            } while (!cf2Var.compareAndSet(i2, ((((i2 >>> 27) & 15) + 1) & 15) << 27));
            int i3 = deeVar.b;
            for (int i4 = 0; i4 < i3; i4++) {
                function1.invoke(deeVar.g(i4));
            }
            deeVar.d();
        }
    }

    public final void m(Map map) {
        map.size();
        for (h84 h84Var : map.values()) {
            ke4 ke4Var = (ke4) this.f;
            synchronized (h84Var) {
                byte b = h84Var.a;
                if (b == 1) {
                    for (int i2 = 0; i2 < h84Var.f.size(); i2++) {
                        ke4Var.c(h84Var.b, ((Integer) h84Var.f.get(i2)).intValue() != 0);
                    }
                } else if (b == 2) {
                    for (int i3 = 0; i3 < h84Var.f.size(); i3++) {
                        ke4Var.d(((Integer) h84Var.f.get(i3)).intValue(), h84Var.c, h84Var.d, h84Var.e, h84Var.b);
                    }
                } else if (b == 3) {
                    for (int i4 = 0; i4 < h84Var.f.size(); i4++) {
                        ke4Var.e(((Integer) h84Var.f.get(i4)).intValue(), h84Var.c, h84Var.d, h84Var.e, h84Var.b);
                    }
                } else if (b == 4) {
                    for (int i5 = 0; i5 < h84Var.f.size(); i5++) {
                        ke4Var.f(((Integer) h84Var.f.get(i5)).intValue(), h84Var.b);
                    }
                }
                h84Var.f.size();
                h84Var.f.clear();
            }
        }
        Locale locale = Locale.US;
    }

    public final boolean n() {
        return !i0l.g() && ((Boolean) ((kze) this.b).g()).booleanValue();
    }

    public final dsk o(int i2) {
        rt6 rt6Var;
        HashMap map = (HashMap) this.c;
        dsk dskVar = (dsk) map.get(Integer.valueOf(i2));
        if (dskVar != null) {
            return dskVar;
        }
        f1p f1pVar = (f1p) this.e;
        f1pVar.getClass();
        if (i2 == 0) {
            rt6Var = new rt6(DashMediaSource.Factory.class.asSubclass(ird.class), f1pVar, (byte) 0);
        } else if (i2 == 1) {
            rt6Var = new rt6(Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(ird.class), f1pVar, (byte) 1);
        } else if (i2 == 2) {
            rt6Var = new rt6(HlsMediaSource.Factory.class.asSubclass(ird.class), f1pVar, (byte) 2);
        } else if (i2 == 3) {
            rt6Var = new st6(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(ird.class), (byte) 0);
        } else {
            if (i2 != 4) {
                qp2.o(sko.i(i2, "Unrecognized contentType: "));
                return null;
            }
            rt6Var = new rt6(this, f1pVar, (byte) 3);
        }
        map.put(Integer.valueOf(i2), rt6Var);
        return rt6Var;
    }

    public final void p() {
        ie0 ie0Var;
        ie0 ie0Var2;
        s9 s9Var = (s9) this.d;
        SettingsManager settingsManager = (SettingsManager) this.b;
        o59 o59Var = (o59) this.f;
        if (o59Var == null || (ie0Var = o59Var.c) == null) {
            return;
        }
        long j2 = o59Var.d;
        if (j2 != -1) {
            long j3 = o59Var.i;
            if (j3 != -1) {
                long j4 = o59Var.j;
                if (j4 != -1) {
                    long j5 = o59Var.k;
                    if (ie0Var == ie0.g && o59Var.g == -1 && (ie0Var2 = o59Var.o) != null) {
                        ie0Var = ie0Var2;
                        j5 = -1;
                    }
                    x5f x5fVar = (x5f) this.c;
                    boolean z = o59Var.l;
                    boolean z2 = o59Var.m;
                    boolean z3 = o59Var.n;
                    long j6 = o59Var.a;
                    long j7 = j5;
                    long j8 = o59Var.e;
                    long j9 = o59Var.f;
                    long j10 = o59Var.g;
                    long j11 = o59Var.h;
                    if (x5fVar.h) {
                        zpa zpaVar = x5fVar.d;
                        x56 x56VarF = zpa.F();
                        qd0 qd0VarB = x56VarF.B(zpaVar);
                        he0 he0Var = new he0(2443, -1, 13);
                        he0Var.q(0, 1, ie0Var);
                        if (ie0Var == ie0.b) {
                            he0Var.r(1, 1, z);
                        }
                        he0Var.r(2, 1, z2);
                        he0Var.r(3, 1, z3);
                        he0Var.p(4, 1, j6);
                        he0Var.p(5, 1, j2);
                        if (j8 > -1) {
                            he0Var.p(6, 1, j8);
                        }
                        if (j9 > -1) {
                            he0Var.p(7, 1, j9);
                        }
                        if (j10 > -1) {
                            he0Var.p(8, 1, j10);
                        }
                        if (j11 > -1) {
                            he0Var.p(9, 1, j11);
                        }
                        he0Var.p(10, 1, j3);
                        he0Var.p(11, 1, j4);
                        if (j7 > -1) {
                            he0Var.p(12, 1, j7);
                        }
                        List list = (List) qd0VarB.n(39);
                        ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 39, vep.t(qd0VarB, 39, 1)) : new hf0(qd0VarB, 39, list)).add(he0Var);
                        x5fVar.U0(x56VarF);
                    }
                    settingsManager.H(s9Var);
                    this.f = null;
                    return;
                }
            }
        }
        if (!((Boolean) ((sy) this.e).get()).booleanValue() || ((o59) this.f) == null) {
            return;
        }
        settingsManager.H(s9Var);
        this.f = null;
    }

    public final void s(fji fjiVar) {
        LinkedList linkedList;
        int iIndexOf;
        mta mtaVar = (mta) ((HashMap) this.e).get(fjiVar);
        if (mtaVar != null) {
            WeakReference weakReference = mtaVar.a;
            ota otaVar = (ota) weakReference.get();
            if (otaVar != null) {
                otaVar.b();
            }
            ota otaVar2 = (ota) weakReference.get();
            if (otaVar2 == null || (iIndexOf = (linkedList = otaVar2.b).indexOf(nta.e)) < 0) {
                return;
            }
            linkedList.set(iIndexOf, nta.d);
        }
    }

    public final void t(CharSequence charSequence) {
        Activity activity = (Activity) this.b;
        db dbVar = (db) this.f;
        dbVar.f = null;
        h7f h7fVar = dbVar.e;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((cb) g7fVarH.next()).b();
        }
        ab abVar = (ab) this.c;
        if (abVar != null) {
            abVar.run(Boolean.FALSE);
            return;
        }
        if (activity.isFinishing()) {
            return;
        }
        qxh qxhVar = charSequence != null ? new qxh(charSequence) : null;
        gkj gkjVar = new gkj(false, false);
        gkjVar.a = null;
        gkjVar.b = null;
        gkjVar.c = null;
        gkjVar.d = null;
        gkjVar.e = null;
        gkjVar.f = null;
        gkjVar.g = null;
        gkjVar.h = null;
        gkjVar.i = null;
        gkjVar.j = null;
        gkjVar.k = 2132020155;
        gkjVar.l = 0;
        gkjVar.m = 2132021591;
        gkjVar.n = true;
        gkjVar.o = qxhVar;
        z77 z77Var = (z77) activity.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
        z77Var.getClass();
        z77Var.b(gkjVar, ijm.b);
    }

    public final String toString() {
        switch (this.a) {
            case 12:
                return "[Bus \"main-bus\"]";
            default:
                return super.toString();
        }
    }

    public final void u(int i2) {
        x5f x5fVar = (x5f) this.e;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.J(zpaVar).p(11, 1, i2);
            x5fVar.U0(x56VarF);
        }
        xf8.E0((ode) this.f, Boolean.valueOf(i2 > 0));
    }

    public final void v(Object obj) {
        f30 f30Var = (f30) this.d;
        if (obj == null) {
            t3p.q("Event to post must not be null.");
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            StringBuilder sb = new StringBuilder("Event bus ");
            sb.append(this);
            t14.g(sb, " accessed from non-main thread ", Looper.myLooper());
            return;
        }
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f;
        Set set = (Set) concurrentHashMap.get(cls);
        boolean z = false;
        if (set == null) {
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            linkedList.add(cls);
            while (!linkedList.isEmpty()) {
                Class cls2 = (Class) linkedList.remove(0);
                hashSet.add(cls2);
                Class superclass = cls2.getSuperclass();
                if (superclass != null) {
                    linkedList.add(superclass);
                }
            }
            set = (Set) concurrentHashMap.putIfAbsent(cls, hashSet);
            if (set == null) {
                set = hashSet;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Set set2 = (Set) ((ConcurrentHashMap) this.b).get((Class) it.next());
            if (set2 != null && !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    ((ConcurrentLinkedQueue) f30Var.get()).offer(new u14(obj, (dc8) it2.next()));
                }
                z = true;
            }
        }
        if (!z && !(obj instanceof pi6)) {
            v(new pi6(this, obj));
        }
        f30 f30Var2 = (f30) this.e;
        if (((Boolean) f30Var2.get()).booleanValue()) {
            return;
        }
        f30Var2.set(Boolean.TRUE);
        while (true) {
            try {
                u14 u14Var = (u14) ((ConcurrentLinkedQueue) f30Var.get()).poll();
                if (u14Var == null) {
                    return;
                }
                dc8 dc8Var = u14Var.b;
                if (dc8Var.d) {
                    i(u14Var.a, dc8Var);
                }
            } finally {
                f30Var2.set(Boolean.FALSE);
            }
        }
    }

    public final void w(String str, int i2, int i3, int i4, int i5, int i6) {
        if (i2 == 1) {
            ((ke4) this.f).c(str, i3 != 0);
            return;
        }
        if (i2 == 2) {
            ((ke4) this.f).d(i3, i4, i5, i6, str);
            return;
        }
        if (i2 == 3) {
            ((ke4) this.f).e(i3, i4, i5, i6, str);
        } else if (i2 == 4) {
            ((ke4) this.f).f(i3, str);
        } else {
            yt7.k(sko.i(i2, "Unknown histogram type "));
        }
    }

    public final void x(int i2, String str) {
        e(str, 4, i2, 0, 0, 0);
    }

    public final void y(ie0 ie0Var) {
        o59 o59Var = (o59) this.f;
        if (o59Var == null || o59Var.c != null) {
            return;
        }
        o59Var.c = ie0Var;
        p();
    }

    public final boolean z(float[] fArr) {
        nyf[] nyfVarArr = (nyf[]) this.e;
        if (nyfVarArr != null && nyfVarArr.length > 0) {
            for (nyf nyfVar : nyfVarArr) {
                nyfVar.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
