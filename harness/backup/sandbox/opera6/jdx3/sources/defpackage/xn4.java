package defpackage;

import android.content.Context;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.opera.android.media.PlayerContainerView;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class xn4 extends lcp {
    public final HashMap s = new HashMap();
    public final /* synthetic */ yn4 t;

    public xn4(yn4 yn4Var) {
        this.t = yn4Var;
    }

    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void onSessionStarting(CastSession castSession) throws Throwable {
        Q(castSession);
        yn4 yn4Var = this.t;
        yn4Var.j = castSession;
        i7f i7fVar = yn4Var.c;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((PlayerContainerView) g7fVarC.next()).e(castSession);
        }
    }

    public final void B(CastSession castSession, int i) {
        O(castSession);
    }

    public final void O(CastSession castSession) {
        zn4 zn4Var;
        b18 b18Var = (b18) this.s.remove(castSession);
        if (b18Var != null && (zn4Var = b18Var.a) != null) {
            zn4Var.a();
        }
        P(castSession);
    }

    public final void P(CastSession castSession) {
        yn4 yn4Var = this.t;
        if (yn4Var.j == castSession) {
            yn4Var.j = null;
            i7f i7fVar = yn4Var.c;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((PlayerContainerView) g7fVarC.next()).e(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[LOOP:1: B:22:0x0062->B:63:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(com.google.android.gms.cast.framework.CastSession r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.util.HashMap r0 = r13.s
            boolean r1 = r0.containsKey(r14)
            if (r1 != 0) goto Ld9
            b18 r1 = new b18
            r1.<init>()
            r0.put(r14, r1)
            hu5 r0 = new hu5
            r1 = 7
            r0.<init>(r13, r14, r1)
            com.opera.android.http.server.HttpServer r13 = new com.opera.android.http.server.HttpServer
            r13.<init>()
            boolean r1 = defpackage.i0l.g()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L42
            java.lang.String r14 = "arc.net.ipv4.host_address"
            java.lang.String r14 = defpackage.i0l.f(r14)
            if (r14 == 0) goto L30
            java.net.InetAddress r14 = java.net.InetAddress.getByName(r14)     // Catch: java.net.UnknownHostException -> L30
            goto L31
        L30:
            r14 = r3
        L31:
            r1 = 4
            byte[] r1 = new byte[r1]     // Catch: java.net.UnknownHostException -> L3d
            r1 = {x00da: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array     // Catch: java.net.UnknownHostException -> L3d
            java.net.InetAddress r1 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L3d
            goto Lbf
        L3d:
            r13 = move-exception
            defpackage.rqd.p(r13)
            return
        L42:
            com.google.android.gms.cast.CastDevice r14 = r14.getCastDevice()
            java.net.InetAddress r14 = r14.getInetAddress()
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> Lbd
        L4e:
            boolean r4 = r1.hasMoreElements()     // Catch: java.net.SocketException -> Lbd
            if (r4 == 0) goto Lbd
            java.lang.Object r4 = r1.nextElement()     // Catch: java.net.SocketException -> Lbd
            java.net.NetworkInterface r4 = (java.net.NetworkInterface) r4     // Catch: java.net.SocketException -> Lbd
            java.util.List r4 = r4.getInterfaceAddresses()     // Catch: java.net.SocketException -> Lbd
            java.util.Iterator r4 = r4.iterator()     // Catch: java.net.SocketException -> Lbd
        L62:
            boolean r5 = r4.hasNext()     // Catch: java.net.SocketException -> Lbd
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()     // Catch: java.net.SocketException -> Lbd
            java.net.InterfaceAddress r5 = (java.net.InterfaceAddress) r5     // Catch: java.net.SocketException -> Lbd
            java.net.InetAddress r6 = r5.getAddress()     // Catch: java.net.SocketException -> Lbd
            short r7 = r5.getNetworkPrefixLength()     // Catch: java.net.SocketException -> Lbd
            java.lang.Class r8 = r14.getClass()     // Catch: java.net.SocketException -> Lbd
            java.lang.Class r9 = r6.getClass()     // Catch: java.net.SocketException -> Lbd
            boolean r8 = r8.equals(r9)     // Catch: java.net.SocketException -> Lbd
            if (r8 == 0) goto Lb5
            if (r7 >= 0) goto L8b
            boolean r6 = r14.equals(r6)     // Catch: java.net.SocketException -> Lbd
            goto Lb6
        L8b:
            byte[] r8 = r14.getAddress()     // Catch: java.net.SocketException -> Lbd
            byte[] r6 = r6.getAddress()     // Catch: java.net.SocketException -> Lbd
            int r9 = r7 / 8
            int r7 = r7 % 8
            r10 = 65280(0xff00, float:9.1477E-41)
            int r10 = r10 >> r7
            byte r7 = (byte) r10     // Catch: java.net.SocketException -> Lbd
            r10 = r2
        L9d:
            if (r10 >= r9) goto La8
            r11 = r8[r10]     // Catch: java.net.SocketException -> Lbd
            r12 = r6[r10]     // Catch: java.net.SocketException -> Lbd
            if (r11 != r12) goto Lb5
            int r10 = r10 + 1
            goto L9d
        La8:
            r10 = 1
            if (r7 == 0) goto Lb3
            r8 = r8[r9]     // Catch: java.net.SocketException -> Lbd
            r8 = r8 & r7
            r6 = r6[r9]     // Catch: java.net.SocketException -> Lbd
            r6 = r6 & r7
            if (r8 != r6) goto Lb5
        Lb3:
            r6 = r10
            goto Lb6
        Lb5:
            r6 = r2
        Lb6:
            if (r6 == 0) goto L62
            java.net.InetAddress r14 = r5.getAddress()     // Catch: java.net.SocketException -> Lbd
            goto Lbe
        Lbd:
            r14 = r3
        Lbe:
            r1 = r14
        Lbf:
            if (r1 == 0) goto Ld6
            if (r14 == 0) goto Ld6
            su r3 = new su
            r4 = 9
            r3.<init>(r14, r13, r0, r4)
            r13.d = r3
            long r13 = r13.b
            java.lang.String r0 = r1.getHostAddress()
            J.N.M8i2vxZx(r13, r0, r2)
            goto Ld9
        Ld6:
            r0.run(r3)
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn4.Q(com.google.android.gms.cast.framework.CastSession):void");
    }

    public final void R(CastSession castSession, b18 b18Var) {
        if (b18Var.a == null || !b18Var.b) {
            return;
        }
        this.s.remove(castSession);
        zn4 zn4Var = b18Var.a;
        yn4 yn4Var = this.t;
        if (yn4Var.j != null) {
            yn4Var.j = null;
            i7f i7fVar = yn4Var.c;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((PlayerContainerView) g7fVarC.next()).e(null);
            }
        }
        xbf xbfVar = yn4Var.f;
        if (xbfVar == null) {
            zn4Var.a();
            return;
        }
        tjg tjgVar = (tjg) xbfVar.b;
        Context context = tjgVar.a;
        njg njgVar = tjgVar.x;
        if (njgVar != null) {
            njgVar.t.removeSessionManagerListener(njgVar, CastSession.class);
        }
        tjgVar.x = new njg(tjgVar, castSession);
        if (tjgVar.h != null) {
            zn4Var.a();
            return;
        }
        xmf xmfVar = new xmf();
        zo4 zo4Var = new zo4(context, CastContext.getSharedInstance(), xmfVar, tjgVar.c());
        okg okgVar = new okg(context, new kjg(tjgVar, (byte) 3), new a32((Object) tjgVar, (Object) zo4Var, (Object) zn4Var, (byte) 25));
        xmfVar.a = new mjg(okgVar);
        tjgVar.m(zo4Var, okgVar);
    }

    public final void S(CastSession castSession) {
        b18 b18Var = (b18) this.s.get(castSession);
        if (b18Var == null) {
            vml.c(new a18(this, castSession, (byte) 0));
        } else {
            b18Var.b = true;
            R(castSession, b18Var);
        }
    }

    public final void onSessionEnded(Session session, int i) {
        O((CastSession) session);
    }

    public final void onSessionResumeFailed(Session session, int i) {
        O((CastSession) session);
    }

    public final void onSessionResumed(Session session, boolean z) {
        S((CastSession) session);
    }

    public final void onSessionResuming(Session session, String str) throws Throwable {
        Q((CastSession) session);
    }

    public final void onSessionStarted(Session session, String str) {
        S((CastSession) session);
    }

    public final void onSessionSuspended(Session session, int i) {
        O((CastSession) session);
    }

    public final void v(CastSession castSession, int i) {
        O(castSession);
    }

    public final void w(CastSession castSession, boolean z) {
        S(castSession);
    }

    public final void x(CastSession castSession, String str) throws Throwable {
        Q(castSession);
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void onSessionStartFailed(CastSession castSession, int i) {
        O(castSession);
        yn4 yn4Var = this.t;
        if (yn4Var.j != null) {
            yn4Var.j = null;
            i7f i7fVar = yn4Var.c;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((PlayerContainerView) g7fVarC.next()).e(null);
            }
        }
    }

    public final void z(CastSession castSession, String str) {
        S(castSession);
    }
}
