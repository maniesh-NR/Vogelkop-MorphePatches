package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pc {
    public static final pc A;
    public static final /* synthetic */ pc[] B;
    public static final /* synthetic */ h58 C;
    public static final pc d;
    public static final pc e;
    public static final pc f;
    public static final pc g;
    public static final pc h;
    public static final pc i;
    public static final pc j;
    public static final pc k;
    public static final pc l;
    public static final pc m;
    public static final pc n;
    public static final pc o;
    public static final pc p;
    public static final pc q;
    public static final pc r;
    public static final pc s;
    public static final pc t;
    public static final pc u;
    public static final pc v;
    public static final pc w;
    public static final pc x;
    public static final pc y;
    public static final pc z;
    public final xc a;
    public final boolean b;
    public final hs0 c;

    static {
        pc pcVar = new pc("BACK", 0, xc.g, true, hs0.c);
        d = pcVar;
        xc xcVar = xc.h;
        pc pcVar2 = new pc("FORWARD", 1, xcVar, true, hs0.i);
        e = pcVar2;
        pc pcVar3 = new pc("FORWARD_OR_RELOAD", 2, xcVar, true, hs0.j);
        f = pcVar3;
        pc pcVar4 = new pc("RELOAD", 3, xc.i, true, hs0.r);
        g = pcVar4;
        xc xcVar2 = xc.j;
        pc pcVar5 = new pc("HOME", 4, xcVar2, true, hs0.l);
        h = pcVar5;
        pc pcVar6 = new pc("HOME_OR_SEARCH", 5, xcVar2, true, hs0.m);
        i = pcVar6;
        pc pcVar7 = new pc("SEARCH", 6, xc.k, true, hs0.s);
        j = pcVar7;
        pc pcVar8 = new pc("TAB_GALLERY", 7, xc.l, true, hs0.u);
        k = pcVar8;
        pc pcVar9 = new pc("MAIN_MENU", 8, xc.m, true, hs0.o);
        l = pcVar9;
        pc pcVar10 = new pc("ARIA", 9, xc.n, true, hs0.b);
        m = pcVar10;
        pc pcVar11 = new pc("BOOKMARKS", 10, xc.o, true, hs0.d);
        pc pcVar12 = new pc("CRYPTO_WALLET", 11, xc.p, false, hs0.e);
        pc pcVar13 = new pc("DOWNLOADS", 12, xc.q, true, hs0.f);
        pc pcVar14 = new pc("EXIT", 13, xc.r, true, hs0.g);
        pc pcVar15 = new pc("FLOW", 14, xc.s, true, hs0.h);
        n = pcVar15;
        pc pcVar16 = new pc("HISTORY", 15, xc.t, true, hs0.k);
        pc pcVar17 = new pc("LIVE_SCORES", 16, xc.u, true, hs0.n);
        o = pcVar17;
        pc pcVar18 = new pc("OFFLINE_PAGES", 17, xc.v, true, hs0.p);
        pc pcVar19 = new pc("PASSWORDS", 18, xc.w, true, hs0.q);
        pc pcVar20 = new pc("SETTINGS", 19, xc.x, true, hs0.t);
        pc pcVar21 = new pc("CUSTOMIZE_BOTTOM_BAR", 20, xc.y, false, null);
        p = pcVar21;
        pc pcVar22 = new pc("NEW_BOOKMARK", 21, xc.z, false, null);
        q = pcVar22;
        pc pcVar23 = new pc("CLEAR_HISTORY", 22, xc.A, false, null);
        r = pcVar23;
        pc pcVar24 = new pc("ARIA_NEW_CHAT", 23, xc.B, false, null);
        pc pcVar25 = new pc("ARIA_TALK", 24, xc.C, false, null);
        s = pcVar25;
        pc pcVar26 = new pc("ARIA_CHATS", 25, xc.D, false, null);
        t = pcVar26;
        pc pcVar27 = new pc("ARIA_CHAT", 26, xc.E, false, null);
        u = pcVar27;
        pc pcVar28 = new pc("VOICE_SEARCH", 27, xc.G, false, null);
        v = pcVar28;
        pc pcVar29 = new pc("HOME_OR_ARIA_OR_SEARCH", 28, xcVar2, true, hs0.v);
        w = pcVar29;
        pc pcVar30 = new pc("MINIPAY", 29, xc.I, true, hs0.w);
        pc pcVar31 = new pc("REWARDS", 30, xc.M, true, hs0.x);
        x = pcVar31;
        pc pcVar32 = new pc("SCAN_QR", 31, xc.H, false, null);
        y = pcVar32;
        pc pcVar33 = new pc("AI_MODE", 32, xc.F, false, null);
        z = pcVar33;
        pc pcVar34 = new pc("PRIVATE", 33, xc.N, false, null);
        A = pcVar34;
        pc[] pcVarArr = {pcVar, pcVar2, pcVar3, pcVar4, pcVar5, pcVar6, pcVar7, pcVar8, pcVar9, pcVar10, pcVar11, pcVar12, pcVar13, pcVar14, pcVar15, pcVar16, pcVar17, pcVar18, pcVar19, pcVar20, pcVar21, pcVar22, pcVar23, pcVar24, pcVar25, pcVar26, pcVar27, pcVar28, pcVar29, pcVar30, pcVar31, pcVar32, pcVar33, pcVar34};
        B = pcVarArr;
        C = new h58(pcVarArr);
    }

    public pc(String str, int i2, xc xcVar, boolean z2, hs0 hs0Var) {
        this.a = xcVar;
        this.b = z2;
        this.c = hs0Var;
    }

    public static pc valueOf(String str) {
        return (pc) Enum.valueOf(pc.class, str);
    }

    public static pc[] values() {
        return (pc[]) B.clone();
    }
}
