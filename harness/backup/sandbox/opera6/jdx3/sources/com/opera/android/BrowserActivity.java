package com.opera.android;

import J.N;
import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.assist.AssistContent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.w;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.bar.BottomBar;
import com.opera.android.bar.TopToolbarContainer;
import com.opera.android.bookmarks.h;
import com.opera.android.browser.BrowserContainer;
import com.opera.android.browser.BrowserFragment;
import com.opera.android.browser.BrowserFragmentFrameLayout;
import com.opera.android.browser.SessionStore;
import com.opera.android.browser.TabInfo;
import com.opera.android.browser.a;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.chromium.OperaBrowserContext;
import com.opera.android.custom_views.LayoutDirectionActionBarContextView;
import com.opera.android.esim.ui.EsimActivity;
import com.opera.android.history.HistoryManager;
import com.opera.android.settings.SettingsManager;
import com.opera.android.settings.SystemSettings;
import com.opera.android.sheet.VelocityTrackingCoordinatorLayout;
import com.opera.android.startup.InstallSplitLocaleActivity;
import com.opera.api.Callback;
import defpackage.a4m;
import defpackage.aal;
import defpackage.ac8;
import defpackage.af3;
import defpackage.ajn;
import defpackage.ami;
import defpackage.au3;
import defpackage.au5;
import defpackage.av3;
import defpackage.ava;
import defpackage.avl;
import defpackage.b1o;
import defpackage.b2l;
import defpackage.b49;
import defpackage.b7j;
import defpackage.bbk;
import defpackage.bi2;
import defpackage.bjn;
import defpackage.bl6;
import defpackage.bp3;
import defpackage.bq3;
import defpackage.bsi;
import defpackage.bt2;
import defpackage.btl;
import defpackage.bu3;
import defpackage.bv;
import defpackage.bvl;
import defpackage.by3;
import defpackage.c1a;
import defpackage.c37;
import defpackage.c5k;
import defpackage.c8j;
import defpackage.c8l;
import defpackage.cbk;
import defpackage.cdn;
import defpackage.cjm;
import defpackage.cp3;
import defpackage.ctl;
import defpackage.cul;
import defpackage.cv3;
import defpackage.d12;
import defpackage.d5k;
import defpackage.d62;
import defpackage.d7j;
import defpackage.d7l;
import defpackage.d8j;
import defpackage.db;
import defpackage.dbf;
import defpackage.dbl;
import defpackage.dp3;
import defpackage.dq9;
import defpackage.dse;
import defpackage.du3;
import defpackage.dv3;
import defpackage.dw;
import defpackage.dxe;
import defpackage.dxk;
import defpackage.dyf;
import defpackage.e3j;
import defpackage.e7j;
import defpackage.eac;
import defpackage.eb;
import defpackage.eb8;
import defpackage.ebh;
import defpackage.eej;
import defpackage.ekn;
import defpackage.ep3;
import defpackage.eq3;
import defpackage.eq6;
import defpackage.eqe;
import defpackage.eri;
import defpackage.eu3;
import defpackage.ev3;
import defpackage.ex0;
import defpackage.ex3;
import defpackage.f1p;
import defpackage.f70;
import defpackage.f7d;
import defpackage.f84;
import defpackage.fd;
import defpackage.fen;
import defpackage.fi7;
import defpackage.fj;
import defpackage.fnh;
import defpackage.fp3;
import defpackage.fqe;
import defpackage.fsp;
import defpackage.fu3;
import defpackage.fw3;
import defpackage.fyk;
import defpackage.g1j;
import defpackage.g70;
import defpackage.g8j;
import defpackage.ga6;
import defpackage.gbf;
import defpackage.geg;
import defpackage.gf;
import defpackage.gh2;
import defpackage.gjm;
import defpackage.gu3;
import defpackage.gu5;
import defpackage.gv3;
import defpackage.gyf;
import defpackage.h70;
import defpackage.h73;
import defpackage.hbf;
import defpackage.hgn;
import defpackage.hj;
import defpackage.hsj;
import defpackage.hv3;
import defpackage.hvl;
import defpackage.hw3;
import defpackage.hx3;
import defpackage.i0l;
import defpackage.i16;
import defpackage.i7d;
import defpackage.i7f;
import defpackage.iga;
import defpackage.ij6;
import defpackage.ijf;
import defpackage.ijm;
import defpackage.ilk;
import defpackage.im6;
import defpackage.in3;
import defpackage.io7;
import defpackage.ipk;
import defpackage.iv3;
import defpackage.izj;
import defpackage.j4c;
import defpackage.jc9;
import defpackage.ji;
import defpackage.jl6;
import defpackage.jp3;
import defpackage.jri;
import defpackage.jt3;
import defpackage.jtg;
import defpackage.ju1;
import defpackage.jv0;
import defpackage.jv3;
import defpackage.jvj;
import defpackage.jw0;
import defpackage.jze;
import defpackage.k3;
import defpackage.k5o;
import defpackage.k6l;
import defpackage.k7k;
import defpackage.k9;
import defpackage.kd7;
import defpackage.kf;
import defpackage.km5;
import defpackage.ko3;
import defpackage.kp3;
import defpackage.ks3;
import defpackage.ku3;
import defpackage.ku5;
import defpackage.kwf;
import defpackage.kze;
import defpackage.l0h;
import defpackage.l24;
import defpackage.l42;
import defpackage.l4k;
import defpackage.lg;
import defpackage.lim;
import defpackage.ll9;
import defpackage.lnf;
import defpackage.lpe;
import defpackage.lqm;
import defpackage.lv3;
import defpackage.lx3;
import defpackage.m4k;
import defpackage.m5h;
import defpackage.m5k;
import defpackage.m6m;
import defpackage.mcj;
import defpackage.mdh;
import defpackage.meg;
import defpackage.mm6;
import defpackage.mo3;
import defpackage.mp3;
import defpackage.mri;
import defpackage.mt3;
import defpackage.mv3;
import defpackage.mxe;
import defpackage.n03;
import defpackage.n7n;
import defpackage.nej;
import defpackage.ngh;
import defpackage.nje;
import defpackage.nke;
import defpackage.no7;
import defpackage.np3;
import defpackage.nqe;
import defpackage.ntl;
import defpackage.nue;
import defpackage.nv2;
import defpackage.nv3;
import defpackage.nwf;
import defpackage.o3k;
import defpackage.o73;
import defpackage.o8k;
import defpackage.och;
import defpackage.og5;
import defpackage.oji;
import defpackage.ojn;
import defpackage.ol2;
import defpackage.olh;
import defpackage.oml;
import defpackage.osf;
import defpackage.ou3;
import defpackage.ox1;
import defpackage.oz3;
import defpackage.p12;
import defpackage.p3k;
import defpackage.p6l;
import defpackage.p8f;
import defpackage.pde;
import defpackage.pgf;
import defpackage.po3;
import defpackage.pp3;
import defpackage.pqe;
import defpackage.pt3;
import defpackage.pu3;
import defpackage.pv3;
import defpackage.pvk;
import defpackage.pvl;
import defpackage.pyl;
import defpackage.q0h;
import defpackage.q6e;
import defpackage.q82;
import defpackage.q9n;
import defpackage.qdh;
import defpackage.qim;
import defpackage.qjh;
import defpackage.qln;
import defpackage.qnc;
import defpackage.qo3;
import defpackage.qp2;
import defpackage.qq6;
import defpackage.qr8;
import defpackage.qs2;
import defpackage.qt;
import defpackage.qt3;
import defpackage.qwe;
import defpackage.qz;
import defpackage.r22;
import defpackage.r7n;
import defpackage.r9l;
import defpackage.re7;
import defpackage.rfn;
import defpackage.rkn;
import defpackage.rld;
import defpackage.rln;
import defpackage.rs2;
import defpackage.rt3;
import defpackage.ru9;
import defpackage.rv3;
import defpackage.rwe;
import defpackage.ryl;
import defpackage.s03;
import defpackage.s1;
import defpackage.s14;
import defpackage.s25;
import defpackage.s28;
import defpackage.s3l;
import defpackage.s9g;
import defpackage.sf7;
import defpackage.sjh;
import defpackage.snc;
import defpackage.som;
import defpackage.st3;
import defpackage.su;
import defpackage.sv3;
import defpackage.swf;
import defpackage.syn;
import defpackage.sz4;
import defpackage.t1;
import defpackage.t42;
import defpackage.t5d;
import defpackage.t82;
import defpackage.t8l;
import defpackage.t9l;
import defpackage.tah;
import defpackage.tg7;
import defpackage.tjg;
import defpackage.tjh;
import defpackage.tlg;
import defpackage.tqe;
import defpackage.tt2;
import defpackage.tt3;
import defpackage.tv3;
import defpackage.tw3;
import defpackage.tz5;
import defpackage.u0a;
import defpackage.u1;
import defpackage.u3l;
import defpackage.u8k;
import defpackage.u9n;
import defpackage.ucn;
import defpackage.ug;
import defpackage.umi;
import defpackage.uqe;
import defpackage.ut3;
import defpackage.uu1;
import defpackage.uu3;
import defpackage.uul;
import defpackage.uv3;
import defpackage.uvb;
import defpackage.uwf;
import defpackage.v1;
import defpackage.v1f;
import defpackage.v3m;
import defpackage.v9l;
import defpackage.vf7;
import defpackage.vln;
import defpackage.vml;
import defpackage.vt3;
import defpackage.vu3;
import defpackage.vv3;
import defpackage.vvb;
import defpackage.vx;
import defpackage.w6j;
import defpackage.w6o;
import defpackage.wcd;
import defpackage.wf7;
import defpackage.wg7;
import defpackage.wjh;
import defpackage.wnh;
import defpackage.wok;
import defpackage.wqm;
import defpackage.wt3;
import defpackage.wth;
import defpackage.wub;
import defpackage.wv1;
import defpackage.wx;
import defpackage.wy;
import defpackage.wzg;
import defpackage.x0f;
import defpackage.x1n;
import defpackage.x53;
import defpackage.x56;
import defpackage.x5f;
import defpackage.x7i;
import defpackage.x92;
import defpackage.xb;
import defpackage.xbf;
import defpackage.xg;
import defpackage.xj;
import defpackage.xln;
import defpackage.xnc;
import defpackage.xnh;
import defpackage.xt3;
import defpackage.xt8;
import defpackage.xv1;
import defpackage.xw8;
import defpackage.xx1;
import defpackage.y0f;
import defpackage.y4g;
import defpackage.ydn;
import defpackage.yen;
import defpackage.ykn;
import defpackage.yqa;
import defpackage.ysj;
import defpackage.ysl;
import defpackage.yug;
import defpackage.yyi;
import defpackage.yz9;
import defpackage.z1n;
import defpackage.z22;
import defpackage.z43;
import defpackage.z61;
import defpackage.z77;
import defpackage.z7f;
import defpackage.zhj;
import defpackage.zl;
import defpackage.zm;
import defpackage.zpa;
import defpackage.zqi;
import defpackage.zsd;
import defpackage.zt;
import defpackage.zt3;
import defpackage.zw8;
import defpackage.zwk;
import defpackage.zx1;
import defpackage.zy4;
import defpackage.zz2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0004:\u0012\t\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/opera/android/BrowserActivity;", "Lt5d;", "Lndc;", "Liga;", "", "Lzm;", "Ln7n;", "<init>", "()V", "hv3", "av3", "bv3", "d5o", "c5o", "dv3", "s03", "ou3", "ku3", "ev3", "gu3", "vu3", "ru3", "cv3", "pu3", "fu3", "uu3", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrowserActivity extends t5d implements iga, zm, n7n {
    public static int E1;
    public static boolean F1;
    public BottomBar A;
    public final j4c A0;
    public final j4c A1;
    public BrowserContainer B;
    public final j4c B0;
    public final zyk B1;
    public fnh C;
    public final j4c C0;
    public final zyk C1;
    public jvj D;
    public final jv3 D0;
    public int D1;
    public t82 E;
    public final jv3 E0;
    public w6j F;
    public final jv3 F0;
    public r22 G;
    public nke G0;
    public jp3 H;
    public bv H0;
    public r22 I;
    public ucn I0;
    public pu3 J;
    public rfn J0;
    public xg K;
    public fen K0;
    public c37 L;
    public final f1p L0;
    public gbf M;
    public final uu3 M0;
    public p8f N;
    public tg7 N0;
    public s28 O;
    public final ev3 O0;
    public boolean P;
    public gu3 P0;
    public RootView Q;
    public final vu3 Q0;
    public jl6 R;
    public final cv3 R0;
    public c37 S;
    public boolean S0;
    public d5k T;
    public boolean T0;
    public dxk U;
    public final pyl U0;
    public k6l V;
    public igi V0;
    public TopToolbarContainer W;
    public final vu3 W0;
    public bvl X;
    public final zpa X0;
    public m6m Y;
    public final zyk Y0;
    public final zyk Z;
    public final hv3 Z0;
    public final j4c a0;
    public final zyk a1;
    public final yqa b0;
    public sjh b1;
    public final jc9 c0;
    public final ku3 c1;
    public final wth d0;
    public final zyk d1;
    public final c5o e0;
    public c1a e1;
    public final kze f0;
    public final zyk f1;
    public final wub g0;
    public final ou3 g1;
    public final kze h0;
    public final zyk h1;
    public final kze i0;
    public final zyk i1;
    public final zyk j0;
    public boolean j1;
    public final zyk k0;
    public final z8b k1;
    public final j4c l0;
    public final pde l1;
    public final zyk m0;
    public final pde m1;
    public final sa2 n0;
    public boolean n1;
    public wjh o0;
    public boolean o1;
    public final j4c p0;
    public ebh p1;
    public boolean q0;
    public final vvb q1;
    public final int r0;
    public final mv3 r1;
    public eac s0;
    public final j4c s1;
    public final zyk t0;
    public final zyk t1;
    public final j4c u0;
    public final qq6 u1;
    public final j4c v0;
    public final zyk v1;
    public final j4c w0;
    public final j4c w1;
    public final umi x;
    public final j4c x0;
    public final j4c x1;
    public final tw3 y;
    public final j4c y0;
    public final pde y1;
    public z43 z;
    public final j4c z0;
    public final j4c z1;

    public BrowserActivity() {
        umi umiVar = vml.d;
        this.x = umiVar;
        byte b = 25;
        this.Z = z4c.b(new mt3(this, b));
        this.a0 = new j4c(new tt3(this, (byte) 22), (byte) 1);
        this.b0 = new yqa(this);
        byte b2 = 4;
        this.c0 = new jc9((byte) 4);
        byte b3 = 20;
        this.d0 = new wth(this, b3);
        this.e0 = new c5o((byte) 4);
        byte b4 = 0;
        this.f0 = new kze(new fi7(0, 0));
        byte b5 = 19;
        wub wubVar = new wub((byte) 19);
        this.g0 = wubVar;
        Boolean bool = Boolean.FALSE;
        this.h0 = new kze(bool);
        this.i0 = new kze(bool);
        this.j0 = z4c.b(new mt3(this, b3));
        this.k0 = z4c.b(new mt3(this, (byte) 23));
        byte b6 = 17;
        this.l0 = new j4c(new wt3(this, b6), (byte) 1);
        this.m0 = z4c.b(new nd3((byte) 2));
        this.n0 = new sa2((byte) 13, false);
        byte b7 = 18;
        this.p0 = new j4c(new wt3(this, b7), (byte) 1);
        int i = E1 + 1;
        E1 = i;
        this.r0 = i;
        byte b8 = 24;
        this.t0 = z4c.b(new mt3(this, b8));
        this.u0 = new j4c(new wt3(this, b5), (byte) 1);
        this.v0 = new j4c(new wt3(this, b3), (byte) 1);
        this.w0 = new j4c(new wt3(this, b8), (byte) 1);
        this.x0 = new j4c(new du3(this, b2), (byte) 1);
        byte b9 = 12;
        this.y0 = new j4c(new du3(this, b9), (byte) 1);
        this.z0 = new j4c(new du3(this, b7), (byte) 1);
        byte b10 = 21;
        this.A0 = new j4c(new du3(this, b10), (byte) 1);
        this.B0 = new j4c(new tt3(this, b4), (byte) 1);
        this.C0 = new j4c(new tt3(this, b2), (byte) 1);
        this.D0 = new jv3(this, (byte) 2);
        this.E0 = new jv3(this, b4);
        this.F0 = new jv3(this, (byte) 1);
        this.M0 = new uu3(this);
        this.O0 = new ev3(this);
        this.Q0 = new vu3(this);
        this.R0 = new cv3(this, b4);
        pyl pylVar = new pyl((byte) 7);
        pylVar.b = 3;
        this.U0 = pylVar;
        this.W0 = new vu3(this);
        this.X0 = new zpa(b);
        this.Y0 = z4c.b(new mt3(this, (byte) 6));
        this.Z0 = new hv3(this);
        this.a1 = z4c.b(new mt3(this, (byte) 8));
        this.c1 = new ku3(this);
        this.d1 = z4c.b(new mt3(this, (byte) 9));
        byte b11 = 11;
        this.f1 = z4c.b(new mt3(this, b11));
        this.g1 = new ou3(this);
        this.h1 = z4c.b(new mt3(this, (byte) 16));
        this.i1 = z4c.b(new mt3(this, b6));
        this.k1 = new z8b((byte) 25);
        this.l1 = new pde(Boolean.TRUE);
        this.m1 = new pde(0);
        this.q1 = new vvb(new uvb[]{new uvb(2131363286, 2, 45, new pt3(this, b9))});
        this.r1 = new mv3(this);
        this.s1 = new j4c(new wt3(this, (byte) 10), (byte) 1);
        this.t1 = z4c.b(new mt3(this, b7));
        this.u1 = new qq6((byte) 27);
        this.v1 = z4c.b(new mt3(this, b5));
        this.w1 = new j4c(new wt3(this, b11), (byte) 1);
        this.x1 = new j4c(new wt3(this, b9), (byte) 1);
        this.y1 = new pde(Float.valueOf(0.0f));
        this.z1 = new j4c(new wt3(this, (byte) 13), (byte) 1);
        this.A1 = new j4c(new wt3(this, (byte) 14), (byte) 1);
        this.B1 = z4c.b(new mt3(this, b10));
        this.C1 = z4c.b(new mt3(this, (byte) 22));
        this.u.t(new av3(this));
        wjh wjhVar = vml.e;
        hx3 hx3Var = this.n;
        this.y = new tw3(this, umiVar, wjhVar, hx3Var);
        gjm gjmVar = (gjm) hx3Var.p.get();
        wt3 wt3Var = new wt3(this, (byte) 15);
        wt3 wt3Var2 = new wt3(this, (byte) 16);
        p12 p12Var = new p12();
        p12Var.h = new HashMap();
        p12Var.a = this;
        p12Var.c = this;
        p12Var.d = umiVar;
        p12Var.e = wubVar;
        p12Var.b = gjmVar;
        p12Var.f = wt3Var;
        p12Var.g = wt3Var2;
        ((HashMap) p12Var.h).put("com.opera.android.action.VOICE_SEARCH_FROM_WIDGET", new zt3(this));
        f1p f1pVar = new f1p();
        f1pVar.a = new ArrayList();
        f1pVar.b = p12Var;
        this.L0 = f1pVar;
        gjm gjmVar2 = (gjm) hx3Var.p.get();
        fj[] fjVarArr = {new fj((byte) 0), new fj((byte) 1), new fj((byte) 2), new fj((byte) 4), new fj((byte) 12), new fj((byte) 14), new fj((byte) 15), new fj((byte) 7), new fj((byte) 13), new fj((byte) 16), new fj((byte) 5), new fj((byte) 10), new fj((byte) 3), new fj((byte) 11), new fj((byte) 8), new fj((byte) 9), new fj((byte) 17), new fj((byte) 6)};
        ArrayList arrayList = gjmVar2.d;
        Object[] objArrCopyOf = Arrays.copyOf(fjVarArr, 18);
        arrayList.addAll(objArrCopyOf.length > 0 ? Arrays.asList(objArrCopyOf) : l08.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0(Callback callback) {
        String[] strArr = OperaApplication.K;
        j4c j4cVar = ((OperaApplication) getApplication()).t;
        jg8 jg8Var = (jg8) vml.e.d;
        tcc lifecycle = getLifecycle();
        d12 d12Var = (d12) ox1.b.d(new Pair(this, this.x));
        d12Var.e("OFA.CHAT_KEY", new ai(callback, lifecycle, j4cVar, jg8Var, d12Var, (byte) 2));
    }

    public final void A1(o73 o73Var, View view) {
        ViewGroup viewGroup = (ViewGroup) findViewById(2131362656);
        if (viewGroup == null || !q9n.w(viewGroup, view)) {
            B1();
        }
        o73Var.p(view);
        M0().b0(null);
    }

    public final Fragment B0() {
        w supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentE = supportFragmentManager.E(2131363371);
        if (supportFragmentManager.J() <= 0 || fragmentE == null || !fragmentE.isVisible()) {
            return null;
        }
        return fragmentE;
    }

    public final void B1() {
        gbf gbfVar = this.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        gbfVar.m(true);
    }

    public final View C0(nje njeVar) {
        z43 z43Var = this.z;
        if (z43Var == null) {
            z43Var = null;
        }
        View viewG = z43Var.g(njeVar);
        if (viewG != null) {
            return viewG;
        }
        BottomBar bottomBar = this.A;
        return (bottomBar != null ? bottomBar : null).e(njeVar);
    }

    public final void C1() {
        RootView rootView = this.Q;
        if (rootView == null) {
            rootView = null;
        }
        boolean z = this.P || ((Boolean) S().d.g()).booleanValue();
        if (z == rootView.n) {
            return;
        }
        rootView.n = z;
        rootView.requestLayout();
        rootView.requestApplyInsets();
    }

    public final v1f D0() {
        return (v1f) this.v1.getValue();
    }

    public final dyf E0() {
        return (dyf) this.d1.getValue();
    }

    @Override // defpackage.dx3
    public final jv0 F() {
        return new k5o(this);
    }

    public final yug F0() {
        return (yug) this.y.a.m.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dx3
    public final List G(ChromiumContent chromiumContent) {
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        arrayList.add(new pqe(chromiumContent, operaApplication.L().c, this.l0, new tt3(this, (byte) 20), new ji(operaApplication, (byte) 5)));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ebh G0() {
        String[] strArr = OperaApplication.K;
        if (!((OperaApplication) getApplication()).D().b()) {
            return null;
        }
        ebh ebhVar = this.p1;
        if (ebhVar != null) {
            return ebhVar;
        }
        tw3 tw3Var = this.y;
        ebh ebhVar2 = new ebh(this, (af3) tw3Var.a.n().get(), tw3Var.a.a().e);
        this.p1 = ebhVar2;
        return ebhVar2;
    }

    @Override // defpackage.dx3
    public final g1j H() {
        return new wth(this);
    }

    public final SettingsManager H0() {
        return this.y.a.w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dx3
    public final List I(ChromiumContent chromiumContent) {
        csh cshVarI = super.I(chromiumContent);
        ArrayList arrayList = new ArrayList(cshVarI.d + 2);
        arrayList.addAll(cshVarI);
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        arrayList.add(new pqe(chromiumContent, operaApplication.L().c, this.l0, new tt3(this, (byte) 19), new ji(operaApplication, (byte) 4)));
        arrayList.add(new a(chromiumContent));
        return arrayList;
    }

    public final nej I0() {
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        return qimVar.d;
    }

    public final ysj J0() {
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        return qimVar.e;
    }

    public final izj K0() {
        return (izj) this.y.a.x().get();
    }

    public final ipk L0() {
        return (ipk) this.j0.getValue();
    }

    public final ysl M0() {
        return P().j.a;
    }

    @Override // defpackage.dx3
    /* renamed from: N */
    public final ex3 s() {
        return this.y;
    }

    public final ctl N0() {
        return (ctl) this.y.a.A().get();
    }

    @Override // defpackage.dx3
    public final eej O() {
        return (eej) this.f1.getValue();
    }

    public final ntl O0() {
        return new ntl(C0(nje.a) != null, C0(nje.b) != null, C0(nje.c) != null);
    }

    public final gjm P0() {
        return (gjm) this.y.a.p.get();
    }

    public final qln Q0() {
        return (qln) ((j4c) this.y.a.a.e).get();
    }

    public final void R0() {
        s3l s3lVar;
        b2l b2lVar;
        b2l b2lVarW0 = w0();
        if (b2lVarW0 != null) {
            k6l k6lVar = this.V;
            if (k6lVar == null) {
                k6lVar = null;
            }
            k6lVar.getClass();
            s3l s3lVar2 = u3l.a;
            int iOrdinal = b2lVarW0.T().ordinal();
            int i = 1;
            if (iOrdinal == 0) {
                s3lVar = u3l.a;
            } else {
                if (iOrdinal != 1) {
                    h9o.p();
                    return;
                }
                s3lVar = u3l.b;
            }
            ArrayList arrayList = k6lVar.b;
            int iIndexOf = arrayList.indexOf(b2lVarW0);
            while (true) {
                if (i >= arrayList.size()) {
                    b2lVar = b2lVarW0;
                    break;
                }
                b2lVar = (b2l) arrayList.get((iIndexOf + i) % arrayList.size());
                if (s3lVar.a(b2lVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (b2lVarW0 == b2lVar) {
                return;
            }
            k6l k6lVar2 = this.V;
            (k6lVar2 != null ? k6lVar2 : null).C(b2lVar, 3);
        }
    }

    public final void S0() {
        s3l s3lVar;
        b2l b2lVar;
        b2l b2lVarW0 = w0();
        if (b2lVarW0 != null) {
            k6l k6lVar = this.V;
            if (k6lVar == null) {
                k6lVar = null;
            }
            k6lVar.getClass();
            s3l s3lVar2 = u3l.a;
            int iOrdinal = b2lVarW0.T().ordinal();
            if (iOrdinal == 0) {
                s3lVar = u3l.a;
            } else {
                if (iOrdinal != 1) {
                    h9o.p();
                    return;
                }
                s3lVar = u3l.b;
            }
            ArrayList arrayList = k6lVar.b;
            int iIndexOf = arrayList.indexOf(b2lVarW0);
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 1) {
                    b2lVar = b2lVarW0;
                    break;
                }
                b2lVar = (b2l) arrayList.get((iIndexOf + size) % arrayList.size());
                if (s3lVar.a(b2lVar)) {
                    break;
                } else {
                    size--;
                }
            }
            if (b2lVarW0 == b2lVar) {
                return;
            }
            k6l k6lVar2 = this.V;
            (k6lVar2 != null ? k6lVar2 : null).C(b2lVar, 3);
        }
    }

    @Override // defpackage.dx3
    public final pt3 T() {
        return new pt3(this, (byte) 3);
    }

    public final void T0(BottomBar bottomBar) {
        po3 po3Var = (po3) this.y.q.get();
        csh cshVarW = h1b.w(po3Var.a, po3Var.b);
        ArrayList arrayList = new ArrayList(k95.o(cshVarW, 10));
        int i = cshVarW.d;
        int i2 = 0;
        while (i2 < i) {
            Object obj = cshVarW.get(i2);
            i2++;
            dp3 dp3Var = (dp3) obj;
            arrayList.add(new cp3(dp3Var, (pvk) dp3Var.a.get()));
        }
        bottomBar.d.e = new nv3(this, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U0() {
        r22 fp3Var;
        N0().b();
        btl btlVar = (btl) N0().e.g();
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        z43 z43Var = this.z;
        boolean z = (z43Var != null ? z43Var : null) instanceof pp3;
        byte b = 22;
        j4c j4cVar = this.A1;
        tw3 tw3Var = this.y;
        if (z) {
            if (btlVar.b) {
                BottomBar bottomBar = this.A;
                if (bottomBar == null) {
                    bottomBar = null;
                }
                if (z43Var == null) {
                    z43Var = null;
                }
                pp3 pp3Var = (pp3) z43Var;
                w6j w6jVar = this.F;
                if (w6jVar == null) {
                    w6jVar = null;
                }
                fp3Var = new ep3(this, bottomBar, pp3Var, w6jVar);
            } else if (btlVar.d) {
                jt3 jt3Var = (jt3) tw3Var.r.get();
                x5f x5fVar = operaApplication.L().c;
                fd fdVar = jt3Var.f;
                jze jzeVar = ((dq9) j4cVar.get()).b;
                SettingsManager settingsManagerH0 = H0();
                fw3 fw3Var = (fw3) tw3Var.p.get();
                BottomBar bottomBar2 = this.A;
                if (bottomBar2 == null) {
                    bottomBar2 = null;
                }
                k6l k6lVar = this.V;
                if (k6lVar == null) {
                    k6lVar = null;
                }
                BottomBar bottomBar3 = bottomBar2;
                v1f v1fVarD0 = D0();
                bq3 bq3Var = (bq3) tw3Var.o.get();
                BottomBar bottomBar4 = this.A;
                if (bottomBar4 == null) {
                    bottomBar4 = null;
                }
                k6l k6lVar2 = k6lVar;
                xj xjVar = new xj(bottomBar4, this, b);
                z43 z43Var2 = this.z;
                if (z43Var2 == null) {
                    z43Var2 = null;
                }
                pp3 pp3Var2 = (pp3) z43Var2;
                w6j w6jVar2 = this.F;
                if (w6jVar2 == null) {
                    w6jVar2 = null;
                }
                fp3Var = new ko3(this, x5fVar, fdVar, jzeVar, settingsManagerH0, fw3Var, bottomBar3, k6lVar2, v1fVarD0, bq3Var, xjVar, pp3Var2, w6jVar2, (byte) 0);
            } else {
                jt3 jt3Var2 = (jt3) tw3Var.r.get();
                x5f x5fVar2 = operaApplication.L().c;
                fd fdVar2 = jt3Var2.f;
                jze jzeVar2 = ((dq9) j4cVar.get()).b;
                SettingsManager settingsManagerH02 = H0();
                fw3 fw3Var2 = (fw3) tw3Var.p.get();
                BottomBar bottomBar5 = this.A;
                if (bottomBar5 == null) {
                    bottomBar5 = null;
                }
                k6l k6lVar3 = this.V;
                if (k6lVar3 == null) {
                    k6lVar3 = null;
                }
                BottomBar bottomBar6 = bottomBar5;
                v1f v1fVarD02 = D0();
                bq3 bq3Var2 = (bq3) tw3Var.o.get();
                BottomBar bottomBar7 = this.A;
                if (bottomBar7 == null) {
                    bottomBar7 = null;
                }
                k6l k6lVar4 = k6lVar3;
                xj xjVar2 = new xj(bottomBar7, this, b);
                z43 z43Var3 = this.z;
                if (z43Var3 == null) {
                    z43Var3 = null;
                }
                pp3 pp3Var3 = (pp3) z43Var3;
                w6j w6jVar3 = this.F;
                if (w6jVar3 == null) {
                    w6jVar3 = null;
                }
                fp3Var = new ko3(this, x5fVar2, fdVar2, jzeVar2, settingsManagerH02, fw3Var2, bottomBar6, k6lVar4, v1fVarD02, bq3Var2, xjVar2, pp3Var3, w6jVar3, (byte) 1);
            }
        } else if (btlVar.b) {
            BottomBar bottomBar8 = this.A;
            if (bottomBar8 == null) {
                bottomBar8 = null;
            }
            w6j w6jVar4 = this.F;
            if (w6jVar4 == null) {
                w6jVar4 = null;
            }
            fp3Var = new fp3(this, bottomBar8, w6jVar4, (byte) 0);
        } else {
            jt3 jt3Var3 = (jt3) tw3Var.r.get();
            x5f x5fVar3 = operaApplication.L().c;
            fd fdVar3 = jt3Var3.f;
            jze jzeVar3 = ((dq9) j4cVar.get()).b;
            SettingsManager settingsManagerH03 = H0();
            fw3 fw3Var3 = (fw3) tw3Var.p.get();
            BottomBar bottomBar9 = this.A;
            if (bottomBar9 == null) {
                bottomBar9 = null;
            }
            k6l k6lVar5 = this.V;
            if (k6lVar5 == null) {
                k6lVar5 = null;
            }
            v1f v1fVarD03 = D0();
            bq3 bq3Var3 = (bq3) tw3Var.o.get();
            BottomBar bottomBar10 = this.A;
            if (bottomBar10 == null) {
                bottomBar10 = null;
            }
            xj xjVar3 = new xj(bottomBar10, this, b);
            w6j w6jVar5 = this.F;
            if (w6jVar5 == null) {
                w6jVar5 = null;
            }
            fp3 fp3Var2 = new fp3(this, bottomBar9, w6jVar5, (byte) 1);
            new tah(this, x5fVar3, fdVar3, jzeVar3, settingsManagerH03, fw3Var3, bottomBar9, k6lVar5, v1fVarD03, bq3Var3, xjVar3);
            fp3Var = fp3Var2;
        }
        this.G = fp3Var;
        this.I = fp3Var;
        ysl yslVarM0 = M0();
        r22 r22Var = this.I;
        if (r22Var == null) {
            r22Var = null;
        }
        yslVarM0.T(r22Var);
        BottomBar bottomBar11 = this.A;
        BottomBar bottomBar12 = bottomBar11 != null ? bottomBar11 : null;
        pde pdeVar = ((t8l) this.z1.get()).c;
        r22 r22Var2 = this.G;
        new bp3(this, this, bottomBar12, pdeVar, this.a, r22Var2 == null ? null : r22Var2, new st3(this, (byte) 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        if (zch.A(r12, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V0(nt5 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.ov3
            if (r0 == 0) goto L13
            r0 = r12
            ov3 r0 = (defpackage.ov3) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ov3 r0 = new ov3
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L3f
            if (r2 == r5) goto L39
            if (r2 != r4) goto L33
            ybh.y(r12)
            t0i r12 = (t0i) r12
            java.lang.Object r11 = r12.a
            goto Lb0
        L33:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r11)
            return r3
        L39:
            dp6 r11 = r0.t
            ybh.y(r12)
            goto L9c
        L3f:
            dp6 r11 = r0.t
            ybh.y(r12)
            goto L6e
        L45:
            ybh.y(r12)
            java.lang.String[] r12 = com.opera.android.OperaApplication.K
            android.app.Application r11 = r11.getApplication()
            com.opera.android.OperaApplication r11 = (com.opera.android.OperaApplication) r11
            j4c r11 = r11.v
            java.lang.Object r11 = r11.get()
            dp6 r11 = (defpackage.dp6) r11
            zyk r12 = r11.u
            java.lang.Object r12 = r12.getValue()
            gq6 r12 = (defpackage.gq6) r12
            f99 r12 = r12.a()
            r0.t = r11
            r0.w = r6
            java.lang.Object r12 = cs5.E(r12, r0)
            if (r12 == r1) goto Laf
        L6e:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lb3
            bpd r12 = new bpd
            ip6 r2 = r11.d()
            i3j r7 = new i3j
            ole r8 = r11.b()
            bpd r9 = r11.j
            lv1 r10 = r11.l
            r7.<init>(r8, r9, r10)
            r8 = 12
            r12.<init>(r2, r7, r8)
            bs4 r12 = r12.G()
            r0.t = r11
            r0.w = r5
            java.lang.Object r12 = cs5.E(r12, r0)
            if (r12 == r1) goto Laf
        L9c:
            bp9 r2 = defpackage.bp9.a
            if (r12 != r2) goto Lb3
            pv r12 = new pv
            r12.<init>(r6, r3, r11)
            r0.t = r3
            r0.w = r4
            java.lang.Object r11 = zch.A(r12, r0)
            if (r11 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        Lb3:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.BrowserActivity.V0(nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W0() {
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        y0f y0fVar = new y0f(operaApplication.L().c);
        Context applicationContext = getApplicationContext();
        SettingsManager settingsManagerJ = operaApplication.J();
        k6l k6lVar = this.V;
        k6l k6lVar2 = k6lVar == null ? null : k6lVar;
        v3m v3mVarO = operaApplication.O();
        wt3 wt3Var = new wt3(this, (byte) 3);
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        a4m a4mVar = new a4m(applicationContext, settingsManagerJ, k6lVar2, v3mVarO, wt3Var, qimVar.g, (kwf) this.A0.get(), (swf) this.y.a.t().get(), new wt3(this, (byte) 4));
        SettingsManager settingsManagerH0 = H0();
        View viewFindViewById = findViewById(2131364845);
        View viewFindViewById2 = findViewById(2131364846);
        k6l k6lVar3 = this.V;
        k6l k6lVar4 = k6lVar3 == null ? null : k6lVar3;
        q6e q6eVarI = operaApplication.I();
        v3m v3mVarO2 = operaApplication.O();
        qim qimVar2 = this.o;
        Objects.requireNonNull(qimVar2);
        this.F = new w6j(this, viewFindViewById, viewFindViewById2, this, settingsManagerH0, k6lVar4, q6eVarI, v3mVarO2, qimVar2.g, this.o.f, y0fVar, a4mVar, N0().e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean X0() {
        gbf gbfVar = this.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        boolean zBooleanValue = ((Boolean) gbfVar.v.g()).booleanValue();
        View currentFocus = getCurrentFocus();
        boolean z = currentFocus == null || !currentFocus.onCheckIsTextEditor();
        boolean z2 = getSupportFragmentManager().J() == 0;
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        boolean zD = qimVar.d();
        qim qimVar2 = this.o;
        Objects.requireNonNull(qimVar2);
        z8b z8bVar = qimVar2.m;
        boolean z3 = (z8bVar == null || ((android.util.Pair) z8bVar.a) == null) ? false : true;
        String[] strArr = OperaApplication.K;
        eb8 eb8Var = (eb8) ((OperaApplication) getApplication()).i().b.g();
        return (zBooleanValue || !z || !z2 || zD || z3 || (eb8Var != null ? eb8Var.b ^ true : false) || !this.c.isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y0() {
        if (this.I0 != null || ru9.c(this).a.getBoolean("vpn.tooltip_free_closed", false)) {
            return;
        }
        ysl yslVarM0 = M0();
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        gjm gjmVarP0 = P0();
        oz3 oz3Var = qimVar.g;
        ysj ysjVar = qimVar.e;
        gbf gbfVar = this.M;
        gbf gbfVar2 = gbfVar == null ? null : gbfVar;
        k6l k6lVar = this.V;
        k6l k6lVar2 = k6lVar == null ? null : k6lVar;
        String[] strArr = OperaApplication.K;
        this.I0 = new ucn(this, gjmVarP0, oz3Var, ysjVar, this, gbfVar2, this, k6lVar2, ((OperaApplication) getApplication()).R(), yslVarM0, H0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z0() {
        if (this.K0 != null || ru9.c(this).a.getBoolean("vpn.tooltip_premium.change_location_closed", false)) {
            return;
        }
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        oz3 oz3Var = qimVar.g;
        gbf gbfVar = this.M;
        gbf gbfVar2 = gbfVar == null ? null : gbfVar;
        k6l k6lVar = this.V;
        k6l k6lVar2 = k6lVar == null ? null : k6lVar;
        String[] strArr = OperaApplication.K;
        this.K0 = new fen(this, oz3Var, this, gbfVar2, this, k6lVar2, ((OperaApplication) getApplication()).R(), M0(), H0());
    }

    @Override // defpackage.dx3
    public final void a0(yul yulVar) {
        bvl bvlVar = this.X;
        if (bvlVar == null) {
            bvlVar = null;
        }
        bvlVar.G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a1() {
        if (this.J0 == null && rfn.h(this)) {
            qim qimVar = this.o;
            Objects.requireNonNull(qimVar);
            oz3 oz3Var = qimVar.g;
            gbf gbfVar = this.M;
            gbf gbfVar2 = gbfVar == null ? null : gbfVar;
            k6l k6lVar = this.V;
            k6l k6lVar2 = k6lVar == null ? null : k6lVar;
            String[] strArr = OperaApplication.K;
            this.J0 = new rfn(this, oz3Var, this, gbfVar2, this, k6lVar2, ((OperaApplication) getApplication()).R(), F0(), M0(), H0());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1() {
        if (X0()) {
            ru9 ru9VarC = ru9.c(this);
            nej nejVarI0 = I0();
            if (ru9VarC.a.getInt("sync.acknowledgement_state", 0) == 1) {
                og5 og5Var = new og5((Object) ru9VarC, (byte) 4);
                nejVarI0.getClass();
                nejVarI0.b(og5Var, ijm.b);
            }
        }
    }

    @Override // defpackage.dx3
    public final cjm c0(Class cls) {
        return new cjm(2131363371, ryl.class.isAssignableFrom(cls) ? false : i.class.isAssignableFrom(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c1(by3 by3Var) {
        this.U0.m();
        B1();
        b2l b2lVarW0 = w0();
        if (b2lVarW0 == null) {
            return;
        }
        int i = by3Var.a;
        int i2 = by3Var.b;
        final byte b = 1;
        if (i == 1 && !((d7l) b2lVarW0).f()) {
            k6l k6lVar = this.V;
            if (k6lVar == null) {
                k6lVar = null;
            }
            k6lVar.k(b2lVarW0);
            return;
        }
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        int iA = vep.A(by3Var.a);
        if (iA == 0) {
            if (i2 == 1) {
                x5f x5fVar = operaApplication.L().c;
                if (x5fVar.h) {
                    x5fVar.l(2);
                }
            } else {
                x5f x5fVar2 = operaApplication.L().c;
                if (x5fVar2.h) {
                    x5fVar2.l(1);
                }
            }
            final d7l d7lVar = (d7l) b2lVarW0;
            final byte b2 = 0;
            d7lVar.q0(-1, new Runnable() { // from class: a7l
                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    d7l d7lVar2 = d7lVar;
                    switch (b3) {
                        case 0:
                            d7lVar2.j.e();
                            break;
                        default:
                            d7lVar2.j.l();
                            break;
                    }
                }
            });
            return;
        }
        if (iA != 1) {
            h9o.p();
            return;
        }
        if (i2 == 1) {
            x5f x5fVar3 = operaApplication.L().c;
            if (x5fVar3.h) {
                x5fVar3.l(4);
            }
        } else {
            x5f x5fVar4 = operaApplication.L().c;
            if (x5fVar4.h) {
                x5fVar4.l(3);
            }
        }
        final d7l d7lVar2 = (d7l) b2lVarW0;
        d7lVar2.q0(1, new Runnable() { // from class: a7l
            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                d7l d7lVar22 = d7lVar2;
                switch (b3) {
                    case 0:
                        d7lVar22.j.e();
                        break;
                    default:
                        d7lVar22.j.l();
                        break;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t5d
    public final boolean d0() {
        View currentFocus = getWindow().getCurrentFocus();
        if (currentFocus != null) {
            z43 z43Var = this.z;
            if (z43Var == null) {
                z43Var = null;
            }
            if (q9n.w((ViewGroup) z43Var.b, currentFocus)) {
                return false;
            }
        }
        gbf gbfVar = this.M;
        return !(gbfVar != null ? gbfVar : null).j.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d1() {
        boolean zB = ((wnh) xnh.t(getApplicationContext()).i()).b(512);
        wub wubVar = this.g0;
        if (zB) {
            ((xln) wubVar.E(xln.class)).b.e(new rkn(vln.b, null), false);
        } else {
            ((g8j) ((d8j) wubVar.E(d8j.class))).j(c8j.c, new int[0]);
        }
    }

    @Override // defpackage.t5d
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
            int keyCode = keyEvent.getKeyCode();
            pad padVar = this.u;
            if (keyCode == 125 && this.g1.a.a && !keyEvent.isLongPress()) {
                m0();
                l24 l24Var = (l24) padVar.c;
                if (l24Var != null) {
                    l24Var.Z();
                }
            }
            if (keyEvent.getKeyCode() == 111) {
                if (fr3.H(0, keyEvent)) {
                    l24 l24Var2 = (l24) padVar.c;
                    if (l24Var2 != null ? l24Var2.j() : false) {
                        return true;
                    }
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.iga
    public final String e() {
        d5k d5kVar = this.T;
        if (d5kVar == null) {
            d5kVar = null;
        }
        d5kVar.getClass();
        return wqm.d("startpage");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e1(boolean z) {
        if (this.o1) {
            return;
        }
        if (z) {
            o1(1);
        } else {
            String[] strArr = OperaApplication.K;
            x5f x5fVar = ((OperaApplication) getApplication()).L().c;
            if (x5fVar.h) {
                x56 x56VarF = zpa.F();
                x56VarF.d(24, 1);
                x5fVar.U0(x56VarF);
            }
        }
        String[] strArr2 = OperaApplication.K;
        if (!((OperaApplication) getApplication()).J().i("exit_dialog_enabled")) {
            f1();
            return;
        }
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        z77 z77Var = qimVar.c;
        vv3 vv3Var = new vv3(z, this, ((OperaApplication) getApplication()).L().c, P0());
        z77Var.getClass();
        z77Var.b(vv3Var, ijm.b);
    }

    public final void f0(bsi bsiVar, boolean z) {
        RootView rootView = this.Q;
        if (rootView == null) {
            rootView = null;
        }
        if (!rootView.hasWindowFocus()) {
            RootView rootView2 = this.Q;
            (rootView2 != null ? rootView2 : null).getViewTreeObserver().addOnWindowFocusChangeListener(new iv3(this, bsiVar, z));
            return;
        }
        gbf gbfVar = this.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        gbfVar.l(bsiVar, hbf.d);
        if (z) {
            return;
        }
        z43 z43Var = this.z;
        (z43Var != null ? z43Var : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f1() {
        if (this.o1) {
            return;
        }
        byte b = 1;
        this.o1 = true;
        SessionStore sessionStore = SessionStore.j;
        N.M6VmnLt8(sessionStore.a);
        i7d i7dVarB0 = B0();
        i7d i7dVar = i7dVarB0 instanceof i7d ? i7dVarB0 : null;
        if (i7dVar != null && !i7dVar.g) {
            i7dVar.g = true;
            i7dVar.q0();
        }
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        db dbVarB = operaApplication.b();
        if (dbVarB.f != null) {
            dbVarB.f = null;
        }
        HashSet hashSetA0 = z4o.A0(operaApplication.J().z("exit_clear_data_categories"));
        boolean zContains = hashSetA0.contains("Tabs");
        hashSetA0.remove("Tabs");
        m1(new su((Object) hashSetA0, (Object) this, (Object) new gh2(b, this, zContains), (byte) 15));
        N.Ml0K9PX$(sessionStore.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        Window window = getWindow();
        if (window != null) {
            au3 au3Var = new au3(window, (byte) 0);
            if (vml.b()) {
                au3Var.run();
            } else {
                vml.c(au3Var);
            }
        }
        super/*android.app.Activity*/.finish();
    }

    @Override // defpackage.iga
    public final boolean g(String str) {
        return wqm.w(str) && "startpage".equals(Uri.parse(str).getAuthority());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g0() {
        String[] strArr = OperaApplication.K;
        olh olhVar = (olh) ((OperaApplication) getApplication()).r.C0.get();
        b2l b2lVarW0 = w0();
        if (b2lVarW0 == null) {
            return;
        }
        qi qiVar = this.j;
        wx wxVar = new wx((Object) this, (Object) olhVar, (byte) 21);
        olhVar.getClass();
        d7l d7lVar = (d7l) b2lVarW0;
        String strH0 = d7lVar.h0();
        String strL0 = d7lVar.l0();
        xx1 xx1Var = new xx1((Object) olhVar, (Object) d7lVar, strH0, (Object) wxVar, (byte) 8);
        if (olhVar.b.O()) {
            olhVar.c(this, d7lVar, strH0, strL0, xx1Var);
        } else if (r9n.X(this)) {
            olhVar.c(this, d7lVar, strH0, strL0, xx1Var);
        } else {
            f03.U(qiVar, "android.permission.WRITE_EXTERNAL_STORAGE", new xbf(olhVar, this, d7lVar, strH0, strL0, xx1Var));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g1(p6l p6lVar) {
        o1(1);
        B1();
        l5b l5bVar = q9n.c;
        q9n.v(getWindow());
        b2l b2lVarW0 = w0();
        if (b2lVarW0 == null) {
            return;
        }
        ((d7l) b2lVarW0).o();
        M0().b0(new s03(new bi2(this, p6lVar, (byte) 16)));
    }

    @Override // defpackage.dx3, defpackage.kl9
    public final void h(zhj zhjVar) {
        B1();
        X(zhjVar, 2131363371);
    }

    public final void h0(b2l b2lVar) {
        d7l d7lVarU = P().h.u(new TabInfo(0, H0().i("tab_auto_grouping") ? ((d7l) b2lVar).j.a().d : 0, System.currentTimeMillis(), 0L), false, lqm.l);
        k6l k6lVar = this.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        k6lVar.f(b2lVar, d7lVarU, true);
    }

    public final void h1() {
        bvl bvlVar = this.X;
        if (bvlVar == null) {
            bvlVar = null;
        }
        int i = ((avl) bvlVar.getState().g()).c;
        bvl bvlVar2 = this.X;
        int iB = zed.b(((Number) (bvlVar2 != null ? bvlVar2 : null).E().g()).floatValue()) + i;
        c1a c1aVar = this.e1;
        if (c1aVar != null) {
            kze kzeVar = (kze) ((ks3) c1aVar.g).e;
            kzeVar.r(new fi7(iB, ((fi7) kzeVar.g()).b));
        }
        kze kzeVar2 = this.f0;
        xf8.G0(kzeVar2, new fi7(iB, ((fi7) kzeVar2.g()).b));
        j0();
    }

    public final d7l i0(boolean z, b2l b2lVar, boolean z2, lqm lqmVar, TabInfo tabInfo) {
        if (H0().Z()) {
            m0();
        }
        if (tabInfo == null) {
            tabInfo = new TabInfo(0, 0, System.currentTimeMillis(), 0L);
        }
        d7l d7lVarU = P().h.u(tabInfo, z, lqmVar);
        k3 k3Var = new k3(this, b2lVar, d7lVarU, (byte) 16);
        if (!z2) {
            k3Var.run();
            return d7lVarU;
        }
        b2l b2lVarW0 = w0();
        if (b2lVarW0 == null) {
            return d7lVarU;
        }
        ((c8l) this.w0.get()).b(b2lVarW0, new rv3(k3Var, k3Var, (byte) 0));
        return d7lVarU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i1(List list, x92 x92Var) {
        Object next;
        List list2;
        x92 x92Var2;
        eri eriVar;
        if (getSupportFragmentManager().R()) {
            return;
        }
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        operaApplication.L().c.S(14);
        o1(0);
        gbf gbfVar = this.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        if (gbfVar.j.p()) {
            return;
        }
        List list3 = l08.a;
        Iterator it = Collections.unmodifiableList(operaApplication.I().a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((eri) next) instanceof l42) {
                    break;
                }
            }
        }
        eri eriVar2 = (eri) next;
        if (eriVar2 == null) {
            list2 = list3;
            eriVar = null;
            x92Var2 = null;
        } else {
            list2 = list;
            x92Var2 = x92Var;
            eriVar = eriVar2;
        }
        f0(new bsi(eriVar, "", 0, list2, x92Var2, (x92Var == x92.b || x92Var == x92.c) ? new qt3(this, (byte) 7) : null, true, false), true);
    }

    @Override // defpackage.n7n
    public final r7n j() {
        return (r7n) this.y.S.get();
    }

    public final void j0() {
        bvl bvlVar = this.X;
        if (bvlVar == null) {
            bvlVar = null;
        }
        pde state = bvlVar.getState();
        r22 r22Var = this.I;
        pde pdeVar = (pde) (r22Var != null ? r22Var : null).b;
        BrowserFragment browserFragmentP = P();
        if (browserFragmentP != null) {
            int i = ((avl) state.g()).c;
            int i2 = ((np3) pdeVar.g()).a;
            int i3 = ((np3) pdeVar.g()).b;
            browserFragmentP.m = i;
            browserFragmentP.n = i2;
            browserFragmentP.o = i3;
            ChromiumContainerView chromiumContainerView = browserFragmentP.p;
            if (chromiumContainerView != null) {
                int i4 = browserFragmentP.c.a;
                zy4 zy4Var = chromiumContainerView.b;
                zy4Var.g = i;
                zy4Var.h = i2;
                zy4Var.i = i3;
                zy4Var.j = i4;
                zy4Var.T();
            }
        }
        this.v.d(e0().b.a.b);
    }

    public final d7l j1(boolean z, boolean z2, TabInfo tabInfo) {
        s3l s3lVar;
        k6l k6lVar = this.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        s3l s3lVar2 = u3l.a;
        int iOrdinal = (z ? p6l.b : p6l.a).ordinal();
        if (iOrdinal == 0) {
            s3lVar = u3l.a;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return null;
            }
            s3lVar = u3l.b;
        }
        k6l k6lVar2 = this.V;
        if (k6lVar2 == null) {
            k6lVar2 = null;
        }
        ArrayList arrayListP = exg.p(k6lVar, s3lVar, k6lVar2.m);
        return i0(z, arrayListP.isEmpty() ? null : (b2l) arrayListP.get(0), z2, lqm.l, tabInfo);
    }

    public final boolean k0() {
        pu3 pu3Var;
        if (this.n1 || (pu3Var = this.J) == null || !pu3Var.g.X0()) {
            return false;
        }
        return (pu3Var.f && pu3Var.a && System.currentTimeMillis() - pu3Var.b <= pu3Var.c) ? false : true;
    }

    public final void k1(int i, lqm lqmVar, eri eriVar, boolean z, boolean z2) {
        o1(0);
        if (z) {
            i0(i == 2, w0(), false, lqmVar, null);
        }
        if (eriVar != null) {
            M().e(eriVar.getId());
        }
        f0(new bsi(null, "", lqmVar == lqm.s ? 10 : 0, l08.a, null, null, false, false), z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0(boolean z, Runnable runnable) {
        s28 s28Var;
        z zVar = new z(runnable);
        k6l k6lVar = this.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        ArrayList arrayList = k6lVar.b;
        int size = arrayList.size();
        byte b = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((d7l) ((b2l) obj)).c();
        }
        kd7 kd7Var = L0().d;
        kd7Var.getClass();
        kd7Var.f(new bl6(kd7Var, (byte) 16));
        if (z && (s28Var = this.O) != null) {
            s28Var.b(zVar.b());
        }
        String[] strArr = OperaApplication.K;
        N.MEtfumU4(((HistoryManager) ((OperaApplication) getApplication()).r.R.get()).a, zVar.b());
        ku5 ku5VarJ = ((OperaApplication) getApplication()).j();
        if (ku5VarJ.f != null) {
            ku5VarJ.f(new gu5(ku5VarJ, b));
        }
        zVar.e();
        SessionStore sessionStore = SessionStore.j;
        N.MMBIyHnn(sessionStore.a);
        N.M6VmnLt8(sessionStore.a);
    }

    public final void l1(lim limVar) {
        getLifecycle().a(limVar);
    }

    public final boolean m0() {
        gbf gbfVar = this.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        if (!((Boolean) gbfVar.v.g()).booleanValue()) {
            return false;
        }
        gbf gbfVar2 = this.M;
        (gbfVar2 != null ? gbfVar2 : null).t(false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m1(Callback callback) {
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        pt3 pt3Var = new pt3(this, (byte) 0);
        k6l k6lVar = this.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        k6l k6lVar2 = k6lVar;
        s28 s28Var = this.O;
        SettingsManager settingsManagerH0 = H0();
        t1 t1Var = operaApplication.u;
        tw3 tw3Var = this.y;
        callback.run(new s25(this, this.x, pt3Var, k6lVar2, s28Var, settingsManagerH0, t1Var, tw3Var.f, (qln) ((j4c) tw3Var.a.a.e).get(), operaApplication.g(), operaApplication.N()));
    }

    public final void n0(boolean z, boolean z2) {
        b2l b2lVarW0 = w0();
        if (b2lVarW0 != null) {
            d7l d7lVar = (d7l) b2lVarW0;
            if (wqm.w(d7lVar.j.getUrl()) && (z2 || d7lVar.j.m() == z)) {
                return;
            }
        }
        k6l k6lVar = this.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(k6lVar.b));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b2l b2lVar = (b2l) obj;
            if (wqm.w(((d7l) b2lVar).j.getUrl()) && (z2 || z == ((d7l) b2lVar).j.m())) {
                k6l k6lVar2 = this.V;
                if (k6lVar2 == null) {
                    k6lVar2 = null;
                }
                k6lVar2.k(b2lVar);
            }
        }
        i0(z, b2lVarW0, false, lqm.o, new TabInfo(0, 0, System.currentTimeMillis(), 0L));
    }

    public final k6l n1() {
        k6l k6lVar = this.V;
        if (k6lVar == null) {
            return null;
        }
        return k6lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z43 o0() throws Resources.NotFoundException {
        z43 z43Var;
        N0().b();
        btl btlVar = (btl) N0().e.g();
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        b7j b7jVar = btlVar.a;
        boolean z = btlVar.b;
        b7j b7jVar2 = b7j.d;
        byte b = 2;
        pde pdeVar = this.m1;
        if (b7jVar != b7jVar2) {
            TopToolbarContainer topToolbarContainer = (TopToolbarContainer) findViewById(2131362057);
            if (z) {
                pt3 pt3Var = new pt3(this, (byte) 9);
                k6l k6lVar = this.V;
                return new hvl(pt3Var, k6lVar == null ? null : k6lVar, new tt3(this, (byte) 21), topToolbarContainer, new nwf(new hv3(this), operaApplication.L().c, b), M0(), D0(), new tt3(this, (byte) 23), this, pdeVar);
            }
            pt3 pt3Var2 = new pt3(this, (byte) 6);
            H0();
            k6l k6lVar2 = this.V;
            if (k6lVar2 == null) {
                k6lVar2 = null;
            }
            return new pvl(pt3Var2, k6lVar2, new tt3(this, (byte) 24), topToolbarContainer, M0(), this, this.k1, pdeVar);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(2131362175);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.gravity = 80;
        viewGroup.setLayoutParams(layoutParams);
        if (z) {
            pt3 pt3Var3 = new pt3(this, (byte) 5);
            k6l k6lVar3 = this.V;
            if (k6lVar3 == null) {
                k6lVar3 = null;
            }
            tt3 tt3Var = new tt3(this, (byte) 25);
            BottomBar bottomBar = this.A;
            eq3 eq3Var = new eq3(pt3Var3, k6lVar3, tt3Var, viewGroup, bottomBar != null ? bottomBar : null, new nwf(new hv3(this), operaApplication.L().c, b), M0(), D0(), new tt3(this, (byte) 26), this, pdeVar, p3k.j, (byte) 1);
            viewGroup.getResources().getDimensionPixelSize(2131165312);
            return eq3Var;
        }
        if (btlVar.d) {
            pt3 pt3Var4 = new pt3(this, (byte) 7);
            k6l k6lVar4 = this.V;
            if (k6lVar4 == null) {
                k6lVar4 = null;
            }
            tt3 tt3Var2 = new tt3(this, (byte) 27);
            BottomBar bottomBar2 = this.A;
            mp3 mp3Var = new mp3(pt3Var4, k6lVar4, tt3Var2, viewGroup, bottomBar2 != null ? bottomBar2 : null, new nwf(new hv3(this), operaApplication.L().c, b), M0(), D0(), new tt3(this, (byte) 28), this, pdeVar, p3k.j);
            viewGroup.getResources().getDimensionPixelSize(2131165340);
            return mp3Var;
        }
        pt3 pt3Var5 = new pt3(this, (byte) 8);
        k6l k6lVar5 = this.V;
        if (k6lVar5 == null) {
            k6lVar5 = null;
        }
        tt3 tt3Var3 = new tt3(this, (byte) 29);
        BottomBar bottomBar3 = this.A;
        if (bottomBar3 != null) {
            z43Var = null;
        } else {
            bottomBar3 = null;
            z43Var = null;
        }
        nwf nwfVar = new nwf(new hv3(this), operaApplication.L().c, b);
        k6l k6lVar6 = k6lVar5;
        ysl yslVarM0 = M0();
        BottomBar bottomBar4 = bottomBar3;
        v1f v1fVarD0 = D0();
        z43 z43Var2 = z43Var;
        wt3 wt3Var = new wt3(this, (byte) 0);
        Object[] objArr = {o3k.f};
        HashSet hashSet = new HashSet(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        if (!hashSet.add(obj)) {
            qp2.o(rfp.o(obj, "duplicate element: "));
            return z43Var2;
        }
        eq3 eq3Var2 = new eq3(pt3Var5, k6lVar6, tt3Var3, viewGroup, bottomBar4, nwfVar, yslVarM0, v1fVarD0, wt3Var, this, pdeVar, Collections.unmodifiableSet(hashSet), (byte) 0);
        viewGroup.getResources().getDimensionPixelSize(2131165339);
        return eq3Var2;
    }

    public final void o1(int i) {
        getSupportFragmentManager().Y(-1, 1, (String) null);
        m0();
        if ((i & 1) != 0) {
            B1();
        }
        bv bvVar = this.H0;
        if (bvVar != null) {
            bvVar.b();
        }
        nke nkeVar = this.G0;
        if (nkeVar != null) {
            nkeVar.b();
        }
        v9l v9lVar = (v9l) this.v0.f();
        if (v9lVar != null) {
            km5 km5Var = v9lVar.w;
            if (km5Var != null) {
                km5Var.cancel();
            }
            r9l r9lVar = v9lVar.v;
            if (r9lVar != null) {
                r9lVar.i(false);
            }
        }
        gbf gbfVar = this.M;
        gbf gbfVar2 = gbfVar != null ? gbfVar : null;
        dbf dbfVar = gbfVar2.m;
        boolean zU = dbf.u(dbfVar.m);
        hjm hjmVar = hjm.b;
        if (zU) {
            dbfVar.m.finish(hjmVar);
        }
        if (dbf.u(dbfVar.n)) {
            dbfVar.n.finish(hjmVar);
        }
        zqi zqiVar = (zqi) gbfVar2.s.get();
        mri mriVar = zqiVar.a;
        if (mriVar.k()) {
            mriVar.b();
        }
        zqiVar.b.b();
        kwf kwfVar = (kwf) this.A0.f();
        if (kwfVar != null) {
            kwfVar.b();
        }
        dbl dblVar = (dbl) this.B0.f();
        if (dblVar != null) {
            dblVar.b();
        }
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        qimVar.b();
        qim qimVar2 = this.o;
        Objects.requireNonNull(qimVar2);
        qimVar2.i.h();
    }

    public final void onAttachFragment(Fragment fragment) {
        super/*androidx.fragment.app.r*/.onAttachFragment(fragment);
        if (fragment instanceof rld) {
            ((rld) fragment).getViewLifecycleOwnerLiveData().k(new k9((Object) this, (byte) 18));
        }
    }

    @Override // defpackage.dx3, defpackage.hjf
    public final void onConfigurationChanged(Configuration configuration) {
        Object objF;
        hsj hsjVar;
        super.onConfigurationChanged(configuration);
        gbf gbfVar = this.M;
        if (gbfVar != null && (objF = gbfVar.s.f()) != null && (hsjVar = ((zqi) objF).b.t.d) != null) {
            hsjVar.a.k();
        }
        d5k d5kVar = this.T;
        if (d5kVar != null) {
            Object objF2 = ((Lazy) d5kVar.b.b).f();
            if (objF2 != null) {
                c5k c5kVar = (c5k) ((o8k) objF2);
                c5kVar.q.a();
                ArrayList arrayList = c5kVar.A.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    xw8 xw8Var = ((zw8) obj).b;
                    if (xw8Var != null && xw8.class.isAssignableFrom(xw8.class)) {
                        xw8Var.b();
                    }
                }
            }
            Object objF3 = ((Lazy) d5kVar.c.b).f();
            if (objF3 != null) {
                c5k c5kVar2 = (c5k) ((o8k) objF3);
                c5kVar2.q.a();
                ArrayList arrayList2 = c5kVar2.A.a;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    xw8 xw8Var2 = ((zw8) obj2).b;
                    if (xw8Var2 != null && xw8.class.isAssignableFrom(xw8.class)) {
                        xw8Var2.b();
                    }
                }
            }
        }
        S().d(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0409 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x034f  */
    @Override // defpackage.t5d, defpackage.dx3, defpackage.hjf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r36) {
        /*
            Method dump skipped, instructions count: 2043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.BrowserActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dx3, defpackage.hjf
    public final void onDestroy() {
        q1("Destroying");
        super.onDestroy();
        pu3 pu3Var = this.J;
        if (pu3Var != null) {
            pu3Var.d.H(pu3Var.e);
        }
        if (!this.T0) {
            String[] strArr = OperaApplication.K;
            cbk cbkVar = ((OperaApplication) getApplication()).m;
            int i = cbkVar.b - 1;
            cbkVar.b = i;
            if (i <= 0) {
                if (((bbk) cbkVar.e) != null) {
                    if (cbkVar.a) {
                        N.MddmC_m2(new jri(((OperaApplication) getApplication()).N(), (HistoryManager) ((OperaApplication) getApplication()).r.R.get(), (byte) 17));
                    }
                    ((bbk) cbkVar.e).a();
                }
                cbkVar.a = false;
            }
        }
        if (this.q0) {
            String[] strArr2 = OperaApplication.K;
            OperaApplication operaApplication = (OperaApplication) getApplication();
            synchronized (operaApplication.e) {
                tjg tjgVar = operaApplication.d;
                if (tjgVar != null) {
                    tjgVar.f();
                    operaApplication.d = null;
                }
            }
        }
        q1("Destroyed");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 && i != 82 && i != 84) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        v9l v9lVar;
        if (i != 4 || !this.g1.a.a || getSupportFragmentManager().J() != 0 || ((v9lVar = (v9l) this.v0.f()) != null && v9lVar.v != null)) {
            return super/*android.app.Activity*/.onKeyLongPress(i, keyEvent);
        }
        boolean z = true;
        if (S().a.p()) {
            S().b();
            return true;
        }
        byte b = 0;
        if (S().b) {
            S().d(false);
            return true;
        }
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) getApplication()).L().c;
        if (x5fVar.h) {
            x56 x56VarF = zpa.F();
            x56VarF.d(25, 1);
            x5fVar.U0(x56VarF);
        }
        Object objC0 = C0(nje.a);
        if (objC0 == null && (objC0 = this.A) == null) {
            objC0 = null;
        }
        M0().b0(new bu3(b, this, objC0, z));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.g1.a.a && !keyEvent.isLongPress()) {
            if (i == 82) {
                m0();
                l24 l24Var = (l24) this.u.c;
                if (l24Var != null) {
                    l24Var.V();
                }
            } else {
                if (i != 84) {
                    return super/*android.app.Activity*/.onKeyUp(i, keyEvent);
                }
                if (getSupportFragmentManager().J() <= 0) {
                    gbf gbfVar = this.M;
                    if (gbfVar == null) {
                        gbfVar = null;
                    }
                    gbfVar.l(null, hbf.c);
                    return true;
                }
            }
            return true;
        }
        return super/*android.app.Activity*/.onKeyUp(i, keyEvent);
    }

    public final void onLowMemory() {
        zsd.b.a(80);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context, com.opera.android.BrowserActivity, hjf] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.hjf
    public final void onNewIntent(Intent intent) {
        ActivityManager.RecentTaskInfo taskInfo;
        super.onNewIntent(intent);
        if (Intrinsics.a(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.LAUNCHER") && intent.getData() == null) {
            int i = EsimActivity.f0;
            ActivityManager activityManager = (ActivityManager) getSystemService(ActivityManager.class);
            if (activityManager != null) {
                ComponentName componentName = new ComponentName((Context) this, (Class<?>) EsimActivity.class);
                List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                if (!(appTasks instanceof Collection) || !appTasks.isEmpty()) {
                    Iterator it = appTasks.iterator();
                    this = this;
                    while (it.hasNext()) {
                        try {
                            taskInfo = ((ActivityManager.AppTask) it.next()).getTaskInfo();
                        } catch (IllegalArgumentException unused) {
                            taskInfo = null;
                        }
                        if (taskInfo != null && taskInfo.numActivities > 0 && Intrinsics.a(taskInfo.baseIntent.getComponent(), componentName)) {
                            int i2 = EsimActivity.f0;
                            Context context = this;
                            context.startActivity(FullscreenWebActivity.e0(context, EsimActivity.class, null, null, true, lqm.J).putExtras(ic4.m(new Pair[]{new Pair("ESIM_ATTRIBUTION_RESOLVED", Boolean.TRUE), new Pair("ESIM_SOURCE", "organic"), new Pair("ESIM_CAMPAIGN", "organic")})));
                            return;
                        }
                        this = this;
                    }
                }
            }
        }
        BrowserActivity browserActivity = this;
        meg megVar = (meg) browserActivity.p0.f();
        if (megVar != null) {
            megVar.a();
        }
        ((ArrayList) browserActivity.L0.a).add(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPause() {
        q1("Pausing");
        super/*androidx.fragment.app.r*/.onPause();
        boolean z = false;
        this.g1.d = false;
        ((i7f) c37.r().b).c(this.r1);
        if (!this.S0 && !F1) {
            F1 = true;
            Locale locale = wwc.a;
            String string = getSharedPreferences("localize", 0).getString("language_code", null);
            if (string == null) {
                string = "";
            }
            if (TextUtils.isEmpty(string)) {
                string = wwc.d(wwc.a);
                z = true;
            }
            if (!w8h.v(getResources(), string)) {
                ywc.d();
                if (new ArrayList(ywc.a.keySet()).contains(wwc.c(string))) {
                    ks3.B("Mismatched locale", String.format(Locale.ROOT, "%s != %s, needToInstallSplitLocale: %b, isLanguageCodeInstalled: %b systemLocale: %b", Arrays.copyOf(new Object[]{getString(2132019347), string, Boolean.valueOf(InstallSplitLocaleActivity.K(this)), Boolean.valueOf(w8h.o(this, string)), Boolean.valueOf(z)}, 5)));
                }
            }
        }
        q1("Paused");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPostResume() {
        super.onPostResume();
        ou3 ou3Var = this.g1;
        final byte b = 1;
        ou3Var.d = true;
        if (ou3Var.e) {
            ou3Var.S();
        }
        String[] strArr = OperaApplication.K;
        final OperaApplication operaApplication = (OperaApplication) getApplication();
        if (operaApplication.J().i("ga_usage_statistics")) {
            final byte b2 = 0;
            ava.a.a(new Runnable(this) { // from class: cu3
                public final /* synthetic */ BrowserActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r11v7, types: [android.app.Activity, com.opera.android.BrowserActivity] */
                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    OperaApplication operaApplication2 = operaApplication;
                    switch (b3) {
                        case 0:
                            int i = BrowserActivity.E1;
                            BrowserActivity browserActivity = this.b;
                            qdc lifecycle = browserActivity.getLifecycle();
                            tw3 tw3Var = browserActivity.y;
                            if (lifecycle.i.d(qcc.e)) {
                                nr8 nr8VarO = operaApplication2.o();
                                mdh mdhVarG = operaApplication2.G();
                                tta ttaVar = (tta) ((izj) tw3Var.a.x().get()).d.g();
                                gx8 gx8Var = (gx8) tw3Var.a.r().get();
                                vr3 vr3Var = new vr3(new vuh(operaApplication2.L().c, (byte) 2));
                                nr8VarO.f(new a0k(nr8VarO, vr3Var.b()));
                                new r62(mdhVarG.h, new ay1(mdhVarG, browserActivity, ttaVar, gx8Var.c, vr3Var.b(), (byte) 3), (byte) 1);
                                vr3Var.d();
                                break;
                            }
                            break;
                        default:
                            int i2 = BrowserActivity.E1;
                            String[] strArr2 = OperaApplication.K;
                            ?? r11 = this.b;
                            h hVar = (h) ((OperaApplication) r11.getApplication()).g();
                            PasswordManager passwordManager = (PasswordManager) r11.y.a.u().get();
                            glh glhVarH = operaApplication2.H();
                            x5f x5fVar = operaApplication2.L().c;
                            vuh vuhVar = new vuh(x5fVar, (byte) 0);
                            qie qieVar = glhVarH.d;
                            umi umiVar = glhVarH.c;
                            jlh jlhVar = glhVarH.a;
                            Objects.requireNonNull(jlhVar);
                            nml nmlVarB = umiVar.b(new jjg(jlhVar, (byte) 4));
                            nmlVarB.b(umiVar.f(new r9g(vuhVar, (byte) 17)));
                            qieVar.n(new oml(nmlVarB), null);
                            vuh vuhVar2 = new vuh(x5fVar, (byte) 1);
                            passwordManager.getClass();
                            PasswordManager.a(vuhVar2);
                            hVar.a.d(new q2g(x5fVar, hVar, (byte) 25));
                            break;
                    }
                }
            });
            avj avjVar = cak.d;
            avj.g(1, new Runnable(this) { // from class: cu3
                public final /* synthetic */ BrowserActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r11v7, types: [android.app.Activity, com.opera.android.BrowserActivity] */
                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    OperaApplication operaApplication2 = operaApplication;
                    switch (b3) {
                        case 0:
                            int i = BrowserActivity.E1;
                            BrowserActivity browserActivity = this.b;
                            qdc lifecycle = browserActivity.getLifecycle();
                            tw3 tw3Var = browserActivity.y;
                            if (lifecycle.i.d(qcc.e)) {
                                nr8 nr8VarO = operaApplication2.o();
                                mdh mdhVarG = operaApplication2.G();
                                tta ttaVar = (tta) ((izj) tw3Var.a.x().get()).d.g();
                                gx8 gx8Var = (gx8) tw3Var.a.r().get();
                                vr3 vr3Var = new vr3(new vuh(operaApplication2.L().c, (byte) 2));
                                nr8VarO.f(new a0k(nr8VarO, vr3Var.b()));
                                new r62(mdhVarG.h, new ay1(mdhVarG, browserActivity, ttaVar, gx8Var.c, vr3Var.b(), (byte) 3), (byte) 1);
                                vr3Var.d();
                                break;
                            }
                            break;
                        default:
                            int i2 = BrowserActivity.E1;
                            String[] strArr2 = OperaApplication.K;
                            ?? r11 = this.b;
                            h hVar = (h) ((OperaApplication) r11.getApplication()).g();
                            PasswordManager passwordManager = (PasswordManager) r11.y.a.u().get();
                            glh glhVarH = operaApplication2.H();
                            x5f x5fVar = operaApplication2.L().c;
                            vuh vuhVar = new vuh(x5fVar, (byte) 0);
                            qie qieVar = glhVarH.d;
                            umi umiVar = glhVarH.c;
                            jlh jlhVar = glhVarH.a;
                            Objects.requireNonNull(jlhVar);
                            nml nmlVarB = umiVar.b(new jjg(jlhVar, (byte) 4));
                            nmlVarB.b(umiVar.f(new r9g(vuhVar, (byte) 17)));
                            qieVar.n(new oml(nmlVarB), null);
                            vuh vuhVar2 = new vuh(x5fVar, (byte) 1);
                            passwordManager.getClass();
                            PasswordManager.a(vuhVar2);
                            hVar.a.d(new q2g(x5fVar, hVar, (byte) 25));
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onProvideAssistContent(AssistContent assistContent) {
        super/*android.app.Activity*/.onProvideAssistContent(assistContent);
        b2l b2lVarW0 = w0();
        if (b2lVarW0 != null) {
            d7l d7lVar = (d7l) b2lVarW0;
            if (!d7lVar.j.m() && !d7lVar.o0()) {
                assistContent.setWebUri(Uri.parse(d7lVar.k0()));
                return;
            }
        }
        assistContent.setWebUri(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestart() {
        d7l d7lVar;
        q1("Restarting");
        super/*android.app.Activity*/.onRestart();
        k6l k6lVar = this.V;
        if (k6lVar != null && (d7lVar = k6lVar.p) != null) {
            k6lVar.k(d7lVar);
        }
        q1("Restarted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        q1("Resuming");
        if (getWindow() != null) {
            getWindow().getDecorView().setVisibility(0);
        }
        super/*androidx.fragment.app.r*/.onResume();
        ((i7f) c37.r().b).b(this.r1);
        q1("Resumed");
    }

    @Override // defpackage.t5d
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("IGNORE_ALREADY_HANDLED_START_INTENT", true);
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        q1("Starting");
        super.onStart();
        j06 j06Var = new j06((byte) 9);
        synchronized (w7d.d) {
            w7d.c = j06Var;
        }
        SettingsManager settingsManagerH0 = H0();
        qt3 qt3Var = new qt3(this, (byte) 10);
        SystemSettings systemSettings = settingsManagerH0.g;
        systemSettings.c = null;
        systemSettings.b.a(null, new mcj((Object) systemSettings, (Object) qt3Var, false));
        q1("Started");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dx3
    public final void onStop() {
        View viewPeekDecorView;
        q1("Stopping");
        super.onStop();
        Window window = getWindow();
        if (window != null && (viewPeekDecorView = window.peekDecorView()) != null) {
            viewPeekDecorView.cancelPendingInputEvents();
        }
        while (true) {
            Runnable runnable = (Runnable) ngh.d.poll();
            if (runnable == null) {
                q1("Stopped");
                return;
            }
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSupportActionModeStarted(se seVar) throws Resources.NotFoundException {
        LayoutDirectionActionBarContextView layoutDirectionActionBarContextView;
        super.onSupportActionModeStarted(seVar);
        if ((seVar instanceof b3k) || H0().f() != e7j.d || (layoutDirectionActionBarContextView = (LayoutDirectionActionBarContextView) getWindow().getDecorView().findViewById(2131361885)) == null) {
            return;
        }
        boolean z = ((ViewGroup.MarginLayoutParams) ((RootView) findViewById(2131361903)).getLayoutParams()).topMargin > 0;
        boolean z2 = getSupportFragmentManager().J() == 0;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165271);
        if (z2 && !z) {
            bvl bvlVar = this.X;
            if (bvlVar == null) {
                bvlVar = null;
            }
            int i = ((avl) bvlVar.getState().g()).c;
            if (dimensionPixelSize < i) {
                dimensionPixelSize = i;
            }
        }
        ((ActionBarContextView) layoutDirectionActionBarContextView).e = dimensionPixelSize;
    }

    public final void onTrimMemory(int i) {
        super/*xd5*/.onTrimMemory(i);
        zsd.b.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUserLeaveHint() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.BrowserActivity.onUserLeaveHint():void");
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.view.View, androidx.appcompat.widget.ActionBarContextView, com.opera.android.custom_views.LayoutDirectionActionBarContextView] */
    public final se onWindowStartingSupportActionMode(re reVar) {
        List listF = getSupportFragmentManager().c.f();
        if (!listF.isEmpty()) {
            yyi yyiVar = (Fragment) am2.l(1, listF);
            if (yyiVar instanceof yyi) {
                yyi yyiVar2 = yyiVar;
                if (yyiVar2.v == null) {
                    CollapsingToolbarLayout collapsingToolbarLayoutFindViewById = yyiVar2.k.findViewById(2131362365);
                    if (collapsingToolbarLayoutFindViewById instanceof CollapsingToolbarLayout) {
                        yyiVar2.v = collapsingToolbarLayoutFindViewById;
                    }
                }
                kf kfVar = yyiVar2.w;
                if (kfVar == null) {
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(yyiVar2.k.getContext());
                    StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = yyiVar2.k;
                    View viewInflate = layoutInflaterFrom.inflate(2131559293, (ViewGroup) statusBarDrawingFrameLayout, false);
                    statusBarDrawingFrameLayout.addView(viewInflate);
                    LayoutDirectionActionBarContextView layoutDirectionActionBarContextView = (LayoutDirectionActionBarContextView) w1h.j(2131361863, viewInflate);
                    if (layoutDirectionActionBarContextView == null) {
                        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131361863)));
                        return null;
                    }
                    kf kfVar2 = new kf((byte) 26, viewInflate, (Object) layoutDirectionActionBarContextView);
                    yyiVar2.w = kfVar2;
                    kfVar = kfVar2;
                }
                Context context = ((LayoutDirectionActionBarContextView) kfVar.c).getContext();
                ?? r6 = (LayoutDirectionActionBarContextView) yyiVar2.w.c;
                b3k b3kVar = new b3k(context, (ActionBarContextView) r6, reVar);
                itd itdVar = b3kVar.e;
                itdVar.w();
                try {
                    if (b3kVar.f.q(b3kVar, itdVar)) {
                        b3kVar.g();
                        r6.c(b3kVar);
                        r6.setVisibility(0);
                        r6.sendAccessibilityEvent(32);
                        return b3kVar;
                    }
                } finally {
                    itdVar.v();
                }
            }
        }
        return null;
    }

    public final void p0() {
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        gbf gbfVar = this.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        this.o0 = new wjh(this, qimVar, gbfVar.o);
    }

    public final void p1() {
        RootView rootView = this.Q;
        if (rootView == null) {
            rootView = null;
        }
        p37.A(rootView, this, (dh4) null, new ol2(this, (byte) 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h73 q0() {
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        f7d f7dVar = (f7d) this.t1.getValue();
        tw3 tw3Var = this.y;
        rs2 rs2Var = (rs2) tw3Var.a.i().get();
        SettingsManager settingsManagerH0 = H0();
        ydn ydnVarR = operaApplication.R();
        dxe dxeVar = this.s;
        v1f v1fVarD0 = D0();
        boolean zA = ((ojn) tw3Var.Q.get()).c.a();
        boolean zT = ((OperaApplication) getApplication()).s().t();
        xv1 xv1Var = operaApplication.r;
        xt8 xt8Var = (xt8) xv1Var.I.get();
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        z77 z77Var = qimVar.c;
        x5f x5fVar = operaApplication.L().c;
        xb xbVarA = tw3Var.a.a();
        f84 f84Var = (f84) xv1Var.n.get();
        jtg jtgVarD = operaApplication.D();
        kze kzeVar = operaApplication.M().i;
        kze kzeVar2 = operaApplication.M().c.g;
        j4c j4cVarE = operaApplication.e();
        eu3 eu3Var = new eu3(this, (byte) 0);
        pt3 pt3Var = new pt3(this, (byte) 15);
        bvl bvlVar = this.X;
        if (bvlVar == null) {
            bvlVar = null;
        }
        return new h73(f7dVar, this.u1, rs2Var, settingsManagerH0, ydnVarR, dxeVar, v1fVarD0, zA, zT, xt8Var, z77Var, x5fVar, xbVarA, f84Var, jtgVarD, kzeVar, kzeVar2, j4cVarE, eu3Var, pt3Var, bvlVar.getState(), ((((ajn) ((bjn) no7.n(this, io7.n, bjn.k)).i()).a & 2048) == 0 || i0l.g()) ? false : true, new ji(operaApplication, (byte) 10), new j4c(new ji(operaApplication, (byte) 11), (byte) 1), new ji(operaApplication, (byte) 12), operaApplication.r().p);
    }

    public final void q1(String str) {
        ks3.k.J(str + "@" + this.r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gbf r0(z43 z43Var) {
        pt3 pt3Var = new pt3(this, (byte) 10);
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        boolean z = H0().c().b;
        wt3 wt3Var = new wt3(this, (byte) 7);
        SettingsManager settingsManagerJ = operaApplication.J();
        s9g s9gVar = s9g.h;
        ydn ydnVarR = operaApplication.R();
        xv1 xv1Var = operaApplication.r;
        in3 in3Var = (in3) xv1Var.r.get();
        lg lgVarM = M();
        tw3 tw3Var = this.y;
        swf swfVar = (swf) tw3Var.a.t().get();
        s28 s28Var = this.O;
        yz9 yz9Var = (yz9) this.B1.getValue();
        k6l k6lVar = this.V;
        k6l k6lVar2 = k6lVar == null ? null : k6lVar;
        View viewFindViewById = findViewById(2131362057);
        hv3 hv3Var = new hv3(this);
        gjm gjmVarP0 = P0();
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        z77 z77Var = qimVar.c;
        qim qimVar2 = this.o;
        Objects.requireNonNull(qimVar2);
        nej nejVar = qimVar2.d;
        cdn cdnVar = (cdn) tw3Var.a.r.get();
        x5f x5fVar = operaApplication.L().c;
        p8f p8fVar = this.N;
        p8f p8fVar2 = p8fVar == null ? null : p8fVar;
        xg xgVar = this.K;
        xg xgVar2 = xgVar != null ? xgVar : null;
        wth wthVar = new wth(this);
        pt3 pt3Var2 = new pt3(this, (byte) 11);
        mdh mdhVarG = operaApplication.G();
        qdh qdhVar = (qdh) xv1Var.A0.get();
        cul culVar = (cul) xv1Var.g1.get();
        k5o k5oVar = new k5o(this);
        igi igiVar = new igi(this, this, this.a, this.E0);
        pde pdeVar = ((ex0) this.F0.get()).e;
        vx vxVar = new vx(z43Var, (byte) 14);
        wt3 wt3Var2 = new wt3(this, (byte) 8);
        wt3 wt3Var3 = new wt3(this, (byte) 9);
        wcd wcdVar = (wcd) tw3Var.y0.get();
        osf osfVar = operaApplication.L().f;
        wok wokVarT = wok.t(this);
        u0a u0aVar = (u0a) operaApplication.s.get();
        return new gbf(z43Var, z ? 1 : 0, wt3Var, settingsManagerJ, s9gVar, ydnVarR, in3Var, lgVarM, swfVar, s28Var, yz9Var, k6lVar2, viewFindViewById, hv3Var, gjmVarP0, z77Var, nejVar, cdnVar, x5fVar, p8fVar2, xgVar2, pt3Var, wthVar, this, this.x, pt3Var2, mdhVarG, qdhVar, culVar, k5oVar, igiVar, pdeVar, vxVar, wt3Var2, wt3Var3, wcdVar, osfVar, wokVarT, u0aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context, com.opera.android.BrowserActivity, dx3] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v5, types: [vt3] */
    public final void r1() throws Resources.NotFoundException {
        BottomBar bottomBar;
        ?? r1;
        BrowserActivity browserActivity;
        getWindow().setBackgroundDrawable(null);
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        qwe qweVarB = operaApplication.B();
        SettingsManager settingsManagerH0 = H0();
        RootView rootView = this.Q;
        if (rootView == null) {
            rootView = null;
        }
        l1(new mxe(this, qweVarB, settingsManagerH0, rootView.q));
        byte b = 1;
        l1(new d62((NotificationManager) getSystemService(NotificationManager.class), new wv1(new pv3(operaApplication, OperaApplication.class, "firebaseManager", "getFirebaseManager()Lcom/opera/android/firebase/FirebaseManager;", 0, (byte) 4), (byte) 1), (byte) 6));
        l1(new geg());
        l1(new rln((qln) ((j4c) this.y.a.a.e).get()));
        cbk cbkVar = operaApplication.m;
        uu3 uu3Var = this.M0;
        if (((BrowserActivity) cbkVar.c) != null) {
            ac8.d(cbkVar.d);
        }
        cbkVar.c = this;
        cbkVar.d = uu3Var;
        ac8.c(uu3Var);
        byte b2 = 0;
        byte b3 = 3;
        na2.B(cqp.V(getLifecycle()), (CoroutineContext) null, (rx5) null, new ww3(this, operaApplication.r(), new qt3(this, b2), new qt3(this, b), new ut3(this, b2), new qt3(this, (byte) 2), new qt3(this, b3), (mt5) null, (byte) 0), 3);
        v1 v1VarU = v1.u(getApplicationContext());
        v1VarU.i();
        u1 u1Var = v1VarU.k;
        u1Var.e = true;
        AtomicReference atomicReference = u1Var.b;
        s1 s1Var = u1.h;
        s1 s1Var2 = u1.g;
        while (!atomicReference.compareAndSet(s1Var, s1Var2) && atomicReference.get() == s1Var) {
        }
        cbk cbkVar2 = operaApplication.m;
        if (cbkVar2.b != 0 && !cbkVar2.a) {
            cbkVar2.a = true;
        }
        String[] strArr2 = OperaApplication.K;
        OperaApplication operaApplication2 = (OperaApplication) getApplication();
        l1(new nqe(this, (dse) operaApplication2.r.j0.get(), (x0f) operaApplication2.r.l0.get()));
        View viewFindViewById = findViewById(2131364532);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
            ((ViewGroup) viewFindViewById.getParent()).removeView(viewFindViewById);
        }
        RootView rootView2 = this.Q;
        if (rootView2 == null) {
            rootView2 = null;
        }
        rootView2.h = true;
        x7i x7iVar = rootView2.i;
        vml.a(x7iVar);
        vml.d(x7iVar, 1000L);
        findViewById(2131364581).setVisibility(0);
        u8k u8kVar = (u8k) operaApplication.I.get();
        k7k k7kVar = u8kVar.b;
        k7kVar.H(u8kVar.e);
        v1 v1Var = u8kVar.c;
        v1Var.H(u8kVar.f);
        v1Var.i();
        k7kVar.i();
        u8kVar.c();
        this.B = (BrowserContainer) findViewById(2131363372);
        RootView rootView3 = this.Q;
        if (rootView3 == null) {
            rootView3 = null;
        }
        if (Build.VERSION.SDK_INT == 29) {
            rootView3.addOnLayoutChangeListener(new u9n(rootView3));
        }
        RootView rootView4 = this.Q;
        if (rootView4 == null) {
            rootView4 = null;
        }
        this.D = new jvj(rootView4.findViewById(2131363271), this);
        findViewById(2131362758).setOnClickListener(new gf((Object) this, (byte) 28));
        BrowserContainer browserContainer = this.B;
        if (browserContainer == null) {
            browserContainer = null;
        }
        S().a(new sv3(browserContainer, b2));
        jvj jvjVar = this.D;
        if (jvjVar == null) {
            jvjVar = null;
        }
        jvjVar.a.b(new tv3(browserContainer, b2));
        BrowserFragment browserFragmentP = P();
        aal aalVar = this.o.f;
        browserFragmentP.k = aalVar;
        browserFragmentP.h.f = aalVar;
        BrowserFragmentFrameLayout browserFragmentFrameLayoutF0 = browserFragmentP.f0();
        byte b4 = 4;
        if (browserFragmentFrameLayoutF0 != null) {
            browserFragmentFrameLayoutF0.a = new qt3(this, b4);
        }
        ((kwf) this.A0.get()).w = this.o.f;
        gu3 gu3Var = new gu3(this);
        this.P0 = gu3Var;
        ac8.c(gu3Var);
        this.V = browserFragmentP.g;
        N0().b();
        btl btlVar = (btl) N0().e.g();
        b7j b7jVar = btlVar.a;
        boolean z = btlVar.b;
        if (b7jVar == b7j.d) {
            ViewStub viewStub = (ViewStub) findViewById(2131364809);
            viewStub.setLayoutResource(2131559470);
            this.W = (TopToolbarContainer) viewStub.inflate();
            ViewStub viewStub2 = (ViewStub) findViewById(2131362177);
            viewStub2.setLayoutResource(z ? 2131558496 : btlVar.d ? 2131558492 : 2131558491);
            BottomBar bottomBar2 = (BottomBar) viewStub2.inflate();
            this.A = bottomBar2;
            if (btlVar.c) {
                TopToolbarContainer topToolbarContainer = this.W;
                if (topToolbarContainer == null) {
                    topToolbarContainer = null;
                }
                ((ViewStub) topToolbarContainer.findViewById(2131364847)).inflate();
            } else {
                if (bottomBar2 == null) {
                    bottomBar2 = null;
                }
                ((ViewStub) bottomBar2.findViewById(2131364847)).inflate();
            }
            ViewStub viewStub3 = (ViewStub) findViewById(2131364655);
            if (viewStub3 != null) {
                viewStub3.setVisibility(0);
            }
            BottomBar bottomBar3 = this.A;
            if (bottomBar3 == null) {
                bottomBar3 = null;
            }
            bottomBar3.h();
            BottomBar bottomBar4 = this.A;
            if (bottomBar4 == null) {
                bottomBar4 = null;
            }
            T0(bottomBar4);
        } else {
            ViewStub viewStub4 = (ViewStub) findViewById(2131364809);
            viewStub4.setLayoutResource(z ? 2131558497 : 2131558495);
            this.W = (TopToolbarContainer) viewStub4.inflate();
            ViewStub viewStub5 = (ViewStub) findViewById(2131362177);
            if (z) {
                viewStub5.setLayoutResource(2131558555);
                bottomBar = (BottomBar) viewStub5.inflate();
            } else {
                viewStub5.setLayoutResource(2131558557);
                bottomBar = (BottomBar) viewStub5.inflate();
            }
            this.A = bottomBar;
            if (!z) {
                if (bottomBar == null) {
                    bottomBar = null;
                }
                T0(bottomBar);
            }
            BottomBar bottomBar5 = this.A;
            if (bottomBar5 == null) {
                bottomBar5 = null;
            }
            ((ViewStub) bottomBar5.findViewById(2131364847)).inflate();
            ViewStub viewStub6 = (ViewStub) findViewById(2131364655);
            if (viewStub6 != null) {
                viewStub6.setVisibility(0);
            }
            BottomBar bottomBar6 = this.A;
            if (bottomBar6 == null) {
                bottomBar6 = null;
            }
            bottomBar6.h();
        }
        BottomBar bottomBar7 = this.A;
        if (bottomBar7 == null) {
            bottomBar7 = null;
        }
        bottomBar7.o.j(this, new ug(new st3(this, (byte) 2), (byte) 13));
        umi umiVar = this.x;
        k6l k6lVar = this.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        this.C = new fnh(this, umiVar, k6lVar, P().h, H0(), SessionStore.j);
        k6l k6lVar2 = this.V;
        if (k6lVar2 == null) {
            k6lVar2 = null;
        }
        this.N = new p8f(k6lVar2, (q82) this.l0.get());
        k6l k6lVar3 = this.V;
        if (k6lVar3 == null) {
            k6lVar3 = null;
        }
        this.K = new xg(this, k6lVar3);
        kwf kwfVar = (kwf) this.A0.get();
        k6l k6lVar4 = this.V;
        if (k6lVar4 == null) {
            k6lVar4 = null;
        }
        kwfVar.v = k6lVar4;
        kwfVar.o.d = k6lVar4;
        kwf kwfVar2 = (kwf) this.A0.get();
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        kwfVar2.f = qimVar;
        kwf kwfVar3 = (kwf) this.A0.get();
        p8f p8fVar = this.N;
        if (p8fVar == null) {
            p8fVar = null;
        }
        kwfVar3.y = p8fVar;
        ((kwf) this.A0.get()).A = (pgf) this.Z.getValue();
        ((kwf) this.A0.get()).C = new tt3(this, (byte) 18);
        umi umiVar2 = this.x;
        k6l k6lVar5 = this.V;
        if (k6lVar5 == null) {
            k6lVar5 = null;
        }
        this.R = new jl6(this, umiVar2, k6lVar5, operaApplication.L().c);
        this.C0.get();
        qwe qweVarB2 = operaApplication.B();
        qweVarB2.b(findViewById(2131364679));
        qweVarB2.b(findViewById(2131363372));
        qweVarB2.b(findViewById(2131364106));
        k6l k6lVar6 = this.V;
        b2l b2lVar = (k6lVar6 == null ? null : k6lVar6).o;
        if (b2lVar != null) {
            M().e(((d7l) b2lVar).j0());
        } else {
            if (k6lVar6 == null) {
                k6lVar6 = null;
            }
            k6lVar6.w.a(new dv3(this, b));
        }
        k6l k6lVar7 = this.V;
        if (k6lVar7 == null) {
            k6lVar7 = null;
        }
        k6lVar7.a(new uv3(this, operaApplication));
        l1(new fu3(this));
        k6l k6lVar8 = this.V;
        if (k6lVar8 == null) {
            k6lVar8 = null;
        }
        k6lVar8.b(new dv3(this, b2));
        k6l k6lVar9 = this.V;
        if (k6lVar9 == null) {
            k6lVar9 = null;
        }
        k6lVar9.b(new qz(operaApplication.H(), (byte) 22));
        ydn ydnVarR = operaApplication.R();
        pt3 pt3Var = new pt3(this, (byte) 2);
        qim qimVar2 = this.o;
        Objects.requireNonNull(qimVar2);
        sz4 sz4Var = this.h;
        qim qimVar3 = this.o;
        Objects.requireNonNull(qimVar3);
        ydnVarR.x(pt3Var, qimVar2, new w7j(this, sz4Var, this, qimVar3.c), this);
        l1(new hgn(ydnVarR, operaApplication.L().c));
        qim qimVar4 = this.o;
        Objects.requireNonNull(qimVar4);
        new y4g(this, ydnVarR, qimVar4, operaApplication.L().c, getLifecycle());
        yen yenVarT = operaApplication.T();
        boolean zJ = H0().J();
        yenVarT.l = this;
        ru9 ru9VarC = ru9.c(this);
        x53 x53Var = yenVarT.k;
        ru9VarC.a(x53Var);
        getLifecycle().a(new qs2(ru9VarC, x53Var));
        if (zJ && !((Boolean) yenVarT.j.g()).booleanValue()) {
            yenVarT.o();
        }
        lx3.a.b(this.O0);
        hj.a.b(this.O0);
        zwk zwkVarN = operaApplication.N();
        e3j e3jVarT = e3j.t(operaApplication);
        e3j e3jVar = zwkVarN.c;
        if (e3jVar != null) {
            e3jVar.H(zwkVarN);
        }
        zwkVarN.c = e3jVarT;
        e3jVarT.F(zwkVarN);
        l1((som) operaApplication.r.b1.get());
        k6l k6lVar10 = this.V;
        if (k6lVar10 == null) {
            k6lVar10 = null;
        }
        dxk dxkVar = new dxk(this, k6lVar10, operaApplication.N(), operaApplication.b(), operaApplication.L().c, this.x);
        this.U = dxkVar;
        l1(dxkVar);
        k6l k6lVar11 = this.V;
        if (k6lVar11 == null) {
            k6lVar11 = null;
        }
        l1(new d62(k6lVar11));
        PushedContentHandler pushedContentHandlerF = operaApplication.F();
        k6l k6lVar12 = this.V;
        if (k6lVar12 == null) {
            k6lVar12 = null;
        }
        pushedContentHandlerF.getClass();
        k6lVar12.b(new qz(pushedContentHandlerF, (byte) 20));
        oji ojiVarY = oji.y(getApplicationContext());
        k6l k6lVar13 = this.V;
        if (k6lVar13 == null) {
            k6lVar13 = null;
        }
        k6lVar13.b(new qz(ojiVarY, (byte) 26));
        S().a(new sv3(this, b));
        ij6.a.resize((int) (i0l.a(this) / 8));
        this.E = new t82(this, H0(), new ji(operaApplication, b3));
        q82 q82Var = (q82) this.l0.get();
        fqe fqeVarY = operaApplication.y();
        fqeVarY.getClass();
        eqe eqeVar = new eqe();
        uqe uqeVar = fqeVarY.c;
        if (uqeVar != null) {
            eqeVar.a.add(new tqe(uqeVar));
        }
        fqeVarY.g = new WeakReference(eqeVar);
        q82Var.a.b(eqeVar);
        umi umiVar3 = this.x;
        k6l k6lVar14 = this.V;
        if (k6lVar14 == null) {
            k6lVar14 = null;
        }
        this.O = new s28(this, umiVar3, k6lVar14, H0());
        this.Y = new m6m(this, M());
        z43 z43VarO0 = o0();
        this.z = z43VarO0;
        this.M = (gbf) z43VarO0.i;
        kwf kwfVar4 = (kwf) this.A0.get();
        gbf gbfVar = this.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        kwfVar4.D = gbfVar.j.v;
        CoroutineContext coroutineContext = fsp.y(this).b;
        cv6 cv6Var = bb7.a;
        a64 a64VarB = sgb.b(coroutineContext.plus(s6d.a.e));
        Boolean bool = Boolean.FALSE;
        final c37 c37Var = new c37(bool);
        final c37 c37Var2 = new c37(bool);
        this.S = new c37(Boolean.TRUE);
        this.L = new c37(bool);
        qo3 c37Var3 = (bt2) this.y.f().get();
        RootView rootView5 = this.Q;
        if (rootView5 == null) {
            rootView5 = null;
        }
        p37.d0(rootView5, (vt3) new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: vt3
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                int i = BrowserActivity.E1;
                BrowserActivity browserActivity2 = this;
                boolean z2 = false;
                ((nak) c37Var.a).k((Object) null, Boolean.valueOf(view2 != null && q9n.w(browserActivity2.e0(), view2)));
                if (view2 != null) {
                    BottomBar bottomBar8 = browserActivity2.A;
                    if (bottomBar8 == null) {
                        bottomBar8 = null;
                    }
                    if (q9n.w(bottomBar8, view2)) {
                        z2 = true;
                    }
                }
                ((nak) c37Var2.a).k((Object) null, Boolean.valueOf(z2));
            }
        });
        RootView rootView6 = this.Q;
        if (rootView6 == null) {
            rootView6 = null;
        }
        rootView6.setTag(2131362117, (n03) this.u0.get());
        this.X = t0();
        W0();
        U0();
        r22 r22Var = this.G;
        r22 r22Var2 = r22Var == null ? null : r22Var;
        wth wthVar = new wth(((t8l) this.z1.get()).c, a64VarB);
        jvj jvjVar2 = this.D;
        if (jvjVar2 == null) {
            jvjVar2 = null;
        }
        eq6 eq6Var = new eq6();
        eq6Var.a = a26.o0(qbe.t(ic4.l(f03.g(new qmb((byte) 1, (mt5) null, jvjVar2)), -1)), a64VarB, aej.b, Boolean.FALSE);
        dw dwVar = new dw(N0().e, a64VarB);
        c37 c37Var4 = new c37(Boolean.valueOf(N.M$PqApPr("KeyboardUrlBar")));
        b49 b49Var = new b49(new mt3(this, b), a64VarB, (byte) 0);
        dw dwVar2 = new dw(new mt3(this, (byte) 2), a64VarB);
        b49 b49Var2 = new b49(new mt3(this, (byte) 3), a64VarB);
        xm5 xm5Var = new xm5(S(), a64VarB);
        if (c37Var3 == null) {
            c37Var3 = new c37(bool);
        }
        qo3 qo3Var = c37Var3;
        nv6 nv6Var = new nv6(new mt3(this, (byte) 4), a64VarB);
        c37 c37Var5 = this.S;
        c37 c37Var6 = c37Var5 == null ? null : c37Var5;
        c37 c37Var7 = this.L;
        this.H = new jp3(r22Var2, wthVar, eq6Var, dwVar, c37Var, c37Var2, c37Var4, b49Var, dwVar2, b49Var2, xm5Var, qo3Var, nv6Var, c37Var6, c37Var7 == null ? null : c37Var7);
        BottomBar bottomBar8 = this.A;
        if (bottomBar8 == null) {
            bottomBar8 = null;
        }
        TextView textView = (TextView) bottomBar8.findViewById(2131363294);
        qq6 qq6Var = textView != null ? new qq6(textView) : null;
        BottomBar bottomBar9 = this.A;
        if (bottomBar9 == null) {
            bottomBar9 = null;
        }
        View viewFindViewById2 = bottomBar9.findViewById(2131362066);
        BottomBar bottomBar10 = this.A;
        if (bottomBar10 == null) {
            bottomBar10 = null;
        }
        View viewFindViewById3 = bottomBar10.findViewById(2131362176);
        BottomBar bottomBar11 = this.A;
        if (bottomBar11 == null) {
            bottomBar11 = null;
        }
        View viewFindViewById4 = bottomBar11.findViewById(2131364652);
        if (viewFindViewById4 != null) {
            z61 z61Var = new z61();
            if (viewFindViewById4.isAttachedToWindow()) {
                z61Var.onViewAttachedToWindow(viewFindViewById4);
            }
            viewFindViewById4.addOnAttachStateChangeListener(z61Var);
        }
        jp3 jp3Var = this.H;
        if (jp3Var == null) {
            jp3Var = null;
        }
        jp3Var.b(this, new rt3(this, qq6Var, viewFindViewById2, viewFindViewById3));
        BottomBar bottomBar12 = this.A;
        if (bottomBar12 == null) {
            bottomBar12 = null;
        }
        byte b5 = 3;
        bottomBar12.addOnLayoutChangeListener(new z22(this, b5));
        l1(new jw0(this, b5));
        StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = (StatusBarDrawingFrameLayout) findViewById(2131363384);
        bvl bvlVar = this.X;
        if (bvlVar == null) {
            bvlVar = null;
        }
        new wub(this, statusBarDrawingFrameLayout, bvlVar);
        Object objF = this.D0.f();
        if (objF != null) {
            p37.o0((VelocityTrackingCoordinatorLayout) ((t42) objF).w.c, 0, 0, 0, 0, 13);
        }
        bvl bvlVar2 = this.X;
        if (bvlVar2 == null) {
            bvlVar2 = null;
        }
        bvlVar2.getState().j(this, new ug(new st3(this, (byte) 0), (byte) 13));
        bvl bvlVar3 = this.X;
        if (bvlVar3 == null) {
            bvlVar3 = null;
        }
        bvlVar3.E().j(this, new ug(new st3(this, (byte) 1), (byte) 13));
        byte b6 = 5;
        mt3 mt3Var = new mt3(this, b6);
        bvl bvlVar4 = this.X;
        if (bvlVar4 == null) {
            bvlVar4 = null;
        }
        new pr(this, mt3Var, bvlVar4, browserFragmentP);
        g77 g77Var = new g77((byte) 27);
        ArrayList arrayList = (ArrayList) g77Var.b;
        int size = arrayList.size();
        arrayList.add(null);
        ((LinkedHashSet) g77Var.c).add(Integer.valueOf(size));
        byte b7 = 3;
        tt2 tt2Var = new tt2(g77Var, size, b7);
        gbf gbfVar2 = this.M;
        if (gbfVar2 == null) {
            gbfVar2 = null;
        }
        gbfVar2.o.b(new eb(tt2Var, this, b7));
        ArrayList arrayList2 = (ArrayList) g77Var.b;
        int size2 = arrayList2.size();
        arrayList2.add(null);
        ((LinkedHashSet) g77Var.c).add(Integer.valueOf(size2));
        tt2 tt2Var2 = new tt2(g77Var, size2, b7);
        gbf gbfVar3 = this.M;
        if (gbfVar3 == null) {
            gbfVar3 = null;
        }
        byte b8 = 17;
        gbfVar3.v.j(this, new k9(tt2Var2, b8));
        g77Var.w(new wx((Object) this, (Object) browserFragmentP, (byte) 20));
        qim qimVar5 = this.o;
        Objects.requireNonNull(qimVar5);
        ViewGroup viewGroup = (ViewGroup) findViewById(2131363372);
        gbf gbfVar4 = this.M;
        if (gbfVar4 == null) {
            gbfVar4 = null;
        }
        qimVar5.l = new uwf(viewGroup, gbfVar4);
        qim qimVar6 = this.o;
        Objects.requireNonNull(qimVar6);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(2131364106);
        z8b z8bVar = new z8b();
        z8bVar.b = viewGroup2;
        qimVar6.m = z8bVar;
        ysl yslVarM0 = M0();
        bvl bvlVar5 = this.X;
        if (bvlVar5 == null) {
            bvlVar5 = null;
        }
        yslVarM0.z(bvlVar5);
        LoadingView loadingView = (LoadingView) q9n.z(this);
        loadingView.b = new lv3(this);
        byte b9 = 7;
        this.U0.n(n1(), loadingView, new i16(this, operaApplication, b9));
        this.V0 = new igi(this, this, new pt3(this, (byte) 1), operaApplication.m().a, operaApplication.Q());
        p0();
        for (Map.Entry entry : s0().entrySet()) {
            browserFragmentP.f.a.put((String) entry.getKey(), (lnf) entry.getValue());
        }
        this.J = new pu3(this, H0().J());
        if (H0().J() && operaApplication.l().b() && m5h.q()) {
            m5h.x(this);
        }
        if (H0().J()) {
            this.D1 = 1;
            ((b1o) operaApplication.r.r1.get()).c();
        } else if (H0().N()) {
            this.D1 = 2;
        }
        if (H0().n("version_code") != 1910404306) {
            t9l t9lVar = new t9l(this, H0(), new wv1(new pv3(operaApplication, (byte) 5), (byte) 1));
            t9lVar.a(new x1n((byte) 0));
            t9lVar.a(new au5(this, new wv1(new pv3(operaApplication, (byte) 6), (byte) 1), (byte) 4));
            byte b10 = 2;
            t9lVar.a(new fyk(new wv1(new pv3(operaApplication, (byte) 7), (byte) 1), new wv1(new pv3(operaApplication, (byte) 8), (byte) 1), new tt3(this, (byte) 1), b10));
            t9lVar.a(new x1n((byte) 4));
            byte b11 = 3;
            t9lVar.a(new x1n(b11));
            t9lVar.a(new x1n(b10));
            t9lVar.a(new fyk(this, new tt3(this, b10), this.x, b11));
            t9lVar.a(new och(new wv1(new pv3(operaApplication, (byte) 9), (byte) 1), (byte) 1));
            t9lVar.a(new au5(new wv1(new pv3(operaApplication, (byte) 10), (byte) 1), new wv1(new pv3(operaApplication, (byte) 11), (byte) 1), (byte) 3));
            t9lVar.a(new x1n(new uu1((byte) 25)));
            t9lVar.a(new och(new wv1(new pv3(operaApplication, (byte) 12), (byte) 1), (byte) 2));
            t9lVar.a(new z1n(new tt3(this, (byte) 3), (byte) 0));
            t9lVar.a(new z1n(new tt3(this, b6), b9));
            byte b12 = 6;
            t9lVar.a(new z1n(new tt3(this, b12), (byte) 2));
            t9lVar.a(new z1n(new tt3(this, b9), b12));
            t9lVar.a(new och(new wv1(new pv3(operaApplication, (byte) 13), (byte) 1), (byte) 3));
            t9lVar.a(new au5(new tt3(this, (byte) 8), new wv1(new pv3(operaApplication, (byte) 14), (byte) 1), b6));
            t9lVar.a(new z1n(new tt3(this, (byte) 9), (byte) 3));
            t9lVar.a(new z1n(new tt3(this, (byte) 10), (byte) 4));
            byte b13 = 1;
            t9lVar.a(new au5(new tt3(this, (byte) 11), new wv1(new pv3(operaApplication, (byte) 15), (byte) 1), (byte) 6));
            t9lVar.a(new au5(new tt3(this, (byte) 12), new wv1(new pv3(operaApplication, (byte) 16), (byte) 1), b9));
            t9lVar.a(new z1n(new tt3(this, (byte) 13), b6));
            t9lVar.a(new z1n(new tt3(this, (byte) 14), b13));
            t9lVar.a(new fyk(new wv1(new pv3(operaApplication, (byte) 17), (byte) 1), new tt3(this, (byte) 15), new wv1(new pv3(operaApplication, (byte) 18), (byte) 1)));
            t9lVar.a(new au5(new tt3(this, (byte) 16), new wv1(new pv3(operaApplication, (byte) 19), (byte) 1), b13));
            t9lVar.a(new och(new wv1(new pv3(operaApplication, (byte) 20), (byte) 1), (byte) 0));
            t9lVar.a(new fyk(this, this.x, new tt3(this, b8), b13));
            t9lVar.a(new au5(operaApplication.o(), this, (byte) 8));
            t9lVar.a(new au5(this, this.x, (byte) 2));
            t9lVar.a(new au5(new mt3(this, b9), new pv3(operaApplication, (byte) 21), (byte) 0));
            t9lVar.b().run();
        }
        syn.a(this, ru9.c(this), this.x);
        RootView rootView7 = this.Q;
        if (rootView7 == null) {
            rootView7 = null;
        }
        gyf gyfVar = new gyf(rootView7, 2000L);
        this.y.e().get();
        final Lazy lazyG = this.y.g();
        final gb3 gb3Var = new gb3(this, gyfVar, (byte) 5);
        String[] strArr3 = OperaApplication.K;
        final SettingsManager settingsManagerJ = ((OperaApplication) getApplication()).J();
        final gv3 gv3Var = new gv3(this, (byte) 6);
        final gv3 gv3Var2 = new gv3(this, b9);
        final ga6 ga6Var = new ga6(settingsManagerJ, b9);
        if (ga6Var.p()) {
            final byte b14 = 0;
            Runnable runnable = new Runnable() { // from class: tp7
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    switch (b14) {
                        case 0:
                            ga6 ga6Var2 = (ga6) ga6Var;
                            BrowserActivity browserActivity2 = (BrowserActivity) this;
                            gb3 gb3Var2 = (gb3) gb3Var;
                            gv3 gv3Var3 = (gv3) gv3Var;
                            gv3 gv3Var4 = (gv3) gv3Var2;
                            SettingsManager settingsManager = (SettingsManager) settingsManagerJ;
                            Lazy lazy = (Lazy) lazyG;
                            if (!ga6Var2.p() || !browserActivity2.getLifecycle().i.d(qcc.e)) {
                                gb3Var2.invoke();
                                break;
                            } else {
                                y7f y7fVar = (y7f) ((z7f) gv3Var3.get()).i();
                                if (!(y7fVar instanceof v7f)) {
                                    gb3Var2.invoke();
                                    break;
                                } else {
                                    r1 r1VarV = v1.u(gv3Var4.b).v();
                                    if (r1VarV == null || (str = r1VarV.a) == null) {
                                        str = ((v7f) y7fVar).b;
                                    }
                                    String str2 = str;
                                    if (str2 != null && str2.length() != 0) {
                                        if (!Intrinsics.a(settingsManager.z("wallpaper_current"), str2)) {
                                            new hd(settingsManager, (qln) lazy.get(), ga6Var2, gb3Var2, str2);
                                            break;
                                        } else {
                                            gb3Var2.invoke();
                                            break;
                                        }
                                    } else {
                                        gb3Var2.invoke();
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            rva rvaVar = (rva) ga6Var;
                            qya qyaVar = (qya) this;
                            Matrix matrix = (Matrix) gb3Var;
                            qya qyaVar2 = (qya) gv3Var;
                            Rect rect = (Rect) gv3Var2;
                            lva lvaVar = (lva) settingsManagerJ;
                            l94 l94Var = (l94) lazyG;
                            if (!rvaVar.u) {
                                l94Var.d(new crf("ImageAnalysis is detached"));
                                break;
                            } else {
                                d5j d5jVar = new d5j(qyaVar2, (Size) null, new tn2(qyaVar.h1().d(), qyaVar.h1().e(), rvaVar.e ? 0 : rvaVar.b, matrix, qyaVar.h1().c()));
                                if (!rect.isEmpty()) {
                                    d5jVar.k(rect);
                                }
                                lvaVar.a(d5jVar);
                                l94Var.b((Object) null);
                                break;
                            }
                    }
                }
            };
            r1 = this;
            Runnable vr9Var = new vr9(runnable, 2);
            ((z7f) gv3Var.get()).b(vr9Var);
            ((v1) gv3Var2.get()).b(vr9Var);
        } else {
            gb3Var.invoke();
            r1 = this;
        }
        operaApplication.n().e = r1.R0;
        if (!((SharedPreferences) tjh.a(r1).a.get()).getBoolean("rated", false) && "google_play".equals(((OperaApplication) r1.getApplicationContext()).l().a()) && tz5.a() <= 0) {
            r1.b1 = new sjh(r1, r1.n1(), r1.H0(), operaApplication.Q(), operaApplication.P(), (qjh) r1.y.Z.get(), ((lpe) operaApplication.A.get()).c);
        }
        r1.l1(new rwe(r1, r1.P0(), r1.n1().p(), operaApplication.Q(), r1.O()));
        if (l0h.a(r1, r1.H0())) {
            qim qimVar7 = r1.o;
            Objects.requireNonNull(qimVar7);
            oz3 oz3Var = qimVar7.g;
            gbf gbfVar5 = r1.M;
            new l0h(r1, this, this, oz3Var, gbfVar5 == null ? null : gbfVar5, r1.n1(), r1.H0());
        }
        if (ru9.c(this).a.getBoolean("privacy_settings.promotion.can_show", false)) {
            browserActivity = this;
            new q0h(browserActivity, this, this, O(), n1());
        } else {
            browserActivity = this;
        }
        browserActivity.Y0();
        browserActivity.a1();
        browserActivity.Z0();
        browserActivity.y.d().get();
        n1h.p(browserActivity, browserActivity.x, browserActivity.H0());
        w1h.r(browserActivity, browserActivity, browserActivity.x, ((lpe) operaApplication.A.get()).c);
        upj.t(browserActivity, browserActivity, browserActivity.x, (u0a) operaApplication.s.get());
        browserActivity.y.a().get();
        na2.B(fsp.y(browserActivity), (CoroutineContext) null, (rx5) null, new yf((byte) 5, (mt5) null, browserActivity), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void recreate() {
        BrowserFragment browserFragmentP = P();
        if (browserFragmentP != null) {
            ami amiVar = browserFragmentP.r;
            if (((ro9) amiVar.g).b == 1) {
                amiVar.w(new ro9(amiVar, 4), true);
            }
        }
        super/*android.app.Activity*/.recreate();
    }

    @Override // defpackage.dx3, defpackage.hjf
    public final fi s() {
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LinkedHashMap s0() {
        bvl bvlVar = this.X;
        if (bvlVar == null) {
            bvlVar = null;
        }
        r22 r22Var = this.I;
        if (r22Var == null) {
            r22Var = null;
        }
        pde pdeVar = (pde) new s14(this, bvlVar, r22Var, P().f0().c, false).f;
        bvl bvlVar2 = this.X;
        if (bvlVar2 == null) {
            bvlVar2 = null;
        }
        r22 r22Var2 = this.I;
        if (r22Var2 == null) {
            r22Var2 = null;
        }
        pde pdeVar2 = (pde) new s14(this, bvlVar2, r22Var2, P().f0().c, true).f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tester", new zl(this, pdeVar, (byte) 2));
        xnh xnhVarT = xnh.t(getApplicationContext());
        lv3 lv3Var = new lv3(this);
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        tw3 tw3Var = this.y;
        tlg tlgVar = (tlg) tw3Var.M.get();
        hv3 hv3Var = new hv3(this);
        j4c j4cVar = operaApplication.I;
        xv1 xv1Var = operaApplication.r;
        u8k u8kVar = (u8k) j4cVar.get();
        hw3 hw3Var = tw3Var.F;
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        xt3 xt3Var = new xt3(this, (byte) 1);
        bvl bvlVar3 = this.X;
        if (bvlVar3 == null) {
            bvlVar3 = null;
        }
        r22 r22Var3 = this.I;
        if (r22Var3 == null) {
            r22Var3 = null;
        }
        r22 r22Var4 = r22Var3;
        bvl bvlVar4 = bvlVar3;
        m5k m5kVar = new m5k(this, u8kVar, hw3Var, qimVar, xt3Var, bvlVar4, r22Var4, operaApplication.L().c, operaApplication.L().d, operaApplication.L().f, this.x, (ekn) ((j4c) tw3Var.a.a.f).get(), new s6h(this, operaApplication.L().c, false), operaApplication.j(), xnhVarT, ((lpe) operaApplication.A.get()).k, L0(), H0(), P0(), (nue) tw3Var.E.get(), operaApplication.y(), lv3Var, new wt3(this, (byte) 5), this.k1, ((mo3) this.x1.get()).a, new f1p(operaApplication, this), ((qln) ((j4c) tw3Var.a.a.e).get()).h, this.z0, (ykn) this.s1.get(), pdeVar2, operaApplication.v(), ((xnc) operaApplication.z.get()).b, operaApplication.w(), (qnc) ((snc) xv1Var.W.get()).i.getValue(), (w6o) tw3Var.E0.get(), operaApplication.o(), new zt((Object) this, (byte) 4), (qr8) this.g0.E(qr8.class), new qq6(tw3Var.L, (byte) 13), (nv2) tw3Var.a.m().get(), tlgVar, tw3Var.a.d, new jv3(this, (byte) 3), hv3Var, tw3Var.D0, tw3Var.a.r(), ((snc) xv1Var.W.get()).h, new jv3(this, (byte) 4), ((snc) xv1Var.W.get()).j);
        byte b = 1;
        byte b2 = 18;
        byte b3 = 0;
        d5k d5kVar = new d5k(new m4k(new l4k(m5kVar, b), b2), new m4k(new l4k(m5kVar, b3), b2));
        linkedHashMap.put("startpage", d5kVar);
        this.T = d5kVar;
        linkedHashMap.put("referrer", new zl(this, pdeVar, b));
        linkedHashMap.put("ads-debug", new zl(this, pdeVar, b3));
        linkedHashMap.put("subscription", new ilk(this, pdeVar, G0()));
        return linkedHashMap;
    }

    public final void s1(View view, int i, boolean z) {
        bv bvVar = this.H0;
        if (bvVar != null) {
            bvVar.b();
        }
        bv bvVar2 = new bv(z, this, P0(), new ro9(this, i, view, (byte) 7));
        this.H0 = bvVar2;
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        bvVar2.f = qimVar;
        A1(bvVar2, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public final void setTheme(int i) {
        super.setTheme(i);
        getTheme().applyStyle(2132083102, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dx3
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        String[] strArr = OperaApplication.K;
        if (rm5.z(this, intent, new hda(new zx1(this, (byte) 5), this, (byte) 18))) {
            return;
        }
        alo.R(this, intent);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // defpackage.dx3, defpackage.hjf
    /* renamed from: t */
    public final ijf s() {
        return this.y;
    }

    public final bvl t0() {
        z43 z43Var = this.z;
        if ((z43Var != null ? z43Var : null) instanceof uul) {
            if (z43Var == null) {
                z43Var = null;
            }
            uul uulVar = (uul) z43Var;
            return H0().Z() ? new ju1(this, uulVar, (byte) 1) : new ju1(this, uulVar, (byte) 0);
        }
        gbf gbfVar = this.M;
        gbf gbfVar2 = gbfVar == null ? null : gbfVar;
        k6l k6lVar = this.V;
        k6l k6lVar2 = k6lVar == null ? null : k6lVar;
        mt3 mt3Var = new mt3(this, (byte) 10);
        TopToolbarContainer topToolbarContainer = this.W;
        return new g7m(this, gbfVar2, k6lVar2, mt3Var, topToolbarContainer == null ? null : topToolbarContainer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t1() {
        ru9 ru9VarC = ru9.c(this);
        if (ru9VarC.a.getBoolean("app.icon.is_changed", false)) {
            nv6 nv6VarB = ru9VarC.b();
            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("app.icon.is_changed", false);
            nv6VarB.w();
            String[] strArr = OperaApplication.K;
            x5f x5fVar = ((OperaApplication) getApplication()).L().c;
            d7j d7jVarE = H0().e();
            if (d7jVarE != d7j.DEFAULT) {
                x5fVar.S(28);
            }
            h70 h70Var = d7jVarE.d ? h70.b : h70.c;
            String str = d7jVarE.a;
            byte b = 1;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                g70 g70Var = (g70) am2.g(zpaVar, x56VarF).d.getValue();
                f70 f70Var = g70Var.a;
                f70Var.getClass();
                f70Var.q(0, 1, str);
                f70 f70Var2 = g70Var.a;
                f70Var2.getClass();
                f70Var2.q(1, 1, h70Var);
                x5fVar.U0(x56VarF);
            }
            ysj ysjVarJ0 = J0();
            qt qtVar = new qt(new qt3(this, (byte) 5), b);
            ysjVarJ0.getClass();
            ysjVarJ0.b(qtVar, ijm.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImageView u0() {
        z43 z43Var = this.z;
        if (z43Var == null) {
            z43Var = null;
        }
        ImageView imageViewF = z43Var.f();
        if (imageViewF != null) {
            return imageViewF;
        }
        ImageView imageView = (ImageView) findViewById(2131362184);
        return imageView != null ? imageView : new ImageView(this);
    }

    public final void u1(re7 re7Var, int i) {
        Fragment fragmentF = getSupportFragmentManager().F("DownloadsFragment");
        if (fragmentF == null || fragmentF.isRemoving()) {
            Bundle bundle = new Bundle();
            byte b = 4;
            if (re7Var != null && re7Var.f == 4) {
                bundle.putLong("download", re7Var.o);
            }
            qim qimVar = this.o;
            Objects.requireNonNull(qimVar);
            qimVar.g(new zhj(new wzg(null, wg7.class, b), bundle, 1, i, "DownloadsFragment", true, Arrays.asList(new n6h[0])));
        }
    }

    public final void v0() {
        tg7 tg7Var = this.N0;
        if (tg7Var != null) {
            tg7Var.b(hjm.b, 3);
        }
        this.N0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v1() {
        nv6 nv6VarB = ru9.c(this).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("main.menu.button.clicked", true);
        nv6VarB.w();
        b2l b2lVarW0 = w0();
        if (b2lVarW0 != null) {
            ((d7l) b2lVarW0).M(true);
        }
        if (B0() == null && this.s != null) {
            B1();
            ((ll9) getSystemService("com.opera.android.ui.FRAGMENT_CONTROLLER_SERVICE")).b(zhj.a(new i7d(q0(), this.o1, false), 0));
        }
    }

    public final b2l w0() {
        k6l k6lVarW = W();
        if (k6lVarW != null) {
            return k6lVarW.o;
        }
        return null;
    }

    public final void w1(View view, boolean z) {
        B1();
        nke nkeVar = this.G0;
        if (nkeVar != null) {
            nkeVar.b();
        }
        jp3 jp3Var = this.H;
        if (jp3Var == null) {
            jp3Var = null;
        }
        boolean z2 = ((kp3) ((rlh) jp3Var.d).a.getValue()).a.b;
        b2l b2lVarW0 = w0();
        if (b2lVarW0 == null) {
            return;
        }
        nke nkeVar2 = new nke(this, b2lVarW0, z, z2);
        this.G0 = nkeVar2;
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        nkeVar2.f = qimVar;
        nkeVar2.o(view);
    }

    public final wy x0() {
        return (wy) this.h1.getValue();
    }

    public final void x1() {
        nej nejVarI0 = I0();
        k6l k6lVar = this.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        im6 im6Var = new im6(k6lVar, H0(), (d8j) this.g0.E(d8j.class), (byte) 5);
        nejVarI0.getClass();
        nejVarI0.b(im6Var, ijm.b);
    }

    @Override // defpackage.hjf
    public final qp2 y() {
        return new qp2((byte) 18);
    }

    public final mm6 y0() {
        return (mm6) this.y.a.u.get();
    }

    public final void y1() {
        b2l b2lVarW0 = w0();
        if (b2lVarW0 == null) {
            return;
        }
        d7l d7lVar = (d7l) b2lVarW0;
        if (!wqm.w(d7lVar.j.getUrl()) || d7lVar.j.m()) {
            h0(b2lVarW0);
        }
        o1(1);
    }

    public final z77 z0() {
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        return qimVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z1(long j, long j2, boolean z) {
        this.q0 = true;
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        BrowserFragment browserFragmentP = P();
        Intent intent = null;
        if (browserFragmentP != null) {
            igi igiVar = operaApplication.m().b;
            if (browserFragmentP.e != null) {
                j4c j4cVar = OperaBrowserContext.b;
                N.MP_D9iRv();
                ami amiVar = browserFragmentP.r;
                zz2 zz2Var = (zz2) amiVar.h;
                if (zz2Var != null) {
                    zz2Var.a(true);
                    amiVar.h = null;
                }
                wf7 wf7Var = (wf7) igiVar.f;
                wf7Var.getClass();
                vml.a(wf7Var);
                wf7Var.a = false;
                wf7Var.c.clear();
                for (vf7 vf7Var : vf7.values()) {
                    igiVar.q(vf7Var);
                }
                ((HashMap) igiVar.c).clear();
            }
        }
        ydn ydnVarR = operaApplication.R();
        boolean z2 = this.S0 || !(ydnVarR.c.isEnabled() && ydnVarR.d.a);
        if (z) {
            SessionStore sessionStore = SessionStore.j;
            sessionStore.a(!z2);
            long j3 = sessionStore.a;
            N.M6VmnLt8(j3);
            N.Ml0K9PX$(j3);
        }
        sf7 sf7VarM = operaApplication.m();
        sf7VarM.a.r();
        sf7VarM.d.p();
        if (z2) {
            j4c j4cVar2 = OperaBrowserContext.b;
            N.MoK6EWkw();
            nv6 nv6VarB = ru9.c(t8.a).b();
            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("discard_session_cookies_at_startup", true);
            nv6VarB.w();
            N.MnIUGrsh();
            cbk cbkVar = operaApplication.m;
            boolean z3 = this.S0;
            cbkVar.getClass();
            Intent intent2 = getIntent();
            if (z3) {
                if (Intrinsics.a(intent2 != null ? intent2.getAction() : null, "com.opera.android.action.PROTECTED_INTENT")) {
                    intent = intent2;
                }
            }
            bbk bbkVar = new bbk(cbkVar, this, intent, z3);
            cbkVar.e = bbkVar;
            vml.d(bbkVar, j);
        }
        new oml(this.x.d(new qt3(this, (byte) 11))).b(null, j2, TimeUnit.MILLISECONDS, null);
    }
}
