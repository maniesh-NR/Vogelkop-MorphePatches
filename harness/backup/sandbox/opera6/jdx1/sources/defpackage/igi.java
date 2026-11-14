package defpackage;

import android.R;
import android.app.NotificationManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.leanplum.Leanplum;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.custom_views.LayoutDirectionRelativeLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.GraphView;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;

/* loaded from: classes.dex */
public final class igi implements u9j {
    public static HashSet h;
    public static final ixh i = new ixh(32.0f);
    public static final Object j = new Object();
    public static final jxh k = new jxh(2131165903);
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public igi() {
        this.a = (byte) 7;
        this.b = new int[]{2131231156, 2131231154, 2131231080};
        this.c = new int[]{2131231104, 2131231139, 2131231111, 2131231106, 2131231107, 2131231110, 2131231109};
        this.d = new int[]{2131231153, 2131231155, 2131231097, 2131231149, 2131231150, 2131231151, 2131231152};
        this.e = new int[]{2131231129, 2131231095, 2131231128};
        this.f = new int[]{2131231147, 2131231157};
        this.g = new int[]{2131231083, 2131231089, 2131231084, 2131231090};
    }

    public igi(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 25:
                this.b = context.getApplicationContext();
                this.c = zya.e;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = new gn8();
                break;
            default:
                this.c = new HashMap();
                this.f = new wf7(this);
                this.g = new ag(this, (byte) 3);
                this.d = context;
                this.e = (NotificationManager) context.getSystemService("notification");
                this.b = new HashMap(vf7.values().length);
                for (vf7 vf7Var : vf7.values()) {
                    ((HashMap) this.b).put(vf7Var, new ArrayList());
                }
                break;
        }
    }

    public igi(View view, qb7 qb7Var, fd fdVar, ru9 ru9Var, ft3 ft3Var, x5f x5fVar) {
        this.a = (byte) 10;
        this.b = view;
        this.c = qb7Var;
        this.d = fdVar;
        this.e = ru9Var;
        this.f = ft3Var;
        this.g = x5fVar;
        view.invalidate();
        p37.A(view, this, null, new ol2(this, (byte) 2));
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [r8n, uc6] */
    public igi(ViewStub viewStub, bbf bbfVar, SettingsManager settingsManager, ydn ydnVar) {
        this.a = (byte) 15;
        this.g = new s9(this, (byte) 11);
        this.b = viewStub.getContext();
        this.c = bbfVar;
        this.d = settingsManager;
        this.e = ydnVar;
        viewStub.setLayoutResource(2131558639);
        View viewInflate = viewStub.inflate();
        int i2 = 2131362393;
        OperaListItem operaListItemJ = w1h.j(2131362393, viewInflate);
        if (operaListItemJ != null) {
            i2 = 2131363155;
            LayoutDirectionRelativeLayout layoutDirectionRelativeLayoutJ = w1h.j(2131363155, viewInflate);
            if (layoutDirectionRelativeLayoutJ != null) {
                i2 = 2131363895;
                StylingTextView stylingTextViewJ = w1h.j(2131363895, viewInflate);
                if (stylingTextViewJ != null) {
                    i2 = 2131364122;
                    StylingTextView stylingTextViewJ2 = w1h.j(2131364122, viewInflate);
                    if (stylingTextViewJ2 != null) {
                        i2 = 2131364123;
                        StylingTextView stylingTextViewJ3 = w1h.j(2131364123, viewInflate);
                        if (stylingTextViewJ3 != null) {
                            i2 = 2131364124;
                            GraphView graphViewJ = w1h.j(2131364124, viewInflate);
                            if (graphViewJ != null) {
                                i2 = 2131364268;
                                MaterialButton materialButtonJ = w1h.j(2131364268, viewInflate);
                                if (materialButtonJ != null) {
                                    i2 = 2131364466;
                                    if (w1h.j(2131364466, viewInflate) != null) {
                                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                                        this.f = new y83(linearLayout, operaListItemJ, layoutDirectionRelativeLayoutJ, stylingTextViewJ, stylingTextViewJ2, stylingTextViewJ3, graphViewJ, materialButtonJ);
                                        materialButtonJ.setOnClickListener(new yk4(this, (byte) 10));
                                        operaListItemJ.u = new jl4(this, (byte) 27);
                                        final byte b = 0;
                                        r8n r8nVar = new r8n(this) { // from class: uc6
                                            public final /* synthetic */ igi b;

                                            {
                                                this.b = this;
                                            }

                                            public final void a(View view) {
                                                byte b2 = b;
                                                igi igiVar = this.b;
                                                switch (b2) {
                                                    case 0:
                                                        igiVar.C0(((SettingsManager) igiVar.d).i("compression"));
                                                        break;
                                                    default:
                                                        GraphView graphView = (GraphView) ((y83) igiVar.f).h;
                                                        Context context = graphView.getContext();
                                                        graphView.i = f03.u(2130969831, context, 2131099816);
                                                        graphView.invalidate();
                                                        graphView.h = f03.u(2130969829, context, 2131099816);
                                                        graphView.a();
                                                        break;
                                                }
                                            }
                                        };
                                        l5b l5bVar = q9n.c;
                                        dll dllVarV = hjf.v(operaListItemJ.getContext());
                                        if (dllVarV != null) {
                                            u8n.b(dllVarV, operaListItemJ, r8nVar);
                                        }
                                        final byte b2 = 1;
                                        ?? r10 = new r8n(this) { // from class: uc6
                                            public final /* synthetic */ igi b;

                                            {
                                                this.b = this;
                                            }

                                            public final void a(View view) {
                                                byte b22 = b2;
                                                igi igiVar = this.b;
                                                switch (b22) {
                                                    case 0:
                                                        igiVar.C0(((SettingsManager) igiVar.d).i("compression"));
                                                        break;
                                                    default:
                                                        GraphView graphView = (GraphView) ((y83) igiVar.f).h;
                                                        Context context = graphView.getContext();
                                                        graphView.i = f03.u(2130969831, context, 2131099816);
                                                        graphView.invalidate();
                                                        graphView.h = f03.u(2130969829, context, 2131099816);
                                                        graphView.a();
                                                        break;
                                                }
                                            }
                                        };
                                        q9n.e(graphViewJ, (r8n) r10);
                                        r10.a(graphViewJ);
                                        q9n.g(linearLayout, new tu4(new Runnable(this) { // from class: vc6
                                            public final /* synthetic */ igi b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b3 = b;
                                                igi igiVar = this.b;
                                                switch (b3) {
                                                    case 0:
                                                        ((SettingsManager) igiVar.d).a((s9) igiVar.g);
                                                        igiVar.A0();
                                                        break;
                                                    default:
                                                        ((SettingsManager) igiVar.d).T((s9) igiVar.g);
                                                        break;
                                                }
                                            }
                                        }, new Runnable(this) { // from class: vc6
                                            public final /* synthetic */ igi b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b3 = b2;
                                                igi igiVar = this.b;
                                                switch (b3) {
                                                    case 0:
                                                        ((SettingsManager) igiVar.d).a((s9) igiVar.g);
                                                        igiVar.A0();
                                                        break;
                                                    default:
                                                        ((SettingsManager) igiVar.d).T((s9) igiVar.g);
                                                        break;
                                                }
                                            }
                                        }, (byte) 7));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public igi(bnd bndVar) {
        this.a = (byte) 27;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new ArrayList();
        this.b = new Bundle(bndVar.a);
        this.c = bndVar.c();
        this.d = bndVar.b();
        this.e = bndVar.a();
        this.f = bndVar.c;
        this.g = bndVar.b;
    }

    public igi(BrowserActivity browserActivity, BrowserActivity browserActivity2, dll dllVar, jv3 jv3Var) {
        this.a = (byte) 6;
        this.b = browserActivity;
        this.c = dllVar;
        this.d = jv3Var;
        this.e = new sw0(this, browserActivity2, new f08(0));
        this.f = new rw0(this, (byte) 0);
        this.g = l08.a;
    }

    public igi(BrowserActivity browserActivity, BrowserActivity browserActivity2, pt3 pt3Var, rf7 rf7Var, orm ormVar) {
        this.a = (byte) 18;
        ag agVar = new ag(this, (byte) 2);
        this.f = agVar;
        this.b = browserActivity;
        this.c = browserActivity2;
        this.d = pt3Var;
        this.e = rf7Var;
        this.g = ormVar;
        rf7Var.b(agVar);
    }

    public igi(SettingsManager settingsManager, yk6 yk6Var) {
        this.a = (byte) 8;
        this.b = settingsManager;
        this.c = yk6Var;
        this.d = z4c.b(new oc2(this, (byte) 0));
        this.e = new v9j(this);
        this.f = new kze("unknown");
        this.g = e82.E(new String[]{"ai_assistant_menu_shortcut", "ai_assistant_ask_aria"});
    }

    public igi(dql dqlVar) {
        this.a = (byte) 16;
        this.b = dqlVar;
        a1b a1bVar = h1b.b;
        this.c = csh.e;
        this.d = hsh.d;
    }

    public igi(dx3 dx3Var, umi umiVar, sf7 sf7Var, x5f x5fVar, re7 re7Var, vwh vwhVar) {
        this.a = (byte) 17;
        this.b = dx3Var;
        this.c = umiVar;
        this.d = sf7Var;
        this.e = x5fVar;
        this.f = re7Var;
        this.g = vwhVar;
        af7 af7Var = new af7(this, (byte) 0);
        int[][] iArr = lg7.a;
        if (r9n.X(dx3Var)) {
            af7Var.run(Boolean.TRUE);
        } else {
            f03.U(dx3Var.j, "android.permission.WRITE_EXTERNAL_STORAGE", new dz4(af7Var));
        }
    }

    public igi(fe5 fe5Var, ImageView imageView, iv7 iv7Var, pde pdeVar, tsd tsdVar, wzg wzgVar) {
        this.a = (byte) 1;
        this.b = imageView;
        this.c = iv7Var;
        this.d = pdeVar;
        this.e = wzgVar;
        this.f = imageView.getContext();
        wnm wnmVarX = xf8.X(uu7.c, iv7Var.f, pdeVar, tsdVar, new j04(this, (byte) 8));
        this.g = wnmVarX;
        pc5 pc5Var = new pc5(this, (byte) 9);
        dll dllVarS = q9n.s(imageView);
        if (dllVarS != null) {
            u8n.b(dllVarS, imageView, pc5Var);
        }
        wnmVarX.j(fe5Var, new cl4(new tu7(this, (byte) 0), (byte) 13));
        imageView.setOnClickListener(new yk4(this, (byte) 15));
    }

    public igi(fe5 fe5Var, kze kzeVar, Lazy lazy, yqk yqkVar, brk brkVar, zqk zqkVar) {
        this.a = (byte) 21;
        this.b = lazy;
        this.c = yqkVar;
        this.d = brkVar;
        this.e = zqkVar;
        this.f = new ode(null);
        kzeVar.j(fe5Var, new cl4(new jv7(this, (byte) 0), (byte) 15));
    }

    public igi(hx5 hx5Var, fg6 fg6Var, a64 a64Var, r94 r94Var) {
        this.a = (byte) 9;
        this.b = hx5Var;
        this.c = fg6Var;
        this.d = a64Var;
        this.e = r94Var;
    }

    public /* synthetic */ igi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public igi(String str, String str2) {
        this.a = (byte) 27;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new ArrayList();
        Bundle bundle = new Bundle();
        this.b = bundle;
        if (str == null) {
            t3p.q("id must not be null");
            throw null;
        }
        bundle.putString("id", str);
        if (str2 != null) {
            bundle.putString("name", str2);
        } else {
            t3p.q("name must not be null");
            throw null;
        }
    }

    public igi(k6l k6lVar, pt1 pt1Var, BooleanSupplier booleanSupplier, nwf nwfVar, Runnable runnable, kze kzeVar) {
        this.a = (byte) 28;
        this.e = new t77(this, (byte) 4);
        this.b = k6lVar;
        this.c = pt1Var;
        this.d = booleanSupplier;
        View.OnClickListener dv2Var = new dv2(this, nwfVar, runnable, (byte) 4);
        ((StylingImageButton) pt1Var.d).setOnClickListener(dv2Var);
        ((StylingImageButton) pt1Var.e).setOnClickListener(dv2Var);
        ((StylingImageButton) pt1Var.f).setOnClickListener(dv2Var);
        this.f = kzeVar;
        pt1Var.c.setOnClickListener(dv2Var);
        q9n.g((LinearLayout) pt1Var.g, new tu4(new dud(this, kzeVar, (byte) 0), new dud(this, kzeVar, (byte) 1), (byte) 7));
    }

    public igi(qb7 qb7Var, vj5 vj5Var, lh4 lh4Var) {
        this.a = (byte) 14;
        this.g = qb7Var;
        this.b = vj5Var;
        this.c = lh4Var;
        this.d = Collections.synchronizedList(new ArrayList());
        this.e = Collections.synchronizedList(new ArrayList());
        ((LinkedHashSet) qb7Var.c).add(this);
        this.f = new vr9((Runnable) new lb4(this, (byte) 26), vj5Var.q.size() + 2);
        ArrayList arrayList = vj5Var.q;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            v5j v5jVar = (y5j) obj;
            c37 c37Var = (c37) qb7Var.a;
            String str = vj5Var.p;
            uk5 uk5Var = new uk5(this, (byte) 2);
            if (v5jVar != null) {
                String str2 = ((y5j) v5jVar).a;
                if (v5jVar instanceof x5j) {
                    h58 h58Var = tk5.a;
                    ArrayList arrayList2 = new ArrayList(k95.o(h58Var, 10));
                    Iterator it = h58Var.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((g7j) it.next()).d);
                    }
                    uk5Var.run(arrayList2.contains(((x5j) v5jVar).b) ? new sw7(v5jVar) : new rw7(new hjb(str2)));
                } else if (v5jVar instanceof r5j) {
                    ((xnh) c37Var.a).b(new k3(uk5Var, c37Var, v5jVar, (byte) 27));
                } else if (v5jVar instanceof w5j) {
                    h58 h58Var2 = tk5.b;
                    ArrayList arrayList3 = new ArrayList(k95.o(h58Var2, 10));
                    Iterator it2 = h58Var2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((f7j) it2.next()).b);
                    }
                    uk5Var.run(arrayList3.contains(((w5j) v5jVar).b) ? new sw7(v5jVar) : new rw7(new hjb(str2)));
                } else if (v5jVar instanceof u5j) {
                    u5j u5jVar = (u5j) v5jVar;
                    if (u5jVar instanceof s5j) {
                        new bue((vzk) c37Var.b, str, (s5j) v5jVar, new iu2(uk5Var, (byte) 20));
                    } else {
                        if (!(u5jVar instanceof t5j)) {
                            h9o.p();
                            throw null;
                        }
                        uk5Var.run(new sw7(v5jVar));
                    }
                } else if (v5jVar instanceof v5j) {
                    h58 h58Var3 = tk5.c;
                    ArrayList arrayList4 = new ArrayList(k95.o(h58Var3, 10));
                    Iterator it3 = h58Var3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((o7j) it3.next()).b);
                    }
                    uk5Var.run(arrayList4.contains(v5jVar.b) ? new sw7(v5jVar) : new rw7(new hjb(str2)));
                }
            }
            h9o.p();
            throw null;
        }
        zy9 zy9Var = (zy9) ((qb7) this.g).b;
        vj5 vj5Var2 = (vj5) this.b;
        ffb ffbVar = vj5Var2.r;
        ffb ffbVar2 = vj5Var2.s;
        uk5 uk5Var2 = new uk5(this, (byte) 0);
        ArrayList arrayListV = CollectionsKt.V(ffbVar2, ffbVar);
        ArrayList arrayList5 = new ArrayList(k95.o(arrayListV, 10));
        int size2 = arrayListV.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayListV.get(i3);
            i3++;
            arrayList5.add(vq8.m((String) obj2));
        }
        Set setN0 = CollectionsKt.n0(arrayList5);
        if (setN0.isEmpty()) {
            uk5Var2.run(new sw7(Unit.a));
        } else {
            qln qlnVar = (qln) ((Lazy) zy9Var.a).get();
            s9i s9iVar = new s9i(setN0, ffbVar2, uk5Var2, zy9Var, (byte) 9, false);
            vq8 vq8Var = (vq8) qlnVar.f.e;
            vq8Var.getClass();
            new q59(((qi5) vq8Var.i).c, new s2g(vq8Var, setN0, new cln(vq8Var, false, s9iVar), (byte) 12));
        }
        Leanplum.addStartResponseHandler(new rk5(new uk5(this, (byte) 1), ((vj5) this.b).p));
    }

    public igi(r49 r49Var, mxd mxdVar, l7h l7hVar, l7h l7hVar2, y49 y49Var) {
        this.a = (byte) 24;
        r49Var.a();
        Rpc rpc = new Rpc(r49Var.a);
        this.b = r49Var;
        this.c = mxdVar;
        this.d = rpc;
        this.e = l7hVar;
        this.f = l7hVar2;
        this.g = y49Var;
    }

    public igi(u7k u7kVar, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.a = (byte) 4;
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = u7kVar;
        this.b = map;
        this.c = hashSet;
        this.d = hashSet2;
    }

    public igi(umi umiVar, ikc ikcVar, bml bmlVar, ode odeVar, ode odeVar2, ode odeVar3, onc oncVar, ode odeVar4, bl6 bl6Var, b59 b59Var) {
        this.a = (byte) 2;
        this.b = new kze(Boolean.FALSE);
        this.c = oncVar;
        this.d = new iv((Object) umiVar, (Runnable) bl6Var, (byte) 9);
        this.f = b59Var;
        this.e = new s14(odeVar4, ikcVar, odeVar3, odeVar, odeVar2, bmlVar, new y0a(this, (byte) 11));
    }

    public igi(xw8 xw8Var, rv8 rv8Var) {
        this.a = (byte) 22;
        ow8 ow8Var = xw8Var.h;
        this.g = xw8Var;
        this.b = rv8Var;
        RecyclerView recyclerView = xw8Var.g;
        recyclerView.getContext();
        byte b = rv8Var.a;
        int iOrdinal = rv8Var.ordinal();
        if (iOrdinal == 0) {
            uw8 uw8Var = new uw8(1, false);
            this.c = uw8Var;
            qv8 qv8Var = new qv8(new Point(0, 0), 1, new w4a(), (byte) 1);
            this.d = qv8Var;
            recyclerView.m(qv8Var);
            z6b z6bVar = new z6b((LinearLayoutManager) uw8Var, new nw8(xw8Var, (byte) 1));
            this.e = z6bVar;
            recyclerView.o(z6bVar);
            this.f = null;
            ow8Var.Z(b, new w4a());
            return;
        }
        if (iOrdinal != 1) {
            throw new UnsupportedOperationException("Layout " + rv8Var + " is not supported");
        }
        sw8 sw8Var = new sw8(b);
        this.c = sw8Var;
        qwj qwjVar = new qwj(recyclerView, ow8Var, xw8Var.u, b);
        qwjVar.b = true;
        qwjVar.a = true;
        sw8Var.g = qwjVar;
        qv8 qv8Var2 = new qv8(new Point(0, 0), b, qwjVar, (byte) 0);
        this.d = qv8Var2;
        recyclerView.m(qv8Var2);
        z6b z6bVar2 = new z6b(sw8Var, new nw8(xw8Var, (byte) 1));
        this.e = z6bVar2;
        recyclerView.o(z6bVar2);
        tw8 tw8Var = new tw8(ow8Var, recyclerView);
        this.f = tw8Var;
        ow8Var.registerAdapterDataObserver(tw8Var);
        ow8Var.Z(b, qwjVar);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [r8n, toc] */
    /* JADX WARN: Type inference failed for: r7v3, types: [r8n, toc] */
    public igi(y83 y83Var, Function0 function0, pkc pkcVar, noc nocVar) {
        this.a = (byte) 3;
        this.b = y83Var;
        this.c = function0;
        this.d = pkcVar;
        this.e = nocVar;
        this.f = z4c.b(new q4b(this, (byte) 16));
        final ConstraintLayout constraintLayout = (ConstraintLayout) ((or2) y83Var.c).c;
        final byte b = 0;
        ?? r7 = new r8n() { // from class: toc
            public final void a(View view) {
                byte b2 = b;
                ConstraintLayout constraintLayout2 = constraintLayout;
                switch (b2) {
                    case 0:
                        constraintLayout2.setBackground(w8h.u(2131232742, constraintLayout2.getContext()));
                        break;
                    default:
                        constraintLayout2.setBackground(w8h.u(2131232743, constraintLayout2.getContext()));
                        break;
                }
            }
        };
        q9n.e(constraintLayout, (r8n) r7);
        r7.a(constraintLayout);
        final ConstraintLayout constraintLayout2 = (ConstraintLayout) ((or2) y83Var.g).c;
        final byte b2 = 1;
        ?? r72 = new r8n() { // from class: toc
            public final void a(View view) {
                byte b22 = b2;
                ConstraintLayout constraintLayout22 = constraintLayout2;
                switch (b22) {
                    case 0:
                        constraintLayout22.setBackground(w8h.u(2131232742, constraintLayout22.getContext()));
                        break;
                    default:
                        constraintLayout22.setBackground(w8h.u(2131232743, constraintLayout22.getContext()));
                        break;
                }
            }
        };
        q9n.e(constraintLayout2, (r8n) r72);
        r72.a(constraintLayout2);
        or2 or2Var = (or2) y83Var.d;
        ConstraintLayout constraintLayout3 = (ConstraintLayout) or2Var.c;
        lzb lzbVar = new lzb(or2Var, (byte) 4);
        q9n.e(constraintLayout3, lzbVar);
        lzbVar.a(constraintLayout3);
        ConstraintLayout constraintLayout4 = (ConstraintLayout) ((ov0) or2Var.e).b;
        ViewGroup.LayoutParams layoutParams = constraintLayout4.getLayoutParams();
        if (layoutParams == null) {
            t3p.q("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            throw null;
        }
        ((jo5) layoutParams).setMarginEnd(f03.w(2130970791, constraintLayout4.getContext(), 2131167524));
        constraintLayout4.setLayoutParams(layoutParams);
        FrameLayout frameLayout = (FrameLayout) y83Var.b;
        uoc uocVar = new uoc(this);
        nocVar.b.c(frameLayout, nocVar);
        nocVar.d.put(frameLayout, uocVar);
    }

    public igi(ze7 ze7Var, ChipGroup chipGroup, LinearLayout linearLayout) {
        this.a = (byte) 23;
        HashMap map = new HashMap();
        this.b = map;
        this.e = new HashSet();
        this.c = ze7Var;
        this.d = chipGroup;
        this.f = linearLayout;
        map.put(kg7.i, chipGroup.findViewById(2131363188));
        map.put(kg7.h, chipGroup.findViewById(2131365002));
        map.put(kg7.g, chipGroup.findViewById(2131362071));
        map.put(kg7.k, chipGroup.findViewById(2131363870));
        map.put(kg7.j, chipGroup.findViewById(2131362060));
        map.put(kg7.n, chipGroup.findViewById(2131362062));
        map.put(kg7.l, chipGroup.findViewById(2131362558));
        map.put(kg7.f, chipGroup.findViewById(2131363789));
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Chip) it.next()).setOnTouchListener(new ov7(this));
        }
        HashSet hashSetH = ((ze7) this.c).H();
        HashSet hashSet = (HashSet) this.e;
        hashSet.clear();
        hashSet.addAll(hashSetH);
        kg7 kg7Var = (kg7) this.g;
        if (kg7Var != null) {
            hashSet.add(kg7Var);
        }
        I0();
        ChipGroup chipGroup2 = (ChipGroup) this.d;
        chipGroup2.getClass();
        c37 c37Var = new c37();
        c37Var.b = chipGroup2;
        c37Var.a = this;
        chipGroup2.g = c37Var;
    }

    public static void E(iei ieiVar, String str) {
        hfi hfiVarD = ieiVar.a.D(str);
        if (hfiVarD == null || !(hfiVarD instanceof iei) || hfiVarD == ieiVar) {
            return;
        }
        iei ieiVar2 = (iei) hfiVarD;
        if (ieiVar.i == null) {
            ieiVar.i = ieiVar2.i;
        }
        if (ieiVar.j == null) {
            ieiVar.j = ieiVar2.j;
        }
        if (ieiVar.k == 0) {
            ieiVar.k = ieiVar2.k;
        }
        if (ieiVar.h.isEmpty()) {
            ieiVar.h = ieiVar2.h;
        }
        try {
            if (ieiVar instanceof ifi) {
                ifi ifiVar = (ifi) ieiVar;
                ifi ifiVar2 = (ifi) hfiVarD;
                if (ifiVar.m == null) {
                    ifiVar.m = ifiVar2.m;
                }
                if (ifiVar.n == null) {
                    ifiVar.n = ifiVar2.n;
                }
                if (ifiVar.o == null) {
                    ifiVar.o = ifiVar2.o;
                }
                if (ifiVar.p == null) {
                    ifiVar.p = ifiVar2.p;
                }
            } else {
                F((mfi) ieiVar, (mfi) hfiVarD);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = ieiVar2.l;
        if (str2 != null) {
            E(ieiVar, str2);
        }
    }

    public static void F(mfi mfiVar, mfi mfiVar2) {
        if (mfiVar.m == null) {
            mfiVar.m = mfiVar2.m;
        }
        if (mfiVar.n == null) {
            mfiVar.n = mfiVar2.n;
        }
        if (mfiVar.o == null) {
            mfiVar.o = mfiVar2.o;
        }
        if (mfiVar.p == null) {
            mfiVar.p = mfiVar2.p;
        }
        if (mfiVar.q == null) {
            mfiVar.q = mfiVar2.q;
        }
    }

    public static void G(vei veiVar, String str) {
        hfi hfiVarD = veiVar.a.D(str);
        if (hfiVarD == null || !(hfiVarD instanceof vei) || hfiVarD == veiVar) {
            return;
        }
        vei veiVar2 = (vei) hfiVarD;
        if (veiVar.p == null) {
            veiVar.p = veiVar2.p;
        }
        if (veiVar.q == null) {
            veiVar.q = veiVar2.q;
        }
        if (veiVar.r == null) {
            veiVar.r = veiVar2.r;
        }
        if (veiVar.s == null) {
            veiVar.s = veiVar2.s;
        }
        if (veiVar.t == null) {
            veiVar.t = veiVar2.t;
        }
        if (veiVar.u == null) {
            veiVar.u = veiVar2.u;
        }
        if (veiVar.v == null) {
            veiVar.v = veiVar2.v;
        }
        if (veiVar.i.isEmpty()) {
            veiVar.i = veiVar2.i;
        }
        if (veiVar.o == null) {
            veiVar.o = veiVar2.o;
        }
        if (veiVar.n == null) {
            veiVar.n = veiVar2.n;
        }
        String str2 = veiVar2.w;
        if (str2 != null) {
            G(veiVar, str2);
        }
    }

    public static jrd H(qi8 qi8Var, h1b h1bVar, jrd jrdVar, dql dqlVar) {
        gql currentTimeline = qi8Var.getCurrentTimeline();
        int currentPeriodIndex = qi8Var.getCurrentPeriodIndex();
        Object objL = currentTimeline.p() ? null : currentTimeline.l(currentPeriodIndex);
        int iB = (qi8Var.isPlayingAd() || currentTimeline.p()) ? -1 : currentTimeline.f(currentPeriodIndex, dqlVar, false).b(tym.N(qi8Var.getCurrentPosition()) - dqlVar.e);
        for (int i2 = 0; i2 < h1bVar.size(); i2++) {
            jrd jrdVar2 = (jrd) h1bVar.get(i2);
            if (P(jrdVar2, objL, qi8Var.isPlayingAd(), qi8Var.getCurrentAdGroupIndex(), qi8Var.getCurrentAdIndexInAdGroup(), iB)) {
                return jrdVar2;
            }
        }
        if (h1bVar.isEmpty() && jrdVar != null && P(jrdVar, objL, qi8Var.isPlayingAd(), qi8Var.getCurrentAdGroupIndex(), qi8Var.getCurrentAdIndexInAdGroup(), iB)) {
            return jrdVar;
        }
        return null;
    }

    public static LayerDrawable M(ResourceManagerInternal resourceManagerInternal, Context context, int i2) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable drawableC = resourceManagerInternal.c(2131231143, context);
        Drawable drawableC2 = resourceManagerInternal.c(2131231144, context);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static boolean P(jrd jrdVar, Object obj, boolean z, int i2, int i3, int i4) {
        Object obj2 = jrdVar.a;
        int i5 = jrdVar.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i5 == i2 && jrdVar.c == i3) {
            return true;
        }
        return !z && i5 == -1 && jrdVar.e == i4;
    }

    public static boolean Q(bfi bfiVar, long j2) {
        return (bfiVar.a & j2) != 0;
    }

    public static Path T(wei weiVar) {
        Path path = new Path();
        float[] fArr = weiVar.o;
        path.moveTo(fArr[0], fArr[1]);
        int i2 = 2;
        while (true) {
            float[] fArr2 = weiVar.o;
            if (i2 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i2], fArr2[i2 + 1]);
            i2 += 2;
        }
        if (weiVar instanceof xei) {
            path.close();
        }
        if (weiVar.h == null) {
            weiVar.h = n(path);
        }
        return path;
    }

    public static void e(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, uei ueiVar) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            ueiVar.e(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(f5 % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = (f - f6) / 2.0d;
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (dCos * d2) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (fAbs * dSqrt);
            fAbs2 = (float) (dSqrt * fAbs2);
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = fAbs2;
        double d17 = ((d15 * d4) / d16) * dSqrt2;
        double d18 = dSqrt2 * (-((d16 * d3) / d15));
        double d19 = ((dCos * d17) - (dSin * d18)) + ((f + f6) / 2.0d);
        double d20 = (dCos * d18) + (dSin * d17) + ((f2 + f7) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double dAcos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = ((d22 * d24) + (d21 * d23)) / Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double dAcos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (dSqrt3 < -1.0d ? 3.141592653589793d : dSqrt3 > 1.0d ? 0.0d : Math.acos(dSqrt3));
        if (z2) {
            if (dAcos2 < 0.0d) {
                dAcos2 += 6.283185307179586d;
            }
        } else if (dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        }
        double d26 = dAcos2 % 6.283185307179586d;
        double d27 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d26) * 2.0d) / 3.141592653589793d);
        double d28 = d26 / iCeil;
        double d29 = d28 / 2.0d;
        double dSin2 = (Math.sin(d29) * 1.3333333333333333d) / (Math.cos(d29) + 1.0d);
        int i2 = iCeil * 6;
        float[] fArr = new float[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < iCeil) {
            double d30 = d27;
            double d31 = (i3 * d28) + d30;
            double dCos2 = Math.cos(d31);
            double dSin3 = Math.sin(d31);
            int i5 = i3;
            int i6 = i4;
            fArr[i6] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i4 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d32 = d31 + d28;
            double dCos3 = Math.cos(d32);
            double dSin4 = Math.sin(d32);
            fArr[i6 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i6 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i6 + 4] = (float) dCos3;
            i4 = i6 + 6;
            fArr[i6 + 5] = (float) dSin4;
            i3 = i5 + 1;
            d27 = d30;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i2 - 2] = f6;
        fArr[i2 - 1] = f7;
        for (int i7 = 0; i7 < i2; i7 += 6) {
            ueiVar.c(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    public static boolean f(int i2, int[] iArr) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(or2 r10, tmc r11, kotlin.jvm.functions.Function1 r12, defpackage.voc r13) {
        /*
            android.view.View r0 = r10.c
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            if (r11 == 0) goto La
            boolean r2 = r11.e
            goto Lb
        La:
            r2 = r1
        Lb:
            java.lang.Object r3 = r10.e
            ov0 r3 = (ov0) r3
            java.lang.Object r4 = r10.b
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r5 = r10.f
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.setEnabled(r2)
            r6 = 0
            if (r11 == 0) goto L32
            if (r2 == 0) goto L21
            r7 = r11
            goto L22
        L21:
            r7 = r6
        L22:
            if (r7 == 0) goto L32
            jkc r8 = new jkc
            r9 = 6
            r8.<init>(r12, r7, r9)
            sma r12 = new sma
            r7 = 15
            r12.<init>(r8, r7)
            goto L33
        L32:
            r12 = r6
        L33:
            r0.setOnClickListener(r12)
            r5.setEnabled(r2)
            java.lang.String r12 = r13.a
            r5.setText(r12)
            if (r11 == 0) goto L43
            java.lang.String r12 = r11.c
            goto L44
        L43:
            r12 = r6
        L44:
            if (r12 == 0) goto L48
            r13 = 1
            goto L49
        L48:
            r13 = r1
        L49:
            r4.setText(r12)
            r12 = 8
            if (r13 == 0) goto L52
            r0 = r1
            goto L53
        L52:
            r0 = r12
        L53:
            r4.setVisibility(r0)
            java.lang.Object r10 = r10.d
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            if (r13 != 0) goto L5e
            r13 = r1
            goto L5f
        L5e:
            r13 = r12
        L5f:
            r10.setVisibility(r13)
            if (r11 == 0) goto L6b
            if (r2 != 0) goto L67
            r11 = r6
        L67:
            if (r11 == 0) goto L6b
            umc r6 = r11.g
        L6b:
            java.lang.Object r10 = r3.d
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            umc r11 = umc.a
            if (r6 != r11) goto L75
            r11 = r1
            goto L76
        L75:
            r11 = r12
        L76:
            r10.setVisibility(r11)
            java.lang.Object r10 = r3.c
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            umc r11 = umc.b
            if (r6 == r11) goto L82
            r1 = r12
        L82:
            r10.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igi.g(or2, tmc, kotlin.jvm.functions.Function1, voc):void");
    }

    public static ree n(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new ree(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r7 == 9) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r5
      0x007a: PHI (r5v2 float) = (r5v1 float), (r5v3 float) binds: [B:30:0x006c, B:33:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix p(defpackage.ree r9, defpackage.ree r10, defpackage.iwg r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L87
            hwg r1 = r11.a
            if (r1 == 0) goto L87
            float r2 = r9.d
            float r3 = r10.d
            float r2 = r2 / r3
            float r3 = r9.e
            float r4 = r10.e
            float r3 = r3 / r4
            float r4 = r10.b
            float r4 = -r4
            float r5 = r10.c
            float r5 = -r5
            iwg r6 = defpackage.iwg.c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L31
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L31:
            int r11 = r11.b
            r6 = 2
            if (r11 != r6) goto L3b
            float r11 = java.lang.Math.max(r2, r3)
            goto L3f
        L3b:
            float r11 = java.lang.Math.min(r2, r3)
        L3f:
            float r2 = r9.d
            float r2 = r2 / r11
            float r3 = r9.e
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L63
            r6 = 3
            if (r7 == r6) goto L5e
            r6 = 5
            if (r7 == r6) goto L63
            r6 = 6
            if (r7 == r6) goto L5e
            r6 = 8
            if (r7 == r6) goto L63
            r6 = 9
            if (r7 != r6) goto L68
        L5e:
            float r6 = r10.d
            float r6 = r6 - r2
        L61:
            float r4 = r4 - r6
            goto L68
        L63:
            float r6 = r10.d
            float r6 = r6 - r2
            float r6 = r6 / r8
            goto L61
        L68:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L75;
                case 5: goto L75;
                case 6: goto L75;
                case 7: goto L70;
                case 8: goto L70;
                case 9: goto L70;
                default: goto L6f;
            }
        L6f:
            goto L7a
        L70:
            float r10 = r10.e
            float r10 = r10 - r3
        L73:
            float r5 = r5 - r10
            goto L7a
        L75:
            float r10 = r10.e
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L73
        L7a:
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igi.p(ree, ree, iwg):android.graphics.Matrix");
    }

    public static void q0(ggi ggiVar, boolean z, kfi kfiVar) {
        int i2;
        bfi bfiVar = ggiVar.a;
        float fFloatValue = (z ? bfiVar.c : bfiVar.e).floatValue();
        if (kfiVar instanceof eei) {
            i2 = ((eei) kfiVar).a;
        } else if (!(kfiVar instanceof fei)) {
            return;
        } else {
            i2 = ggiVar.a.k.a;
        }
        int iV = v(fFloatValue, i2);
        if (z) {
            ggiVar.d.setColor(iV);
        } else {
            ggiVar.e.setColor(iV);
        }
    }

    public static void r0(y83 y83Var, boolean z) {
        ((TextView) ((or2) y83Var.c).b).setSelected(z);
        ((TextView) ((or2) y83Var.g).b).setSelected(z);
        ((TextView) ((or2) y83Var.d).b).setSelected(z);
    }

    public static void s0(Drawable drawable, int i2, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = AppCompatDrawableManager.a;
        }
        drawableMutate.setColorFilter(AppCompatDrawableManager.d(i2, mode));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface t(int r5, java.lang.String r6, java.lang.Integer r7) {
        /*
            r0 = 0
            r1 = 1
            r2 = 2
            if (r5 != r2) goto L7
            r5 = r1
            goto L8
        L7:
            r5 = r0
        L8:
            int r7 = r7.intValue()
            r3 = 500(0x1f4, float:7.0E-43)
            r4 = 3
            if (r7 <= r3) goto L17
            if (r5 == 0) goto L15
            r5 = r4
            goto L1c
        L15:
            r5 = r1
            goto L1c
        L17:
            if (r5 == 0) goto L1b
            r5 = r2
            goto L1c
        L1b:
            r5 = r0
        L1c:
            r6.getClass()
            int r7 = r6.hashCode()
            r3 = -1
            switch(r7) {
                case -1536685117: goto L50;
                case -1431958525: goto L46;
                case -1081737434: goto L3c;
                case 109326717: goto L32;
                case 1126973893: goto L28;
                default: goto L27;
            }
        L27:
            goto L58
        L28:
            java.lang.String r7 = "cursive"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L58
            r0 = 4
            goto L59
        L32:
            java.lang.String r7 = "serif"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L58
            r0 = r4
            goto L59
        L3c:
            java.lang.String r7 = "fantasy"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L58
            r0 = r2
            goto L59
        L46:
            java.lang.String r7 = "monospace"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L58
            r0 = r1
            goto L59
        L50:
            java.lang.String r7 = "sans-serif"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L59
        L58:
            r0 = r3
        L59:
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L73;
                case 2: goto L6c;
                case 3: goto L65;
                case 4: goto L5e;
                default: goto L5c;
            }
        L5c:
            r5 = 0
            return r5
        L5e:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            return r5
        L65:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            return r5
        L6c:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            return r5
        L73:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            return r5
        L7a:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igi.t(int, java.lang.String, java.lang.Integer):android.graphics.Typeface");
    }

    public static void u0(Context context, BrowserActivity browserActivity, vwh vwhVar, rf7 rf7Var, re7 re7Var, orm ormVar) {
        int i2;
        jc0 jc0Var;
        String strF = re7Var.f();
        String[] strArr = aik.a;
        String string = context.getString(2132018612, ehi.a(strF));
        boolean zN = rf7.n(context, re7Var, true);
        if (!zN) {
            i2 = 2132018613;
            jc0Var = jc0.d;
        } else if (rf7.g(re7Var).d()) {
            i2 = 2132020519;
            jc0Var = jc0.e;
        } else {
            i2 = 2132018629;
            jc0Var = jc0.c;
        }
        vwhVar.f(new lf7(string, i2, ormVar, jc0Var, re7Var, zN, rf7Var, context, vwhVar, browserActivity));
    }

    public static int v(float f, int i2) {
        int i3 = 255;
        int iRound = Math.round(((i2 >> 24) & 255) * f);
        if (iRound < 0) {
            i3 = 0;
        } else if (iRound <= 255) {
            i3 = iRound;
        }
        return (i3 << 24) | (i2 & 16777215);
    }

    public static ColorStateList w(int i2, Context context) {
        int iC = gll.c(2130969109, context);
        int iB = gll.b(2130969103, context);
        int[] iArr = gll.b;
        int[] iArr2 = gll.d;
        int iH = ab5.h(iC, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, gll.c, gll.f}, new int[]{iB, iH, ab5.h(iC, i2), i2});
    }

    public final void A(Path path) {
        ggi ggiVar = (ggi) this.d;
        int i2 = ggiVar.a.L;
        Canvas canvas = (Canvas) this.b;
        if (i2 != 2) {
            canvas.drawPath(path, ggiVar.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((ggi) this.d).e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((ggi) this.d).e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igi.A0():void");
    }

    public final void B(final int i2, final int i3, final boolean z) {
        int i4 = i2;
        HashMap map = (HashMap) this.b;
        HashMap map2 = (HashMap) this.f;
        HashMap map3 = (HashMap) this.e;
        u7k u7kVar = (u7k) this.g;
        WebContentsAccessibilityImpl webContentsAccessibilityImpl = (WebContentsAccessibilityImpl) u7kVar.a;
        if (((HashSet) this.d).contains(Integer.valueOf(i3))) {
            if (!map.containsKey(Integer.valueOf(i3))) {
                u7kVar.m(i4, i3, z);
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            final long j2 = ((HashSet) this.c).contains(Integer.valueOf(i3)) ? i3 : (i4 << 32) | i3;
            if (map3.get(Long.valueOf(j2)) != null) {
                if (jElapsedRealtime - ((Long) map3.get(Long.valueOf(j2))).longValue() < ((Integer) map.get(Integer.valueOf(i3))).intValue()) {
                    webContentsAccessibilityImpl.i.removeCallbacks((Runnable) map2.get(Long.valueOf(j2)));
                    Runnable runnable = new Runnable() { // from class: h8
                        @Override // java.lang.Runnable
                        public final void run() {
                            igi igiVar = this.a;
                            HashMap map4 = (HashMap) igiVar.f;
                            u7k u7kVar2 = (u7k) igiVar.g;
                            boolean zM = u7kVar2.m(i2, i3, z);
                            long j3 = j2;
                            if (zM) {
                                ((HashMap) igiVar.e).put(Long.valueOf(j3), Long.valueOf(SystemClock.elapsedRealtime()));
                            }
                            ((WebContentsAccessibilityImpl) u7kVar2.a).i.removeCallbacks((Runnable) map4.get(Long.valueOf(j3)));
                            map4.remove(Long.valueOf(j3));
                        }
                    };
                    webContentsAccessibilityImpl.i.postDelayed(runnable, (((Long) map3.get(Long.valueOf(j2))).longValue() + ((Integer) map.get(Integer.valueOf(i3))).intValue()) - jElapsedRealtime);
                    map2.put(Long.valueOf(j2), runnable);
                    return;
                }
                i4 = i2;
            }
            if (u7kVar.m(i4, i3, z)) {
                map3.put(Long.valueOf(j2), Long.valueOf(jElapsedRealtime));
            }
            webContentsAccessibilityImpl.i.removeCallbacks((Runnable) map2.get(Long.valueOf(j2)));
            map2.remove(Long.valueOf(j2));
        }
    }

    public final void B0(b2l b2lVar) {
        boolean asBoolean = ((BooleanSupplier) this.d).getAsBoolean();
        pt1 pt1Var = (pt1) this.c;
        if (asBoolean) {
            StylingImageButton stylingImageButton = pt1Var.c;
            StylingImageButton stylingImageButton2 = pt1Var.c;
            stylingImageButton.setVisibility(0);
            ((Space) pt1Var.b).setVisibility(0);
            boolean zIsLoading = ((d7l) b2lVar).j.isLoading();
            stylingImageButton2.setImageResource(zIsLoading ? 2131232034 : 2131232212);
            if (zIsLoading) {
                n1h.n(stylingImageButton2, 2132021951, 0);
            } else {
                n1h.n(stylingImageButton2, 2132021945, 2131363287);
            }
        } else {
            pt1Var.c.setVisibility(8);
            ((Space) pt1Var.b).setVisibility(8);
        }
        d7l d7lVar = (d7l) b2lVar;
        ((StylingImageButton) pt1Var.d).setEnabled(d7lVar.f());
        ((StylingImageButton) pt1Var.e).setEnabled(d7lVar.n());
    }

    public final void C(ufi ufiVar, mzg mzgVar) {
        float f;
        float fG;
        float f2;
        int iK;
        hfi hfiVarD;
        if (y()) {
            Iterator it = ufiVar.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                jfi jfiVar = (jfi) it.next();
                if (jfiVar instanceof xfi) {
                    mzgVar.n(z0(((xfi) jfiVar).c, z, !it.hasNext()));
                } else if (mzgVar.e((ufi) jfiVar)) {
                    if (jfiVar instanceof vfi) {
                        x0();
                        vfi vfiVar = (vfi) jfiVar;
                        H0((ggi) this.d, vfiVar);
                        if (y() && K0() && (hfiVarD = vfiVar.a.D(vfiVar.n)) != null) {
                            tei teiVar = (tei) hfiVarD;
                            cgi cgiVar = new cgi(teiVar.o);
                            Matrix matrix = teiVar.n;
                            Path path = cgiVar.a;
                            if (matrix != null) {
                                path.transform(matrix);
                            }
                            PathMeasure pathMeasure = new PathMeasure(path, false);
                            nei neiVar = vfiVar.o;
                            fG = neiVar != null ? neiVar.e(this, pathMeasure.getLength()) : 0.0f;
                            int iK2 = K();
                            if (iK2 != 1) {
                                float fO = o(vfiVar);
                                if (iK2 == 2) {
                                    fO /= 2.0f;
                                }
                                fG -= fO;
                            }
                            s(vfiVar.p);
                            boolean zE0 = e0();
                            C(vfiVar, new dgi(this, path, fG));
                            if (zE0) {
                                d0(vfiVar.h);
                            }
                        }
                        w0();
                    } else if (jfiVar instanceof rfi) {
                        x0();
                        rfi rfiVar = (rfi) jfiVar;
                        H0((ggi) this.d, rfiVar);
                        if (y()) {
                            ArrayList arrayList = rfiVar.n;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = mzgVar instanceof egi;
                            if (z3) {
                                float f3 = !z2 ? ((egi) mzgVar).b : ((nei) rfiVar.n.get(0)).f(this);
                                ArrayList arrayList2 = rfiVar.o;
                                fG = (arrayList2 == null || arrayList2.size() == 0) ? ((egi) mzgVar).c : ((nei) rfiVar.o.get(0)).g(this);
                                ArrayList arrayList3 = rfiVar.p;
                                f2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((nei) rfiVar.p.get(0)).f(this);
                                ArrayList arrayList4 = rfiVar.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fG = ((nei) rfiVar.q.get(0)).g(this);
                                }
                                float f4 = f3;
                                f = fG;
                                fG = f4;
                            } else {
                                f = 0.0f;
                                fG = 0.0f;
                                f2 = 0.0f;
                            }
                            if (z2 && (iK = K()) != 1) {
                                float fO2 = o(rfiVar);
                                if (iK == 2) {
                                    fO2 /= 2.0f;
                                }
                                fG -= fO2;
                            }
                            s(rfiVar.r);
                            if (z3) {
                                egi egiVar = (egi) mzgVar;
                                egiVar.b = fG + f2;
                                egiVar.c = fG + f;
                            }
                            boolean zE02 = e0();
                            C(rfiVar, mzgVar);
                            if (zE02) {
                                d0(rfiVar.h);
                            }
                        }
                        w0();
                    } else if (jfiVar instanceof qfi) {
                        x0();
                        qfi qfiVar = (qfi) jfiVar;
                        H0((ggi) this.d, qfiVar);
                        if (y()) {
                            s(qfiVar.o);
                            hfi hfiVarD2 = jfiVar.a.D(qfiVar.n);
                            if (hfiVarD2 != null && (hfiVarD2 instanceof ufi)) {
                                StringBuilder sb = new StringBuilder();
                                D((ufi) hfiVarD2, sb);
                                if (sb.length() > 0) {
                                    mzgVar.n(sb.toString());
                                }
                            }
                        }
                        w0();
                    }
                }
                z = false;
            }
        }
    }

    public final void C0(boolean z) {
        int iJ0;
        Drawable drawableF;
        OperaListItem operaListItem = (OperaListItem) ((y83) this.f).c;
        Context context = operaListItem.getContext();
        int iA = fan.a(40.0f, context.getResources());
        if (z) {
            int iT = f03.t(2130969111, context, 2131101243);
            iJ0 = p37.j0(0.12f, iT);
            drawableF = sgb.F(2131232062, context);
            j14.n0(drawableF, iT);
        } else {
            int iT2 = f03.t(2130969115, context, 2131101243);
            Drawable drawableX = f03.x(2130969483, context);
            j14.n0(drawableX, f03.t(2130969263, context, 2131101243));
            iJ0 = iT2;
            drawableF = drawableX;
        }
        operaListItem.z(new mxh(j14.p(j14.D(iA, iJ0), drawableF)));
    }

    public final void D(ufi ufiVar, StringBuilder sb) {
        Iterator it = ufiVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            jfi jfiVar = (jfi) it.next();
            if (jfiVar instanceof ufi) {
                D((ufi) jfiVar, sb);
            } else if (jfiVar instanceof xfi) {
                sb.append(z0(((xfi) jfiVar).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public final void D0(gql gqlVar) {
        h1b h1bVar;
        k1b k1bVarD = l1b.d();
        if (((h1b) this.c).isEmpty()) {
            d(k1bVarD, (jrd) this.f, gqlVar);
            if (!Objects.equals((jrd) this.g, (jrd) this.f)) {
                d(k1bVarD, (jrd) this.g, gqlVar);
            }
            if (!Objects.equals((jrd) this.e, (jrd) this.f) && !Objects.equals((jrd) this.e, (jrd) this.g)) {
                d(k1bVarD, (jrd) this.e, gqlVar);
            }
        } else {
            int i2 = 0;
            while (true) {
                int size = ((h1b) this.c).size();
                h1bVar = (h1b) this.c;
                if (i2 >= size) {
                    break;
                }
                d(k1bVarD, (jrd) h1bVar.get(i2), gqlVar);
                i2++;
            }
            if (!h1bVar.contains((jrd) this.e)) {
                d(k1bVarD, (jrd) this.e, gqlVar);
            }
        }
        this.d = k1bVarD.b(true);
    }

    public final void E0(gfi gfiVar) {
        if (gfiVar.b == null || gfiVar.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.g).peek()).invert(matrix)) {
            ree reeVar = gfiVar.h;
            float f = reeVar.b;
            float f2 = reeVar.c;
            float fC = reeVar.c();
            ree reeVar2 = gfiVar.h;
            float f3 = reeVar2.c;
            float fC2 = reeVar2.c();
            float fD = gfiVar.h.d();
            ree reeVar3 = gfiVar.h;
            float[] fArr = {f, f2, fC, f3, fC2, fD, reeVar3.b, reeVar3.d()};
            matrix.preConcat(((Canvas) this.b).getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i2 = 2; i2 <= 6; i2 += 2) {
                float f6 = fArr[i2];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i2 + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            gfi gfiVar2 = (gfi) ((Stack) this.f).peek();
            ree reeVar4 = gfiVar2.h;
            float f8 = rectF.left;
            float f9 = rectF.top;
            if (reeVar4 == null) {
                gfiVar2.h = new ree(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.right - f8;
            float f11 = rectF.bottom - f9;
            if (f8 < reeVar4.b) {
                reeVar4.b = f8;
            }
            if (f9 < reeVar4.c) {
                reeVar4.c = f9;
            }
            if (f8 + f10 > reeVar4.c()) {
                reeVar4.d = (f8 + f10) - reeVar4.b;
            }
            if (f9 + f11 > reeVar4.d()) {
                reeVar4.e = (f9 + f11) - reeVar4.c;
            }
        }
    }

    public final void F0() {
        v9j v9jVar = (v9j) this.e;
        yk6 yk6Var = (yk6) this.c;
        boolean zBooleanValue = ((Boolean) yk6Var.i.g()).booleanValue();
        SettingsManager settingsManager = (SettingsManager) this.b;
        v9jVar.r(new nc2(zBooleanValue, settingsManager.i("ai_assistant_menu_shortcut"), Intrinsics.a(yk6Var.p.g(), Boolean.TRUE), ((Boolean) yk6Var.q.g()).booleanValue(), settingsManager.i("ai_assistant_ask_aria"), new qxh((CharSequence) ((kze) this.f).g())));
    }

    public final void G0(ggi ggiVar, bfi bfiVar) {
        if (Q(bfiVar, 4096L)) {
            ggiVar.a.k = bfiVar.k;
        }
        if (Q(bfiVar, 2048L)) {
            ggiVar.a.j = bfiVar.j;
        }
        boolean zQ = Q(bfiVar, 1L);
        eei eeiVar = eei.c;
        if (zQ) {
            ggiVar.a.b = bfiVar.b;
            kfi kfiVar = bfiVar.b;
            ggiVar.b = (kfiVar == null || kfiVar == eeiVar) ? false : true;
        }
        if (Q(bfiVar, 4L)) {
            ggiVar.a.c = bfiVar.c;
        }
        if (Q(bfiVar, 6149L)) {
            q0(ggiVar, true, ggiVar.a.b);
        }
        if (Q(bfiVar, 2L)) {
            ggiVar.a.D = bfiVar.D;
        }
        if (Q(bfiVar, 8L)) {
            ggiVar.a.d = bfiVar.d;
            kfi kfiVar2 = bfiVar.d;
            ggiVar.c = (kfiVar2 == null || kfiVar2 == eeiVar) ? false : true;
        }
        if (Q(bfiVar, 16L)) {
            ggiVar.a.e = bfiVar.e;
        }
        if (Q(bfiVar, 6168L)) {
            q0(ggiVar, false, ggiVar.a.d);
        }
        if (Q(bfiVar, 34359738368L)) {
            ggiVar.a.L = bfiVar.L;
        }
        if (Q(bfiVar, 32L)) {
            bfi bfiVar2 = ggiVar.a;
            nei neiVar = bfiVar.f;
            bfiVar2.f = neiVar;
            ggiVar.e.setStrokeWidth(neiVar.c(this));
        }
        if (Q(bfiVar, 64L)) {
            bfi bfiVar3 = ggiVar.a;
            Paint paint = ggiVar.e;
            bfiVar3.E = bfiVar.E;
            int iA = vep.A(bfiVar.E);
            if (iA == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iA == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iA == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (Q(bfiVar, 128L)) {
            bfi bfiVar4 = ggiVar.a;
            Paint paint2 = ggiVar.e;
            bfiVar4.F = bfiVar.F;
            int iA2 = vep.A(bfiVar.F);
            if (iA2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iA2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iA2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (Q(bfiVar, 256L)) {
            ggiVar.a.g = bfiVar.g;
            ggiVar.e.setStrokeMiter(bfiVar.g.floatValue());
        }
        if (Q(bfiVar, 512L)) {
            ggiVar.a.h = bfiVar.h;
        }
        if (Q(bfiVar, 1024L)) {
            ggiVar.a.i = bfiVar.i;
        }
        Typeface typefaceT = null;
        if (Q(bfiVar, 1536L)) {
            bfi bfiVar5 = ggiVar.a;
            Paint paint3 = ggiVar.e;
            nei[] neiVarArr = bfiVar5.h;
            if (neiVarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = neiVarArr.length;
                int i2 = length % 2 == 0 ? length : length << 1;
                float[] fArr = new float[i2];
                float f = 0.0f;
                for (int i3 = 0; i3 < i2; i3++) {
                    float fC = bfiVar5.h[i3 % length].c(this);
                    fArr[i3] = fC;
                    f += fC;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fC2 = bfiVar5.i.c(this);
                    if (fC2 < 0.0f) {
                        fC2 = (fC2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fC2));
                }
            }
        }
        if (Q(bfiVar, 16384L)) {
            float textSize = ((ggi) this.d).d.getTextSize();
            ggiVar.a.m = bfiVar.m;
            ggiVar.d.setTextSize(bfiVar.m.e(this, textSize));
            ggiVar.e.setTextSize(bfiVar.m.e(this, textSize));
        }
        if (Q(bfiVar, 8192L)) {
            ggiVar.a.l = bfiVar.l;
        }
        if (Q(bfiVar, 32768L)) {
            if (bfiVar.n.intValue() == -1 && ggiVar.a.n.intValue() > 100) {
                bfi bfiVar6 = ggiVar.a;
                bfiVar6.n = Integer.valueOf(bfiVar6.n.intValue() - 100);
            } else if (bfiVar.n.intValue() != 1 || ggiVar.a.n.intValue() >= 900) {
                ggiVar.a.n = bfiVar.n;
            } else {
                bfi bfiVar7 = ggiVar.a;
                bfiVar7.n = Integer.valueOf(bfiVar7.n.intValue() + 100);
            }
        }
        if (Q(bfiVar, 65536L)) {
            ggiVar.a.G = bfiVar.G;
        }
        if (Q(bfiVar, 106496L)) {
            bfi bfiVar8 = ggiVar.a;
            ArrayList arrayList = bfiVar8.l;
            if (arrayList != null && ((p8f) this.c) != null) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    typefaceT = t(bfiVar8.G, (String) obj, bfiVar8.n);
                    if (typefaceT != null) {
                        break;
                    }
                }
            }
            if (typefaceT == null) {
                typefaceT = t(bfiVar8.G, "serif", bfiVar8.n);
            }
            ggiVar.d.setTypeface(typefaceT);
            ggiVar.e.setTypeface(typefaceT);
        }
        if (Q(bfiVar, 131072L)) {
            bfi bfiVar9 = ggiVar.a;
            Paint paint4 = ggiVar.e;
            Paint paint5 = ggiVar.d;
            bfiVar9.H = bfiVar.H;
            paint5.setStrikeThruText(bfiVar.H == 4);
            paint5.setUnderlineText(bfiVar.H == 2);
            paint4.setStrikeThruText(bfiVar.H == 4);
            paint4.setUnderlineText(bfiVar.H == 2);
        }
        if (Q(bfiVar, 68719476736L)) {
            ggiVar.a.I = bfiVar.I;
        }
        if (Q(bfiVar, 262144L)) {
            ggiVar.a.J = bfiVar.J;
        }
        if (Q(bfiVar, 524288L)) {
            ggiVar.a.o = bfiVar.o;
        }
        if (Q(bfiVar, 2097152L)) {
            ggiVar.a.q = bfiVar.q;
        }
        if (Q(bfiVar, 4194304L)) {
            ggiVar.a.r = bfiVar.r;
        }
        if (Q(bfiVar, 8388608L)) {
            ggiVar.a.s = bfiVar.s;
        }
        if (Q(bfiVar, 16777216L)) {
            ggiVar.a.t = bfiVar.t;
        }
        if (Q(bfiVar, 33554432L)) {
            ggiVar.a.u = bfiVar.u;
        }
        if (Q(bfiVar, 1048576L)) {
            ggiVar.a.p = bfiVar.p;
        }
        if (Q(bfiVar, 268435456L)) {
            ggiVar.a.x = bfiVar.x;
        }
        if (Q(bfiVar, 536870912L)) {
            ggiVar.a.K = bfiVar.K;
        }
        if (Q(bfiVar, 1073741824L)) {
            ggiVar.a.y = bfiVar.y;
        }
        if (Q(bfiVar, 67108864L)) {
            ggiVar.a.v = bfiVar.v;
        }
        if (Q(bfiVar, 134217728L)) {
            ggiVar.a.w = bfiVar.w;
        }
        if (Q(bfiVar, 8589934592L)) {
            ggiVar.a.B = bfiVar.B;
        }
        if (Q(bfiVar, 17179869184L)) {
            ggiVar.a.C = bfiVar.C;
        }
        if (Q(bfiVar, 137438953472L)) {
            ggiVar.a.M = bfiVar.M;
        }
    }

    public final void H0(ggi ggiVar, hfi hfiVar) {
        int i2 = 0;
        boolean z = hfiVar.b == null;
        bfi bfiVar = ggiVar.a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        bfiVar.t = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        bfiVar.o = bool;
        bfiVar.p = null;
        bfiVar.x = null;
        bfiVar.j = fValueOf;
        bfiVar.v = eei.b;
        bfiVar.w = fValueOf;
        bfiVar.y = null;
        bfiVar.z = null;
        bfiVar.A = fValueOf;
        bfiVar.B = null;
        bfiVar.C = fValueOf;
        bfiVar.L = 1;
        bfi bfiVar2 = hfiVar.e;
        if (bfiVar2 != null) {
            G0(ggiVar, bfiVar2);
        }
        ArrayList arrayList = ((s64) ((p8f) this.c).c).b;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = ((s64) ((p8f) this.c).c).b;
            int size = arrayList2.size();
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                r64 r64Var = (r64) obj;
                if (z.o(r64Var.a, hfiVar)) {
                    G0(ggiVar, r64Var.b);
                }
            }
        }
        bfi bfiVar3 = hfiVar.f;
        if (bfiVar3 != null) {
            G0(ggiVar, bfiVar3);
        }
    }

    public final ggi I(jfi jfiVar) {
        ggi ggiVar = new ggi();
        G0(ggiVar, bfi.b());
        J(jfiVar, ggiVar);
        return ggiVar;
    }

    public final void I0() {
        LinearLayout linearLayout = (LinearLayout) this.f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = (HashMap) this.b;
        for (kg7 kg7Var : map.keySet()) {
            Chip chip = (Chip) map.get(kg7Var);
            if (chip != null) {
                if (((HashSet) this.e).contains(kg7Var)) {
                    arrayList.add(chip);
                } else {
                    arrayList2.add(chip);
                }
            }
        }
        if (arrayList.size() < 2 && ((kg7) this.g) == null) {
            linearLayout.setVisibility(8);
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        ArrayList arrayList4 = new ArrayList();
        int iE = ((ChipGroup) this.d).h.e();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Chip chip2 = (Chip) obj;
            ((iE == -1 || iE == chip2.getId()) ? arrayList4 : arrayList3).add(chip2);
        }
        arrayList3.forEach(new qg2((byte) 7));
        arrayList4.forEach(new qg2((byte) 6));
        linearLayout.setVisibility(0);
    }

    public final void J(jfi jfiVar, ggi ggiVar) {
        int i2;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i2 = 0;
            if (jfiVar instanceof hfi) {
                arrayList.add(0, (hfi) jfiVar);
            }
            Object obj = jfiVar.b;
            if (obj == null) {
                break;
            } else {
                jfiVar = (jfi) obj;
            }
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            H0(ggiVar, (hfi) obj2);
        }
        ggi ggiVar2 = (ggi) this.d;
        ggiVar.g = ggiVar2.g;
        ggiVar.f = ggiVar2.f;
    }

    public final void J0() {
        int iV;
        bfi bfiVar = ((ggi) this.d).a;
        kfi kfiVar = bfiVar.B;
        if (kfiVar instanceof eei) {
            iV = ((eei) kfiVar).a;
        } else if (!(kfiVar instanceof fei)) {
            return;
        } else {
            iV = bfiVar.k.a;
        }
        Float f = bfiVar.C;
        if (f != null) {
            iV = v(f.floatValue(), iV);
        }
        ((Canvas) this.b).drawColor(iV);
    }

    public final int K() {
        int i2;
        bfi bfiVar = ((ggi) this.d).a;
        return (bfiVar.I == 1 || (i2 = bfiVar.J) == 2) ? bfiVar.J : i2 == 1 ? 3 : 1;
    }

    public final boolean K0() {
        Boolean bool = ((ggi) this.d).a.u;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final int L() {
        int iQ;
        xug.i();
        jpo.n("The ImageReader is not initialized.", ((bl9) this.c) != null);
        bl9 bl9Var = (bl9) this.c;
        synchronized (bl9Var.c) {
            iQ = ((uya) bl9Var.d).q() - bl9Var.a;
        }
        return iQ;
    }

    public final ColorStateList N(int i2, Context context) {
        if (i2 == 2131231100) {
            return nb6.v(2131099670, context);
        }
        if (i2 == 2131231146) {
            return nb6.v(2131099674, context);
        }
        if (i2 != 2131231145) {
            if (i2 == 2131231088) {
                return w(gll.c(2130969103, context), context);
            }
            if (i2 == 2131231082) {
                return w(0, context);
            }
            if (i2 == 2131231087) {
                return w(gll.c(2130969091, context), context);
            }
            if (i2 == 2131231141 || i2 == 2131231142) {
                return nb6.v(2131099672, context);
            }
            if (f(i2, (int[]) this.c)) {
                return gll.d(2130969110, context);
            }
            if (f(i2, (int[]) this.f)) {
                return nb6.v(2131099669, context);
            }
            if (f(i2, (int[]) this.g)) {
                return nb6.v(2131099668, context);
            }
            if (i2 == 2131231138) {
                return nb6.v(2131099671, context);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = gll.d(2130969346, context);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = gll.b;
            iArr2[0] = gll.b(2130969346, context);
            iArr[1] = gll.e;
            iArr2[1] = gll.c(2130969108, context);
            iArr[2] = gll.f;
            iArr2[2] = gll.c(2130969346, context);
        } else {
            int[] iArr3 = gll.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = gll.e;
            iArr2[1] = gll.c(2130969108, context);
            iArr[2] = gll.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public final boolean O() {
        hbn hbnVar = (hbn) ((ode) this.f).g();
        return hbnVar != null && hbnVar.a();
    }

    public final Path R(cei ceiVar) {
        nei neiVar = ceiVar.o;
        float f = neiVar != null ? neiVar.f(this) : 0.0f;
        nei neiVar2 = ceiVar.p;
        float fG = neiVar2 != null ? neiVar2.g(this) : 0.0f;
        float fC = ceiVar.q.c(this);
        float f2 = f - fC;
        float f3 = fG - fC;
        float f4 = f + fC;
        float f5 = fG + fC;
        if (ceiVar.h == null) {
            float f6 = 2.0f * fC;
            ceiVar.h = new ree(f2, f3, f6, f6);
        }
        float f7 = fC * 0.5522848f;
        Path path = new Path();
        path.moveTo(f, f3);
        float f8 = f + f7;
        float f9 = fG - f7;
        path.cubicTo(f8, f3, f4, f9, f4, fG);
        float f10 = fG + f7;
        path.cubicTo(f4, f10, f8, f5, f, f5);
        float f11 = f - f7;
        path.cubicTo(f11, f5, f2, f10, f2, fG);
        path.cubicTo(f2, f9, f11, f3, f, f3);
        path.close();
        return path;
    }

    public final Path S(hei heiVar) {
        nei neiVar = heiVar.o;
        float f = neiVar != null ? neiVar.f(this) : 0.0f;
        nei neiVar2 = heiVar.p;
        float fG = neiVar2 != null ? neiVar2.g(this) : 0.0f;
        float f2 = heiVar.q.f(this);
        float fG2 = heiVar.r.g(this);
        float f3 = f - f2;
        float f4 = fG - fG2;
        float f5 = f + f2;
        float f6 = fG + fG2;
        if (heiVar.h == null) {
            heiVar.h = new ree(f3, f4, f2 * 2.0f, 2.0f * fG2);
        }
        float f7 = f2 * 0.5522848f;
        float f8 = fG2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f, f4);
        float f9 = f + f7;
        float f10 = fG - f8;
        path.cubicTo(f9, f4, f5, f10, f5, fG);
        float f11 = fG + f8;
        path.cubicTo(f5, f11, f9, f6, f, f6);
        float f12 = f - f7;
        path.cubicTo(f12, f6, f3, f11, f3, fG);
        path.cubicTo(f3, f10, f12, f4, f, f4);
        path.close();
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Path U(defpackage.yei r20) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igi.U(yei):android.graphics.Path");
    }

    public final ree V(nei neiVar, nei neiVar2, nei neiVar3, nei neiVar4) {
        float f = neiVar != null ? neiVar.f(this) : 0.0f;
        float fG = neiVar2 != null ? neiVar2.g(this) : 0.0f;
        ggi ggiVar = (ggi) this.d;
        ree reeVar = ggiVar.g;
        if (reeVar == null) {
            reeVar = ggiVar.f;
        }
        return new ree(f, fG, neiVar3 != null ? neiVar3.f(this) : reeVar.d, neiVar4 != null ? neiVar4.g(this) : reeVar.e);
    }

    public final Path W(gfi gfiVar) {
        Path path;
        Path pathW;
        Path pathL;
        ((Stack) this.e).push((ggi) this.d);
        ggi ggiVar = new ggi((ggi) this.d);
        this.d = ggiVar;
        H0(ggiVar, gfiVar);
        if (!y() || !K0()) {
            this.d = (ggi) ((Stack) this.e).pop();
            return null;
        }
        if (gfiVar instanceof yfi) {
            yfi yfiVar = (yfi) gfiVar;
            hfi hfiVarD = gfiVar.a.D(yfiVar.o);
            if (hfiVarD == null) {
                this.d = (ggi) ((Stack) this.e).pop();
                return null;
            }
            if (!(hfiVarD instanceof gfi)) {
                this.d = (ggi) ((Stack) this.e).pop();
                return null;
            }
            pathW = W((gfi) hfiVarD);
            if (pathW != null) {
                if (yfiVar.h == null) {
                    yfiVar.h = n(pathW);
                }
                Matrix matrix = yfiVar.n;
                if (matrix != null) {
                    pathW.transform(matrix);
                }
                if (((ggi) this.d).a.x != null && (pathL = l(gfiVar, gfiVar.h)) != null) {
                    pathW.op(pathL, Path.Op.INTERSECT);
                }
                this.d = (ggi) ((Stack) this.e).pop();
                return pathW;
            }
            return null;
        }
        if (gfiVar instanceof jei) {
            jei jeiVar = (jei) gfiVar;
            if (gfiVar instanceof tei) {
                cgi cgiVar = new cgi(((tei) gfiVar).o);
                ree reeVar = gfiVar.h;
                Path path2 = cgiVar.a;
                if (reeVar == null) {
                    gfiVar.h = n(path2);
                }
                path = path2;
            } else {
                path = gfiVar instanceof yei ? U((yei) gfiVar) : gfiVar instanceof cei ? R((cei) gfiVar) : gfiVar instanceof hei ? S((hei) gfiVar) : gfiVar instanceof wei ? T((wei) gfiVar) : null;
            }
            if (path != null) {
                if (jeiVar.h == null) {
                    jeiVar.h = n(path);
                }
                Matrix matrix2 = jeiVar.n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                int i2 = ((ggi) this.d).a.K;
                path.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                pathW = path;
            }
            return null;
        }
        if (gfiVar instanceof sfi) {
            sfi sfiVar = (sfi) gfiVar;
            ArrayList arrayList = sfiVar.n;
            float fG = 0.0f;
            float f = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((nei) sfiVar.n.get(0)).f(this);
            ArrayList arrayList2 = sfiVar.o;
            float fG2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((nei) sfiVar.o.get(0)).g(this);
            ArrayList arrayList3 = sfiVar.p;
            float f2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((nei) sfiVar.p.get(0)).f(this);
            ArrayList arrayList4 = sfiVar.q;
            if (arrayList4 != null && arrayList4.size() != 0) {
                fG = ((nei) sfiVar.q.get(0)).g(this);
            }
            if (((ggi) this.d).a.J != 1) {
                float fO = o(sfiVar);
                if (((ggi) this.d).a.J == 2) {
                    fO /= 2.0f;
                }
                f -= fO;
            }
            if (sfiVar.h == null) {
                fgi fgiVar = new fgi(this, f, fG2);
                C(sfiVar, fgiVar);
                Object obj = fgiVar.f;
                RectF rectF = (RectF) obj;
                sfiVar.h = new ree(rectF.left, rectF.top, rectF.width(), ((RectF) obj).height());
            }
            path = new Path();
            C(sfiVar, new fgi(this, f + f2, fG2 + fG, path));
            Matrix matrix3 = sfiVar.r;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            int i3 = ((ggi) this.d).a.K;
            path.setFillType((i3 == 0 || i3 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            pathW = path;
        }
        return null;
        if (((ggi) this.d).a.x != null) {
            pathW.op(pathL, Path.Op.INTERSECT);
        }
        this.d = (ggi) ((Stack) this.e).pop();
        return pathW;
    }

    public final void X(boolean z, imc imcVar, boolean z2) {
        List list;
        y83 y83Var = (y83) this.b;
        ImageView imageView = (ImageView) y83Var.h;
        ((FrameLayout) y83Var.b).setVisibility(z ? 0 : 8);
        if (z) {
            if (imcVar == null || (list = imcVar.b) == null || list.size() != 3) {
                list = null;
            }
            jmc jmcVar = imcVar != null ? imcVar.a : null;
            boolean z3 = true;
            boolean z4 = list != null || z2;
            ((ConstraintLayout) y83Var.e).setVisibility(z4 ? 0 : 8);
            ((TextView) y83Var.f).setVisibility(!z4 ? 0 : 8);
            if (z4) {
                g((or2) y83Var.c, list != null ? (tmc) list.get(0) : null, new ci7(1, (pkc) this.d, pkc.class, "onOddsClicked", "onOddsClicked(Lcom/opera/android/live_score/data/LiveScoreEvent$Odds;)V", 0, (byte) 19), voc.ONE);
                g((or2) y83Var.g, list != null ? (tmc) list.get(1) : null, new ci7(1, (pkc) this.d, pkc.class, "onOddsClicked", "onOddsClicked(Lcom/opera/android/live_score/data/LiveScoreEvent$Odds;)V", 0, (byte) 20), voc.X);
                g((or2) y83Var.d, list != null ? (tmc) list.get(2) : null, new ci7(1, (pkc) this.d, pkc.class, "onOddsClicked", "onOddsClicked(Lcom/opera/android/live_score/data/LiveScoreEvent$Odds;)V", 0, (byte) 21), voc.TWO);
                this.g = jmcVar;
                gv8 gv8Var = new gv8(jmcVar, this, (byte) 23);
                ci7 ci7Var = new ci7(1, (pkc) this.d, pkc.class, "onOddsProviderClicked", "onOddsProviderClicked(Ljava/lang/String;)V", 0, (byte) 22);
                imageView.setImageBitmap(null);
                String str = jmcVar != null ? jmcVar.a : null;
                if (str != null && str.length() != 0) {
                    z3 = false;
                }
                imageView.setVisibility(z3 ? 8 : 0);
                String str2 = jmcVar != null ? jmcVar.b : null;
                if (str2 != null) {
                    imageView.setOnClickListener(new jf7(ci7Var, str2, (byte) 16));
                } else {
                    imageView.setOnClickListener(null);
                }
                if (!z3) {
                    int iK = k.k(imageView.getContext());
                    dwh dwhVarI = yne.b.i(str);
                    dwhVarI.b.b(iK, iK);
                    dwhVarI.b();
                    dwhVarI.j();
                    dwhVarI.f(new phi(new su(gv8Var, imageView, this, (byte) 27)));
                }
            }
        }
        ((noc) this.e).a();
    }

    public final void Y(qya qyaVar) throws Exception {
        xug.i();
        if (((s1h) this.b) == null) {
            Objects.toString(qyaVar);
            qyaVar.close();
            return;
        }
        hbl hblVarD = qyaVar.h1().d();
        if (((Integer) hblVarD.a.get(((s1h) this.b).g)) == null) {
            int i2 = ((s1h) this.b).a;
            Objects.toString(hblVarD.a.keySet());
            qyaVar.close();
            return;
        }
        xug.i();
        io2 io2Var = (io2) this.e;
        Objects.requireNonNull(io2Var);
        io2Var.a.accept(new jo2((s1h) this.b, qyaVar));
        s1h s1hVar = (s1h) this.b;
        xm2 xm2Var = (xm2) this.f;
        boolean z = xm2Var != null && xm2Var.h.size() > 1;
        if (z && ((s1h) this.b) != null) {
            qyaVar.getFormat();
            throw null;
        }
        if (!z) {
            this.b = null;
        } else if (((s1h) this.b) != null) {
            throw null;
        }
        if (s1hVar.j != -1) {
            s1hVar.a(100);
        }
        xwh xwhVar = s1hVar.f;
        xug.i();
        if (xwhVar.f) {
            return;
        }
        if (!xwhVar.g) {
            xug.i();
            if (!xwhVar.f && !xwhVar.g) {
                xwhVar.g = true;
            }
        }
        xwhVar.d.b(null);
    }

    public final void Z(Context context, boolean z, Set set) {
        HashSet hashSet = new HashSet(set);
        if (z) {
            hashSet.add(apc.c);
        }
        jum iumVar = hashSet.isEmpty() ? ulp.o : new ium((Set) hashSet.stream().map(new mn((byte) 9)).collect(Collectors.toSet()));
        String str = (String) ((onc) this.c).get();
        hd hdVarO = hd.o(context);
        Context context2 = (Context) hdVarO.f;
        String string = hd.j(context2).getString("npt_user_mode", "classic");
        String strB = iumVar.b();
        if (!Objects.equals(string, strB)) {
            context2.getSharedPreferences("news_push_tracker", 0).edit().putString("npt_user_mode", strB).apply();
            if (str != null && !hdVarO.b && !str.isEmpty()) {
                hdVarO.b = true;
                new kse(hdVarO, context2, str);
            }
        }
        boolean z2 = iumVar instanceof ium;
        s14 s14Var = (s14) this.e;
        if (z2) {
            if (s14Var.b) {
                return;
            }
            s14Var.b = true;
            ((wnm) s14Var.c).k((ks6) s14Var.e);
            return;
        }
        if (s14Var.b) {
            s14Var.b = false;
            ((wnm) s14Var.c).p((ks6) s14Var.e);
        }
    }

    public final LinkedHashSet a() {
        View[] viewArr = {(ksd) this.b, (View) this.c, (View) this.d, (View) this.e, (ImageView) this.f};
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i2 = 0; i2 < 5; i2++) {
            View view = viewArr[i2];
            if (view != null) {
                linkedHashSet.add(view);
            }
        }
        v08 v08Var = (Set) this.g;
        if (v08Var == null) {
            v08Var = v08.a;
        }
        return b5j.e(linkedHashSet, v08Var);
    }

    public final void a0() {
        y83 y83Var = (y83) this.b;
        r0(y83Var, ((ConstraintLayout) y83Var.e).getVisibility() == 0);
    }

    public final void b(ArrayList arrayList) {
        if (arrayList == null) {
            qp2.o("filters must not be null");
            return;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (obj instanceof IntentFilter) {
                IntentFilter intentFilter = (IntentFilter) obj;
                ArrayList arrayList2 = (ArrayList) this.d;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    public final void b0(s1h s1hVar) {
        xug.i();
        boolean z = false;
        jpo.n("only one capture stage is supported.", s1hVar.h.size() == 1);
        jpo.n("Too many acquire images. Close image to be able to process next.", L() > 0);
        this.b = s1hVar;
        o94 o94Var = s1hVar.i;
        o94Var.addListener(new wr9(o94Var, new z8b(this, s1hVar, z), (byte) 0), n97.a());
    }

    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            ArrayList arrayList2 = (ArrayList) this.c;
            if (TextUtils.isEmpty(str)) {
                qp2.o("groupMemberId must not be empty");
                return;
            } else if (!arrayList2.contains(str)) {
                arrayList2.add(str);
            }
        }
    }

    public final void c0() {
        y83 y83Var = (y83) this.b;
        r0(y83Var, false);
        ImageView imageView = (ImageView) y83Var.h;
        imageView.setVisibility(8);
        imageView.setOnClickListener(null);
        imageView.setImageBitmap(null);
        this.g = null;
    }

    public final void d(k1b k1bVar, jrd jrdVar, gql gqlVar) {
        if (jrdVar != null) {
            if (gqlVar.b(jrdVar.a) != -1) {
                k1bVar.e(jrdVar, gqlVar);
                return;
            }
            gql gqlVar2 = (gql) ((hsh) this.d).get(jrdVar);
            if (gqlVar2 != null) {
                k1bVar.e(jrdVar, gqlVar2);
            }
        }
    }

    public final void d0(ree reeVar) {
        Canvas canvas = (Canvas) this.b;
        if (((ggi) this.d).a.y != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            qei qeiVar = (qei) ((p8f) this.c).D(((ggi) this.d).a.y);
            k0(qeiVar, reeVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            k0(qeiVar, reeVar);
            canvas.restore();
            canvas.restore();
        }
        w0();
    }

    public final boolean e0() {
        hfi hfiVarD;
        int i2 = 0;
        if (((ggi) this.d).a.j.floatValue() >= 1.0f && ((ggi) this.d).a.y == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.b;
        int iFloatValue = (int) (((ggi) this.d).a.j.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i2 = 255;
            if (iFloatValue <= 255) {
                i2 = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i2, 31);
        ((Stack) this.e).push((ggi) this.d);
        ggi ggiVar = new ggi((ggi) this.d);
        this.d = ggiVar;
        String str = ggiVar.a.y;
        if (str != null && ((hfiVarD = ((p8f) this.c).D(str)) == null || !(hfiVarD instanceof qei))) {
            bfi bfiVar = ((ggi) this.d).a;
            String str2 = bfiVar.y;
            bfiVar.y = null;
        }
        return true;
    }

    public final void f0(cfi cfiVar, ree reeVar, ree reeVar2, iwg iwgVar) {
        if (reeVar.d == 0.0f || reeVar.e == 0.0f) {
            return;
        }
        if (iwgVar == null && (iwgVar = cfiVar.n) == null) {
            iwgVar = iwg.d;
        }
        H0((ggi) this.d, cfiVar);
        if (y()) {
            ggi ggiVar = (ggi) this.d;
            ggiVar.f = reeVar;
            if (!ggiVar.a.o.booleanValue()) {
                ree reeVar3 = ((ggi) this.d).f;
                m0(reeVar3.b, reeVar3.c, reeVar3.d, reeVar3.e);
            }
            r(cfiVar, ((ggi) this.d).f);
            Canvas canvas = (Canvas) this.b;
            ggi ggiVar2 = (ggi) this.d;
            if (reeVar2 != null) {
                canvas.concat(p(ggiVar2.f, reeVar2, iwgVar));
                ((ggi) this.d).g = cfiVar.o;
            } else {
                ree reeVar4 = ggiVar2.f;
                canvas.translate(reeVar4.b, reeVar4.c);
            }
            boolean zE0 = e0();
            J0();
            h0(cfiVar, true);
            if (zE0) {
                d0(cfiVar.h);
            }
            E0(cfiVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g0(jfi jfiVar) {
        nei neiVar;
        String str;
        int iIndexOf;
        Set setA;
        nei neiVar2;
        jfi jfiVarD;
        Boolean bool;
        if (jfiVar instanceof rei) {
            return;
        }
        x0();
        if ((jfiVar instanceof hfi) && (bool = ((hfi) jfiVar).d) != null) {
            ((ggi) this.d).h = bool.booleanValue();
        }
        if (jfiVar instanceof cfi) {
            cfi cfiVar = (cfi) jfiVar;
            f0(cfiVar, V(cfiVar.p, cfiVar.q, cfiVar.r, cfiVar.s), cfiVar.o, cfiVar.n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            if (jfiVar instanceof yfi) {
                yfi yfiVar = (yfi) jfiVar;
                Canvas canvas = (Canvas) this.b;
                nei neiVar3 = yfiVar.r;
                if ((neiVar3 == null || !neiVar3.j()) && ((neiVar2 = yfiVar.s) == null || !neiVar2.j())) {
                    H0((ggi) this.d, yfiVar);
                    if (y() && (jfiVarD = yfiVar.a.D(yfiVar.o)) != null) {
                        Matrix matrix = yfiVar.n;
                        if (matrix != null) {
                            canvas.concat(matrix);
                        }
                        nei neiVar4 = yfiVar.p;
                        float f = neiVar4 != null ? neiVar4.f(this) : 0.0f;
                        nei neiVar5 = yfiVar.q;
                        canvas.translate(f, neiVar5 != null ? neiVar5.g(this) : 0.0f);
                        r(yfiVar, yfiVar.h);
                        boolean zE0 = e0();
                        ((Stack) this.f).push(yfiVar);
                        ((Stack) this.g).push(((Canvas) this.b).getMatrix());
                        if (jfiVarD instanceof cfi) {
                            cfi cfiVar2 = (cfi) jfiVarD;
                            ree reeVarV = V(null, null, yfiVar.r, yfiVar.s);
                            x0();
                            f0(cfiVar2, reeVarV, cfiVar2.o, cfiVar2.n);
                            w0();
                        } else if (jfiVarD instanceof pfi) {
                            nei neiVar6 = yfiVar.r;
                            if (neiVar6 == null) {
                                neiVar6 = new nei(100.0f, 9);
                            }
                            nei neiVar7 = yfiVar.s;
                            if (neiVar7 == null) {
                                neiVar7 = new nei(100.0f, 9);
                            }
                            ree reeVarV2 = V(null, null, neiVar6, neiVar7);
                            x0();
                            pfi pfiVar = (pfi) jfiVarD;
                            if (reeVarV2.d != 0.0f && reeVarV2.e != 0.0f) {
                                iwg iwgVar = pfiVar.n;
                                if (iwgVar == null) {
                                    iwgVar = iwg.d;
                                }
                                H0((ggi) this.d, pfiVar);
                                ggi ggiVar = (ggi) this.d;
                                ggiVar.f = reeVarV2;
                                if (!ggiVar.a.o.booleanValue()) {
                                    ree reeVar = ((ggi) this.d).f;
                                    m0(reeVar.b, reeVar.c, reeVar.d, reeVar.e);
                                }
                                ree reeVar2 = pfiVar.o;
                                ggi ggiVar2 = (ggi) this.d;
                                if (reeVar2 != null) {
                                    canvas.concat(p(ggiVar2.f, reeVar2, iwgVar));
                                    ((ggi) this.d).g = pfiVar.o;
                                } else {
                                    ree reeVar3 = ggiVar2.f;
                                    canvas.translate(reeVar3.b, reeVar3.c);
                                }
                                boolean zE02 = e0();
                                h0(pfiVar, true);
                                if (zE02) {
                                    d0(pfiVar.h);
                                }
                                E0(pfiVar);
                            }
                            w0();
                        } else {
                            g0(jfiVarD);
                        }
                        ((Stack) this.f).pop();
                        ((Stack) this.g).pop();
                        if (zE0) {
                            d0(yfiVar.h);
                        }
                        E0(yfiVar);
                    }
                }
            } else {
                if (jfiVar instanceof ofi) {
                    ofi ofiVar = (ofi) jfiVar;
                    H0((ggi) this.d, ofiVar);
                    if (y()) {
                        Matrix matrix2 = ofiVar.n;
                        if (matrix2 != null) {
                            ((Canvas) this.b).concat(matrix2);
                        }
                        r(ofiVar, ofiVar.h);
                        boolean zE03 = e0();
                        String language = Locale.getDefault().getLanguage();
                        ArrayList arrayList = ofiVar.i;
                        int size = arrayList.size();
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            Object obj = arrayList.get(i);
                            i++;
                            jfi jfiVar2 = (jfi) obj;
                            if (jfiVar2 instanceof dfi) {
                                dfi dfiVar = (dfi) jfiVar2;
                                if (dfiVar.b() == null && ((setA = dfiVar.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                                    Set requiredFeatures = dfiVar.getRequiredFeatures();
                                    if (requiredFeatures != null) {
                                        if (h == null) {
                                            synchronized (igi.class) {
                                                HashSet hashSet = new HashSet();
                                                h = hashSet;
                                                hashSet.add("Structure");
                                                h.add("BasicStructure");
                                                h.add("ConditionalProcessing");
                                                h.add("Image");
                                                h.add("Style");
                                                h.add("ViewportAttribute");
                                                h.add("Shape");
                                                h.add("BasicText");
                                                h.add("PaintAttribute");
                                                h.add("BasicPaintAttribute");
                                                h.add("OpacityAttribute");
                                                h.add("BasicGraphicsAttribute");
                                                h.add("Marker");
                                                h.add("Gradient");
                                                h.add("Pattern");
                                                h.add("Clip");
                                                h.add("BasicClip");
                                                h.add("Mask");
                                                h.add("View");
                                            }
                                        }
                                        if (requiredFeatures.isEmpty() || !h.containsAll(requiredFeatures)) {
                                        }
                                    }
                                    Set setL = dfiVar.l();
                                    if (setL == null) {
                                        Set setM = dfiVar.m();
                                        if (setM == null) {
                                            g0(jfiVar2);
                                            break;
                                        }
                                        setM.isEmpty();
                                    } else {
                                        setL.isEmpty();
                                    }
                                }
                            }
                        }
                        if (zE03) {
                            d0(ofiVar.h);
                        }
                        E0(ofiVar);
                    }
                } else if (jfiVar instanceof kei) {
                    kei keiVar = (kei) jfiVar;
                    H0((ggi) this.d, keiVar);
                    if (y()) {
                        Matrix matrix3 = keiVar.n;
                        if (matrix3 != null) {
                            ((Canvas) this.b).concat(matrix3);
                        }
                        r(keiVar, keiVar.h);
                        boolean zE04 = e0();
                        h0(keiVar, true);
                        if (zE04) {
                            d0(keiVar.h);
                        }
                        E0(keiVar);
                    }
                } else if (jfiVar instanceof mei) {
                    mei meiVar = (mei) jfiVar;
                    Canvas canvas2 = (Canvas) this.b;
                    nei neiVar8 = meiVar.r;
                    if (neiVar8 != null && !neiVar8.j() && (neiVar = meiVar.s) != null && !neiVar.j() && (str = meiVar.o) != null) {
                        iwg iwgVar2 = meiVar.n;
                        if (iwgVar2 == null) {
                            iwgVar2 = iwg.d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                            try {
                                byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                            } catch (Exception unused) {
                            }
                        }
                        if (bitmapDecodeByteArray != null) {
                            ree reeVar4 = new ree(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                            H0((ggi) this.d, meiVar);
                            if (y() && K0()) {
                                Matrix matrix4 = meiVar.t;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                nei neiVar9 = meiVar.p;
                                float f2 = neiVar9 != null ? neiVar9.f(this) : 0.0f;
                                nei neiVar10 = meiVar.q;
                                float fG = neiVar10 != null ? neiVar10.g(this) : 0.0f;
                                float f3 = meiVar.r.f(this);
                                float f4 = meiVar.s.f(this);
                                ggi ggiVar3 = (ggi) this.d;
                                ggiVar3.f = new ree(f2, fG, f3, f4);
                                if (!ggiVar3.a.o.booleanValue()) {
                                    ree reeVar5 = ((ggi) this.d).f;
                                    m0(reeVar5.b, reeVar5.c, reeVar5.d, reeVar5.e);
                                }
                                meiVar.h = ((ggi) this.d).f;
                                E0(meiVar);
                                r(meiVar, meiVar.h);
                                boolean zE05 = e0();
                                J0();
                                canvas2.save();
                                canvas2.concat(p(((ggi) this.d).f, reeVar4, iwgVar2));
                                canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((ggi) this.d).a.M != 3 ? 2 : 0));
                                canvas2.restore();
                                if (zE05) {
                                    d0(meiVar.h);
                                }
                            }
                        }
                    }
                } else if (jfiVar instanceof tei) {
                    tei teiVar = (tei) jfiVar;
                    if (teiVar.o != null) {
                        H0((ggi) this.d, teiVar);
                        if (y() && K0()) {
                            ggi ggiVar4 = (ggi) this.d;
                            if (ggiVar4.c || ggiVar4.b) {
                                Matrix matrix5 = teiVar.n;
                                if (matrix5 != null) {
                                    ((Canvas) this.b).concat(matrix5);
                                }
                                Path path = new cgi(teiVar.o).a;
                                if (teiVar.h == null) {
                                    teiVar.h = n(path);
                                }
                                E0(teiVar);
                                s(teiVar);
                                r(teiVar, teiVar.h);
                                boolean zE06 = e0();
                                ggi ggiVar5 = (ggi) this.d;
                                if (ggiVar5.b) {
                                    int i2 = ggiVar5.a.D;
                                    path.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    z(teiVar, path);
                                }
                                if (((ggi) this.d).c) {
                                    A(path);
                                }
                                j0(teiVar);
                                if (zE06) {
                                    d0(teiVar.h);
                                }
                            }
                        }
                    }
                } else if (jfiVar instanceof yei) {
                    yei yeiVar = (yei) jfiVar;
                    nei neiVar11 = yeiVar.q;
                    if (neiVar11 != null && yeiVar.r != null && !neiVar11.j() && !yeiVar.r.j()) {
                        H0((ggi) this.d, yeiVar);
                        if (y() && K0()) {
                            Matrix matrix6 = yeiVar.n;
                            if (matrix6 != null) {
                                ((Canvas) this.b).concat(matrix6);
                            }
                            Path pathU = U(yeiVar);
                            E0(yeiVar);
                            s(yeiVar);
                            r(yeiVar, yeiVar.h);
                            boolean zE07 = e0();
                            if (((ggi) this.d).b) {
                                z(yeiVar, pathU);
                            }
                            if (((ggi) this.d).c) {
                                A(pathU);
                            }
                            if (zE07) {
                                d0(yeiVar.h);
                            }
                        }
                    }
                } else if (jfiVar instanceof cei) {
                    cei ceiVar = (cei) jfiVar;
                    nei neiVar12 = ceiVar.q;
                    if (neiVar12 != null && !neiVar12.j()) {
                        H0((ggi) this.d, ceiVar);
                        if (y() && K0()) {
                            Matrix matrix7 = ceiVar.n;
                            if (matrix7 != null) {
                                ((Canvas) this.b).concat(matrix7);
                            }
                            Path pathR = R(ceiVar);
                            E0(ceiVar);
                            s(ceiVar);
                            r(ceiVar, ceiVar.h);
                            boolean zE08 = e0();
                            if (((ggi) this.d).b) {
                                z(ceiVar, pathR);
                            }
                            if (((ggi) this.d).c) {
                                A(pathR);
                            }
                            if (zE08) {
                                d0(ceiVar.h);
                            }
                        }
                    }
                } else if (jfiVar instanceof hei) {
                    hei heiVar = (hei) jfiVar;
                    nei neiVar13 = heiVar.q;
                    if (neiVar13 != null && heiVar.r != null && !neiVar13.j() && !heiVar.r.j()) {
                        H0((ggi) this.d, heiVar);
                        if (y() && K0()) {
                            Matrix matrix8 = heiVar.n;
                            if (matrix8 != null) {
                                ((Canvas) this.b).concat(matrix8);
                            }
                            Path pathS = S(heiVar);
                            E0(heiVar);
                            s(heiVar);
                            r(heiVar, heiVar.h);
                            boolean zE09 = e0();
                            if (((ggi) this.d).b) {
                                z(heiVar, pathS);
                            }
                            if (((ggi) this.d).c) {
                                A(pathS);
                            }
                            if (zE09) {
                                d0(heiVar.h);
                            }
                        }
                    }
                } else if (jfiVar instanceof oei) {
                    oei oeiVar = (oei) jfiVar;
                    H0((ggi) this.d, oeiVar);
                    if (y() && K0() && ((ggi) this.d).c) {
                        Matrix matrix9 = oeiVar.n;
                        if (matrix9 != null) {
                            ((Canvas) this.b).concat(matrix9);
                        }
                        nei neiVar14 = oeiVar.o;
                        float f5 = neiVar14 == null ? 0.0f : neiVar14.f(this);
                        nei neiVar15 = oeiVar.p;
                        float fG2 = neiVar15 == null ? 0.0f : neiVar15.g(this);
                        nei neiVar16 = oeiVar.q;
                        float f6 = neiVar16 == null ? 0.0f : neiVar16.f(this);
                        nei neiVar17 = oeiVar.r;
                        fG = neiVar17 != null ? neiVar17.g(this) : 0.0f;
                        if (oeiVar.h == null) {
                            oeiVar.h = new ree(Math.min(f5, f6), Math.min(fG2, fG), Math.abs(f6 - f5), Math.abs(fG - fG2));
                        }
                        Path path2 = new Path();
                        path2.moveTo(f5, fG2);
                        path2.lineTo(f6, fG);
                        E0(oeiVar);
                        s(oeiVar);
                        r(oeiVar, oeiVar.h);
                        boolean zE010 = e0();
                        A(path2);
                        j0(oeiVar);
                        if (zE010) {
                            d0(oeiVar.h);
                        }
                    }
                } else if (jfiVar instanceof xei) {
                    xei xeiVar = (xei) jfiVar;
                    H0((ggi) this.d, xeiVar);
                    if (y() && K0()) {
                        ggi ggiVar6 = (ggi) this.d;
                        if (ggiVar6.c || ggiVar6.b) {
                            Matrix matrix10 = xeiVar.n;
                            if (matrix10 != null) {
                                ((Canvas) this.b).concat(matrix10);
                            }
                            if (xeiVar.o.length >= 2) {
                                Path pathT = T(xeiVar);
                                E0(xeiVar);
                                s(xeiVar);
                                r(xeiVar, xeiVar.h);
                                boolean zE011 = e0();
                                if (((ggi) this.d).b) {
                                    z(xeiVar, pathT);
                                }
                                if (((ggi) this.d).c) {
                                    A(pathT);
                                }
                                j0(xeiVar);
                                if (zE011) {
                                    d0(xeiVar.h);
                                }
                            }
                        }
                    }
                } else if (jfiVar instanceof wei) {
                    wei weiVar = (wei) jfiVar;
                    H0((ggi) this.d, weiVar);
                    if (y() && K0()) {
                        ggi ggiVar7 = (ggi) this.d;
                        if (ggiVar7.c || ggiVar7.b) {
                            Matrix matrix11 = weiVar.n;
                            if (matrix11 != null) {
                                ((Canvas) this.b).concat(matrix11);
                            }
                            if (weiVar.o.length >= 2) {
                                Path pathT2 = T(weiVar);
                                E0(weiVar);
                                int i3 = ((ggi) this.d).a.D;
                                pathT2.setFillType((i3 == 0 || i3 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                s(weiVar);
                                r(weiVar, weiVar.h);
                                boolean zE012 = e0();
                                if (((ggi) this.d).b) {
                                    z(weiVar, pathT2);
                                }
                                if (((ggi) this.d).c) {
                                    A(pathT2);
                                }
                                j0(weiVar);
                                if (zE012) {
                                    d0(weiVar.h);
                                }
                            }
                        }
                    }
                } else if (jfiVar instanceof sfi) {
                    sfi sfiVar = (sfi) jfiVar;
                    H0((ggi) this.d, sfiVar);
                    if (y()) {
                        Matrix matrix12 = sfiVar.r;
                        if (matrix12 != null) {
                            ((Canvas) this.b).concat(matrix12);
                        }
                        ArrayList arrayList2 = sfiVar.n;
                        float f7 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((nei) sfiVar.n.get(0)).f(this);
                        ArrayList arrayList3 = sfiVar.o;
                        float fG3 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((nei) sfiVar.o.get(0)).g(this);
                        ArrayList arrayList4 = sfiVar.p;
                        float f8 = (arrayList4 == null || arrayList4.size() == 0) ? 0.0f : ((nei) sfiVar.p.get(0)).f(this);
                        ArrayList arrayList5 = sfiVar.q;
                        if (arrayList5 != null && arrayList5.size() != 0) {
                            fG = ((nei) sfiVar.q.get(0)).g(this);
                        }
                        int iK = K();
                        if (iK != 1) {
                            float fO = o(sfiVar);
                            if (iK == 2) {
                                fO /= 2.0f;
                            }
                            f7 -= fO;
                        }
                        if (sfiVar.h == null) {
                            fgi fgiVar = new fgi(this, f7, fG3);
                            C(sfiVar, fgiVar);
                            RectF rectF = (RectF) fgiVar.f;
                            sfiVar.h = new ree(rectF.left, rectF.top, rectF.width(), ((RectF) fgiVar.f).height());
                        }
                        E0(sfiVar);
                        s(sfiVar);
                        r(sfiVar, sfiVar.h);
                        boolean zE013 = e0();
                        C(sfiVar, new egi(this, f7 + f8, fG3 + fG));
                        if (zE013) {
                            d0(sfiVar.h);
                        }
                    }
                }
            }
        }
        w0();
    }

    public final d30 h() throws GeneralSecurityException {
        if (((Integer) this.b) == null) {
            t3p.w("AES key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            t3p.w("HMAC key size is not set");
            return null;
        }
        if (((Integer) this.d) == null) {
            t3p.w("iv size is not set");
            return null;
        }
        Integer num = (Integer) this.e;
        if (num == null) {
            t3p.w("tag size is not set");
            return null;
        }
        if (((b30) this.f) == null) {
            t3p.w("hash type is not set");
            return null;
        }
        if (((c30) this.g) == null) {
            t3p.w("variant is not set");
            return null;
        }
        int iIntValue = num.intValue();
        b30 b30Var = (b30) this.f;
        if (b30Var == b30.c) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (b30Var == b30.d) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (b30Var == b30.e) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (b30Var == b30.f) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (b30Var != b30.g) {
                t3p.w("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new d30(((Integer) this.b).intValue(), ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), (c30) this.g, (b30) this.f);
    }

    public final void h0(ffi ffiVar, boolean z) {
        if (z) {
            ((Stack) this.f).push(ffiVar);
            ((Stack) this.g).push(((Canvas) this.b).getMatrix());
        }
        Iterator it = ffiVar.h().iterator();
        while (it.hasNext()) {
            g0((jfi) it.next());
        }
        if (z) {
            ((Stack) this.f).pop();
            ((Stack) this.g).pop();
        }
    }

    public final bnd i() {
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelableArrayList("controlFilters", new ArrayList<>((ArrayList) this.d));
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>((ArrayList) this.c));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>((HashSet) this.e));
        return new bnd((String) this.g, bundle, (List) this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe A[PHI: r2
      0x00fe: PHI (r2v1 float) = (r2v0 float), (r2v2 float) binds: [B:62:0x00f2, B:65:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(defpackage.pei r13, defpackage.bgi r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igi.i0(pei, bgi):void");
    }

    public final void j() {
        F0();
    }

    public final void j0(jei jeiVar) {
        pei peiVar;
        pei peiVar2;
        pei peiVar3;
        int i2;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        bfi bfiVar = ((ggi) this.d).a;
        String str = bfiVar.q;
        if (str == null && bfiVar.r == null && bfiVar.s == null) {
            return;
        }
        if (str == null) {
            peiVar = null;
        } else {
            hfi hfiVarD = jeiVar.a.D(str);
            if (hfiVarD != null) {
                peiVar = (pei) hfiVarD;
            } else {
                String str2 = ((ggi) this.d).a.q;
                peiVar = null;
            }
        }
        String str3 = ((ggi) this.d).a.r;
        if (str3 == null) {
            peiVar2 = null;
        } else {
            hfi hfiVarD2 = jeiVar.a.D(str3);
            if (hfiVarD2 != null) {
                peiVar2 = (pei) hfiVarD2;
            } else {
                String str4 = ((ggi) this.d).a.r;
                peiVar2 = null;
            }
        }
        String str5 = ((ggi) this.d).a.s;
        if (str5 == null) {
            peiVar3 = null;
        } else {
            hfi hfiVarD3 = jeiVar.a.D(str5);
            if (hfiVarD3 != null) {
                peiVar3 = (pei) hfiVarD3;
            } else {
                String str6 = ((ggi) this.d).a.s;
                peiVar3 = null;
            }
        }
        float f4 = 0.0f;
        if (jeiVar instanceof tei) {
            arrayList = new agi(this, ((tei) jeiVar).o).a;
            f2 = 0.0f;
            i2 = 1;
        } else if (jeiVar instanceof oei) {
            oei oeiVar = (oei) jeiVar;
            nei neiVar = oeiVar.o;
            float f5 = neiVar != null ? neiVar.f(this) : 0.0f;
            nei neiVar2 = oeiVar.p;
            float fG = neiVar2 != null ? neiVar2.g(this) : 0.0f;
            nei neiVar3 = oeiVar.q;
            float f6 = neiVar3 != null ? neiVar3.f(this) : 0.0f;
            nei neiVar4 = oeiVar.r;
            float fG2 = neiVar4 != null ? neiVar4.g(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f7 = f6 - f5;
            i2 = 1;
            float f8 = fG2 - fG;
            arrayList2.add(new bgi(f5, fG, f7, f8));
            arrayList2.add(new bgi(f6, fG2, f7, f8));
            f2 = 0.0f;
            arrayList = arrayList2;
        } else {
            i2 = 1;
            wei weiVar = (wei) jeiVar;
            int length = weiVar.o.length;
            if (length < 2) {
                arrayList = null;
                f2 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = weiVar.o;
                bgi bgiVar = new bgi(fArr[0], fArr[1], 0.0f, 0.0f);
                int i3 = 2;
                float f9 = 0.0f;
                float f10 = 0.0f;
                while (true) {
                    f = bgiVar.b;
                    f2 = f4;
                    f3 = bgiVar.a;
                    if (i3 >= length) {
                        break;
                    }
                    float[] fArr2 = weiVar.o;
                    float f11 = fArr2[i3];
                    float f12 = fArr2[i3 + 1];
                    bgiVar.a(f11, f12);
                    arrayList3.add(bgiVar);
                    bgiVar = new bgi(f11, f12, f11 - f3, f12 - f);
                    i3 += 2;
                    f10 = f12;
                    f9 = f11;
                    f4 = f2;
                }
                if (weiVar instanceof xei) {
                    float[] fArr3 = weiVar.o;
                    float f13 = fArr3[0];
                    if (f9 != f13) {
                        float f14 = fArr3[1];
                        if (f10 != f14) {
                            bgiVar.a(f13, f14);
                            arrayList3.add(bgiVar);
                            bgi bgiVar2 = new bgi(f13, f14, f13 - f3, f14 - f);
                            bgiVar2.b((bgi) arrayList3.get(0));
                            arrayList3.add(bgiVar2);
                            arrayList3.set(0, bgiVar2);
                        }
                    }
                } else {
                    arrayList3.add(bgiVar);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        bfi bfiVar2 = ((ggi) this.d).a;
        bfiVar2.s = null;
        bfiVar2.r = null;
        bfiVar2.q = null;
        if (peiVar != null) {
            i0(peiVar, (bgi) arrayList.get(0));
        }
        if (peiVar2 != null && arrayList.size() > 2) {
            bgi bgiVar3 = (bgi) arrayList.get(0);
            bgi bgiVar4 = (bgi) arrayList.get(i2);
            int i4 = 1;
            while (i4 < size - 1) {
                i4++;
                bgi bgiVar5 = (bgi) arrayList.get(i4);
                if (bgiVar4.e) {
                    float f15 = bgiVar4.c;
                    float f16 = bgiVar4.d;
                    float f17 = bgiVar4.a;
                    float f18 = f17 - bgiVar3.a;
                    float f19 = bgiVar4.b;
                    float f20 = ((f19 - bgiVar3.b) * f16) + (f18 * f15);
                    if (f20 == f2) {
                        f20 = ((bgiVar5.a - f17) * f15) + ((bgiVar5.b - f19) * f16);
                    }
                    if (f20 <= f2 && (f20 != f2 || (f15 <= f2 && f16 < f2))) {
                        bgiVar4.c = -f15;
                        bgiVar4.d = -f16;
                    }
                }
                i0(peiVar2, bgiVar4);
                bgiVar3 = bgiVar4;
                bgiVar4 = bgiVar5;
            }
        }
        if (peiVar3 != null) {
            i0(peiVar3, (bgi) arrayList.get(size - 1));
        }
    }

    public final ylh k() {
        ke5 ke5Var;
        Context context = (Context) this.b;
        zya zyaVar = (zya) this.c;
        hn8 hn8Var = new hn8(zi4.d0(((gn8) this.g).a));
        g29 g29Var = zyaVar.a;
        CoroutineContext coroutineContext = zyaVar.b;
        mr6 mr6Var = mr6.b;
        j74 j74Var = j74.c;
        opj opjVar = zyaVar.c;
        lli lliVar = lli.a;
        wog wogVar = wog.a;
        zya zyaVar2 = new zya(g29Var, coroutineContext, opjVar, hn8Var);
        zyk zykVarB = z4c.b(new be8((byte) 23));
        zyk zykVarB2 = (zyk) this.d;
        if (zykVarB2 == null) {
            zykVarB2 = z4c.b(new al7(this, (byte) 26));
        }
        zyk zykVarB3 = (zyk) this.e;
        if (zykVarB3 == null) {
            zykVarB3 = z4c.b(new be8((byte) 24));
        }
        ke5 ke5Var2 = (ke5) this.f;
        if (ke5Var2 == null) {
            l08 l08Var = l08.a;
            ke5Var = new ke5(l08Var, l08Var, l08Var, l08Var, l08Var);
        } else {
            ke5Var = ke5Var2;
        }
        return new ylh(new wlh(context, zyaVar2, zykVarB, zykVarB2, zykVarB3, ke5Var));
    }

    public final void k0(qei qeiVar, ree reeVar) {
        float f;
        float fG;
        Canvas canvas = (Canvas) this.b;
        Boolean bool = qeiVar.n;
        if (bool == null || !bool.booleanValue()) {
            nei neiVar = qeiVar.p;
            float fE = neiVar != null ? neiVar.e(this, 1.0f) : 1.2f;
            nei neiVar2 = qeiVar.q;
            float fE2 = neiVar2 != null ? neiVar2.e(this, 1.0f) : 1.2f;
            f = fE * reeVar.d;
            fG = fE2 * reeVar.e;
        } else {
            nei neiVar3 = qeiVar.p;
            f = neiVar3 != null ? neiVar3.f(this) : reeVar.d;
            nei neiVar4 = qeiVar.q;
            fG = neiVar4 != null ? neiVar4.g(this) : reeVar.e;
        }
        if (f == 0.0f || fG == 0.0f) {
            return;
        }
        x0();
        ggi ggiVarI = I(qeiVar);
        this.d = ggiVarI;
        ggiVarI.a.j = Float.valueOf(1.0f);
        boolean zE0 = e0();
        canvas.save();
        Boolean bool2 = qeiVar.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(reeVar.b, reeVar.c);
            canvas.scale(reeVar.d, reeVar.e);
        }
        h0(qeiVar, false);
        canvas.restore();
        if (zE0) {
            d0(reeVar);
        }
        w0();
    }

    public final Path l(gfi gfiVar, ree reeVar) {
        Path pathW;
        hfi hfiVarD = gfiVar.a.D(((ggi) this.d).a.x);
        if (hfiVarD == null) {
            String str = ((ggi) this.d).a.x;
            return null;
        }
        dei deiVar = (dei) hfiVarD;
        ((Stack) this.e).push((ggi) this.d);
        this.d = I(deiVar);
        Boolean bool = deiVar.o;
        int i2 = 0;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(reeVar.b, reeVar.c);
            matrix.preScale(reeVar.d, reeVar.e);
        }
        Matrix matrix2 = deiVar.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        ArrayList arrayList = deiVar.i;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            jfi jfiVar = (jfi) obj;
            if ((jfiVar instanceof gfi) && (pathW = W((gfi) jfiVar)) != null) {
                path.op(pathW, Path.Op.UNION);
            }
        }
        if (((ggi) this.d).a.x != null) {
            ree reeVarN = deiVar.h;
            if (reeVarN == null) {
                reeVarN = n(path);
                deiVar.h = reeVarN;
            }
            Path pathL = l(deiVar, reeVarN);
            if (pathL != null) {
                path.op(pathL, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.d = (ggi) ((Stack) this.e).pop();
        return path;
    }

    public final void l0(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.b = Integer.valueOf(i2);
    }

    public final void m(kze kzeVar) {
        a26.U((SettingsManager) this.b, kzeVar, new s9(this, (byte) 4), new lb((byte) 1));
        yk6 yk6Var = (yk6) this.c;
        final byte b = 0;
        a26.T(yk6Var.i, kzeVar, new f7f(this) { // from class: pc2
            public final /* synthetic */ igi b;

            {
                this.b = this;
            }

            @Override // defpackage.f7f
            public final void d0(Object obj) {
                byte b2 = b;
                igi igiVar = this.b;
                switch (b2) {
                    case 0:
                        ((Boolean) obj).getClass();
                        igiVar.F0();
                        break;
                    case 1:
                        ((Boolean) obj).getClass();
                        igiVar.F0();
                        break;
                    case 2:
                        ((Boolean) obj).getClass();
                        igiVar.F0();
                        break;
                    default:
                        igiVar.F0();
                        break;
                }
            }
        });
        final byte b2 = 1;
        a26.T(yk6Var.p, kzeVar, new f7f(this) { // from class: pc2
            public final /* synthetic */ igi b;

            {
                this.b = this;
            }

            @Override // defpackage.f7f
            public final void d0(Object obj) {
                byte b22 = b2;
                igi igiVar = this.b;
                switch (b22) {
                    case 0:
                        ((Boolean) obj).getClass();
                        igiVar.F0();
                        break;
                    case 1:
                        ((Boolean) obj).getClass();
                        igiVar.F0();
                        break;
                    case 2:
                        ((Boolean) obj).getClass();
                        igiVar.F0();
                        break;
                    default:
                        igiVar.F0();
                        break;
                }
            }
        });
        final byte b3 = 2;
        a26.T(yk6Var.q, kzeVar, new f7f(this) { // from class: pc2
            public final /* synthetic */ igi b;

            {
                this.b = this;
            }

            @Override // defpackage.f7f
            public final void d0(Object obj) {
                byte b22 = b3;
                igi igiVar = this.b;
                switch (b22) {
                    case 0:
                        ((Boolean) obj).getClass();
                        igiVar.F0();
                        break;
                    case 1:
                        ((Boolean) obj).getClass();
                        igiVar.F0();
                        break;
                    case 2:
                        ((Boolean) obj).getClass();
                        igiVar.F0();
                        break;
                    default:
                        igiVar.F0();
                        break;
                }
            }
        });
        final byte b4 = 3;
        a26.T((kze) this.f, kzeVar, new f7f(this) { // from class: pc2
            public final /* synthetic */ igi b;

            {
                this.b = this;
            }

            @Override // defpackage.f7f
            public final void d0(Object obj) {
                byte b22 = b4;
                igi igiVar = this.b;
                switch (b22) {
                    case 0:
                        ((Boolean) obj).getClass();
                        igiVar.F0();
                        break;
                    case 1:
                        ((Boolean) obj).getClass();
                        igiVar.F0();
                        break;
                    case 2:
                        ((Boolean) obj).getClass();
                        igiVar.F0();
                        break;
                    default:
                        igiVar.F0();
                        break;
                }
            }
        });
    }

    public final void m0(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float fG = f4 + f2;
        i3j i3jVar = ((ggi) this.d).a.p;
        if (i3jVar != null) {
            f += ((nei) i3jVar.d).f(this);
            f2 += ((nei) ((ggi) this.d).a.p.a).g(this);
            f5 -= ((nei) ((ggi) this.d).a.p.b).f(this);
            fG -= ((nei) ((ggi) this.d).a.p.c).g(this);
        }
        ((Canvas) this.b).clipRect(f, f2, f5, fG);
    }

    public final void n0(String str, Bundle bundle, boolean z) {
        String str2;
        String strEncodeToString;
        boolean zE;
        int i2;
        char c;
        bundle.putString("scope", "*");
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        r49 r49Var = (r49) this.b;
        r49Var.a();
        bundle.putString("gmp_app_id", r49Var.c.b);
        bundle.putString("gmsv", Integer.toString(((mxd) this.c).c()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((mxd) this.c).a());
        mxd mxdVar = (mxd) this.c;
        synchronized (mxdVar) {
            if (mxdVar.c == null) {
                mxdVar.e();
            }
            str2 = mxdVar.c;
        }
        bundle.putString("app_ver_name", str2);
        r49 r49Var2 = (r49) this.b;
        r49Var2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(r49Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        if (z) {
            r49 r49Var3 = (r49) this.b;
            r49Var3.a();
            bundle.putString("Goog-Api-Key", r49Var3.c.a);
        }
        try {
            String str3 = ((vn2) Tasks.await(((y49) this.g).d())).a;
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(((y49) this.g).c()));
        bundle.putString("cliv", "fcm-26.0.0");
        pq6 pq6Var = (p9a) ((l7h) this.f).get();
        xx6 xx6Var = (xx6) ((l7h) this.e).get();
        if (pq6Var == null || xx6Var == null) {
            return;
        }
        pq6 pq6Var2 = pq6Var;
        synchronized (pq6Var2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            r9a r9aVar = (r9a) pq6Var2.a.get();
            synchronized (r9aVar) {
                try {
                    zE = r9aVar.e(jCurrentTimeMillis);
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = 1;
            if (zE) {
                synchronized (r9aVar) {
                    r9aVar.a.a(new tx0(r9aVar, r9a.b(System.currentTimeMillis()), (byte) 16));
                }
                c = 3;
            } else {
                c = 1;
            }
        }
        if (c != 1) {
            if (c == 1) {
                i2 = 0;
            } else if (c != 2) {
                if (c != 3) {
                    throw null;
                }
                i2 = 2;
            }
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(i2));
            bundle.putString("Firebase-Client", xx6Var.a());
        }
    }

    public final float o(ufi ufiVar) {
        hgi hgiVar = new hgi(this);
        C(ufiVar, hgiVar);
        return hgiVar.b;
    }

    public final void o0(int i2) throws InvalidAlgorithmParameterException {
        if (i2 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i2)));
        }
        this.c = Integer.valueOf(i2);
    }

    public final void p0(int i2) throws GeneralSecurityException {
        if (i2 < 12 || i2 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i2)));
        }
        this.d = Integer.valueOf(i2);
    }

    public final void q(vf7 vf7Var) {
        ((List) ((HashMap) this.b).get(vf7Var)).clear();
        ((HashMap) this.c).remove(vf7Var);
        ((NotificationManager) this.e).cancel(vf7Var.a);
    }

    public final void r(gfi gfiVar, ree reeVar) {
        Path pathL;
        if (((ggi) this.d).a.x == null || (pathL = l(gfiVar, reeVar)) == null) {
            return;
        }
        ((Canvas) this.b).clipPath(pathL);
    }

    public final void s(gfi gfiVar) {
        kfi kfiVar = ((ggi) this.d).a.b;
        if (kfiVar instanceof sei) {
            x(true, gfiVar.h, (sei) kfiVar);
        }
        kfi kfiVar2 = ((ggi) this.d).a.d;
        if (kfiVar2 instanceof sei) {
            x(false, gfiVar.h, (sei) kfiVar2);
        }
    }

    public final void t0(int i2) throws GeneralSecurityException {
        if (i2 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i2)));
        }
        this.e = Integer.valueOf(i2);
    }

    public final void u() {
        HashMap map = (HashMap) this.f;
        for (Long l : map.keySet()) {
            u7k u7kVar = (u7k) this.g;
            ((WebContentsAccessibilityImpl) u7kVar.a).i.removeCallbacks((Runnable) map.get(l));
        }
        map.clear();
    }

    public final void v0() {
        ((jbn) ((Lazy) this.b).get()).e(((Boolean) ((brk) this.d).invoke()).booleanValue() ? new mw0((ru9) ((yqk) this.c).get()) : null, new jv7(this, (byte) 1));
    }

    public final void w0() {
        ((Canvas) this.b).restore();
        this.d = (ggi) ((Stack) this.e).pop();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6 A[PHI: r11 r12 r15 r17
      0x00b6: PHI (r11v9 float) = (r11v6 float), (r11v15 float) binds: [B:61:0x00ae, B:46:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r12v7 float) = (r12v5 float), (r12v12 float) binds: [B:61:0x00ae, B:46:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r15v13 float) = (r15v11 float), (r15v20 float) binds: [B:61:0x00ae, B:46:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r17v2 float) = (r17v1 float), (r17v4 float) binds: [B:61:0x00ae, B:46:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(boolean r27, defpackage.ree r28, defpackage.sei r29) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igi.x(boolean, ree, sei):void");
    }

    public final void x0() {
        ((Canvas) this.b).save();
        ((Stack) this.e).push((ggi) this.d);
        this.d = new ggi((ggi) this.d);
    }

    public final boolean y() {
        Boolean bool = ((ggi) this.d).a.t;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void y0() {
        abn abnVar = (abn) this.g;
        if (abnVar != null) {
            abnVar.cancel();
        }
        this.g = null;
        xf8.E0((ode) this.f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.gfi r23, android.graphics.Path r24) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igi.z(gfi, android.graphics.Path):void");
    }

    public final String z0(String str, boolean z, boolean z2) {
        if (((ggi) this.d).h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }
}
