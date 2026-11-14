package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lid extends Binder implements ksa {
    public final WeakReference a;

    public lid(gid gidVar) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.a = new WeakReference(gidVar);
    }

    public static ksa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ksa)) {
            return (ksa) iInterfaceQueryLocalInterface;
        }
        jsa jsaVar = new jsa();
        jsaVar.a = iBinder;
        return jsaVar;
    }

    @Override // defpackage.ksa
    public final void F(Bundle bundle, int i, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(gjg.d, z);
        bundle2.putBoolean(gjg.e, true);
        l0(i, bundle, bundle2);
    }

    public final void R0(kid kidVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            gid gidVar = (gid) this.a.get();
            if (gidVar != null) {
                tym.S(gidVar.a.f, new zr9(gidVar, kidVar, (byte) 26));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final int S0() {
        m4j m4jVar;
        gid gidVar = (gid) this.a.get();
        if (gidVar == null || (m4jVar = gidVar.n) == null) {
            return -1;
        }
        return m4jVar.a.c;
    }

    public final void T0(int i, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            gid gidVar = (gid) this.a.get();
            if (gidVar != null) {
                gidVar.b.n(i, obj);
                gidVar.a.u0(new br(gidVar, i, (byte) 16));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.ksa
    public final void V(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            T0(i, e4j.a(bundle));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.ksa
    public final void b(int i) {
        R0(new uac((byte) 25));
    }

    @Override // defpackage.ksa
    public final void c(int i, int i2, int i3) {
        R0(new gi8(i2, i3, (byte) 2));
    }

    @Override // defpackage.ksa
    public final void f() {
        R0(new uac((byte) 26));
    }

    @Override // defpackage.ksa
    public final void g0(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            R0(new jid(cig.b(bundle)));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // defpackage.ksa
    public final void h0(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            R0(new yzb(c4j.b(bundle), (byte) 22));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // defpackage.ksa
    public final void j(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            R0(new yzb(nm5.a(bundle), (byte) 21));
        } catch (RuntimeException e) {
            w7d.L("Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            f();
        }
    }

    @Override // defpackage.ksa
    public final void j0(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            w7d.K("Ignoring custom command with null args.");
            return;
        }
        try {
            R0(new gz3(i, n3j.a(bundle), bundle2));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.ksa
    public final void l0(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int iS0 = S0();
            if (iS0 != -1) {
                try {
                    R0(new z0c(ijg.p(iS0, bundle), new gjg(bundle2.getBoolean(gjg.d, false), bundle2.getBoolean(gjg.e, false)), (byte) 11));
                } catch (RuntimeException e) {
                    w7d.L("Ignoring malformed Bundle for BundlingExclusions", e);
                }
            }
        } catch (RuntimeException e2) {
            w7d.L("Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        String str;
        final byte b = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i == 4001) {
            parcel.readInt();
            String string = parcel.readString();
            i3 = parcel.readInt();
            Bundle bundle = (Bundle) uup.D(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string)) {
                w7d.K("onChildrenChanged(): Ignoring empty parentId");
            } else if (i3 < 0) {
                str = "onChildrenChanged(): Ignoring negative itemCount: ";
                vep.y(i3, str);
            } else if (bundle != null) {
                try {
                    sjd.a(bundle);
                    R0(new uac((byte) 27));
                } catch (RuntimeException e) {
                    w7d.L("Ignoring malformed Bundle for LibraryParams", e);
                }
            } else {
                R0(new uac((byte) 27));
            }
        } else if (i != 4002) {
            final byte b2 = 0;
            switch (i) {
                case 3001:
                    j(parcel.readInt(), (Bundle) uup.D(parcel, Bundle.CREATOR));
                    return true;
                case 3002:
                    V(parcel.readInt(), (Bundle) uup.D(parcel, Bundle.CREATOR));
                    return true;
                case 3003:
                    z(parcel.readInt(), (Bundle) uup.D(parcel, Bundle.CREATOR));
                    return true;
                case 3004:
                    final int i4 = parcel.readInt();
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                    if (arrayListCreateTypedArrayList != null) {
                        try {
                            int iS0 = S0();
                            if (iS0 != -1) {
                                z0b z0bVarP = h1b.p();
                                while (b2 < arrayListCreateTypedArrayList.size()) {
                                    Bundle bundle2 = (Bundle) arrayListCreateTypedArrayList.get(b2);
                                    bundle2.getClass();
                                    z0bVarP.c(vb5.g(iS0, bundle2));
                                    b2++;
                                }
                                final csh cshVarG = z0bVarP.g();
                                R0(new kid() { // from class: iid
                                    public final void f(gid gidVar) {
                                        byte b3 = b;
                                        m97 m97Var = m97.a;
                                        byte b4 = 6;
                                        csh cshVar = cshVarG;
                                        int i5 = i4;
                                        switch (b3) {
                                            case 0:
                                                if (gidVar.r()) {
                                                    csh cshVar2 = gidVar.t;
                                                    csh cshVar3 = gidVar.u;
                                                    gidVar.s = h1b.s(cshVar);
                                                    csh cshVarH = gid.H(cshVar, gidVar.r, gidVar.v, gidVar.y, gidVar.I);
                                                    gidVar.t = cshVarH;
                                                    gidVar.u = gid.G(cshVarH, gidVar.r, gidVar.I, gidVar.v, gidVar.y);
                                                    gidVar.t.equals(cshVar2);
                                                    gidVar.u.equals(cshVar3);
                                                    ghd ghdVar = gidVar.a;
                                                    ghdVar.getClass();
                                                    z4o.H(Looper.myLooper() == ghdVar.f.getLooper());
                                                    ghdVar.e.getClass();
                                                    r0b r0bVarC = yr9.c(new e4j(-6));
                                                    r0bVarC.addListener(new d50(gidVar, r0bVarC, i5, b4), m97Var);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (gidVar.r()) {
                                                    csh cshVar4 = gidVar.t;
                                                    csh cshVar5 = gidVar.u;
                                                    gidVar.r = h1b.s(cshVar);
                                                    csh cshVarH2 = gid.H(gidVar.s, cshVar, gidVar.v, gidVar.y, gidVar.I);
                                                    gidVar.t = cshVarH2;
                                                    gidVar.u = gid.G(cshVarH2, cshVar, gidVar.I, gidVar.v, gidVar.y);
                                                    gidVar.t.equals(cshVar4);
                                                    gidVar.u.equals(cshVar5);
                                                    ghd ghdVar2 = gidVar.a;
                                                    ghdVar2.getClass();
                                                    z4o.H(Looper.myLooper() == ghdVar2.f.getLooper());
                                                    ghdVar2.e.getClass();
                                                    r0b r0bVarC2 = yr9.c(new e4j(-6));
                                                    r0bVarC2.addListener(new d50(gidVar, r0bVarC2, i5, b4), m97Var);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } catch (RuntimeException e2) {
                            w7d.L("Ignoring malformed Bundle for CommandButton", e2);
                            break;
                        }
                    }
                    break;
                case 3005:
                    int i5 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    j0(i5, (Bundle) uup.D(parcel, creator), (Bundle) uup.D(parcel, creator));
                    return true;
                case 3006:
                    parcel.readInt();
                    f();
                    return true;
                case 3007:
                    F((Bundle) uup.D(parcel, Bundle.CREATOR), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3008:
                    h0(parcel.readInt(), (Bundle) uup.D(parcel, Bundle.CREATOR));
                    return true;
                case 3009:
                    g0(parcel.readInt(), (Bundle) uup.D(parcel, Bundle.CREATOR));
                    return true;
                case 3010:
                    parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle3 = (Bundle) uup.D(parcel, creator2);
                    Bundle bundle4 = (Bundle) uup.D(parcel, creator2);
                    if (bundle3 != null && bundle4 != null) {
                        try {
                            try {
                                R0(new z0c(o3j.a(bundle3), cig.b(bundle4), (byte) 12));
                                break;
                            } catch (RuntimeException e3) {
                                w7d.L("Ignoring malformed Bundle for Commands", e3);
                                break;
                            }
                        } catch (RuntimeException e4) {
                            w7d.L("Ignoring malformed Bundle for SessionCommands", e4);
                            break;
                        }
                    }
                    break;
                case 3011:
                    b(parcel.readInt());
                    return true;
                case 3012:
                    parcel.readInt();
                    Bundle bundle5 = (Bundle) uup.D(parcel, Bundle.CREATOR);
                    if (bundle5 == null) {
                        w7d.K("Ignoring null Bundle for extras");
                        return true;
                    }
                    R0(new yzb(bundle5, (byte) 24));
                    return true;
                case 3013:
                    int i6 = parcel.readInt();
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    l0(i6, (Bundle) uup.D(parcel, creator3), (Bundle) uup.D(parcel, creator3));
                    return true;
                case 3014:
                    R0(new yzb(parcel.readInt(), (PendingIntent) uup.D(parcel, PendingIntent.CREATOR)));
                    return true;
                case 3015:
                    try {
                        R0(new uac(parcel.readInt(), a4j.a((Bundle) uup.D(parcel, Bundle.CREATOR))));
                        break;
                    } catch (RuntimeException e5) {
                        w7d.L("Ignoring malformed Bundle for SessionError", e5);
                        break;
                    }
                case 3016:
                    final int i7 = parcel.readInt();
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Bundle.CREATOR);
                    if (arrayListCreateTypedArrayList2 != null) {
                        try {
                            int iS02 = S0();
                            if (iS02 != -1) {
                                z0b z0bVarP2 = h1b.p();
                                for (int i8 = 0; i8 < arrayListCreateTypedArrayList2.size(); i8++) {
                                    Bundle bundle6 = (Bundle) arrayListCreateTypedArrayList2.get(i8);
                                    bundle6.getClass();
                                    z0bVarP2.c(vb5.g(iS02, bundle6));
                                }
                                final csh cshVarG2 = z0bVarP2.g();
                                R0(new kid() { // from class: iid
                                    public final void f(gid gidVar) {
                                        byte b3 = b2;
                                        m97 m97Var = m97.a;
                                        byte b4 = 6;
                                        csh cshVar = cshVarG2;
                                        int i52 = i7;
                                        switch (b3) {
                                            case 0:
                                                if (gidVar.r()) {
                                                    csh cshVar2 = gidVar.t;
                                                    csh cshVar3 = gidVar.u;
                                                    gidVar.s = h1b.s(cshVar);
                                                    csh cshVarH = gid.H(cshVar, gidVar.r, gidVar.v, gidVar.y, gidVar.I);
                                                    gidVar.t = cshVarH;
                                                    gidVar.u = gid.G(cshVarH, gidVar.r, gidVar.I, gidVar.v, gidVar.y);
                                                    gidVar.t.equals(cshVar2);
                                                    gidVar.u.equals(cshVar3);
                                                    ghd ghdVar = gidVar.a;
                                                    ghdVar.getClass();
                                                    z4o.H(Looper.myLooper() == ghdVar.f.getLooper());
                                                    ghdVar.e.getClass();
                                                    r0b r0bVarC = yr9.c(new e4j(-6));
                                                    r0bVarC.addListener(new d50(gidVar, r0bVarC, i52, b4), m97Var);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (gidVar.r()) {
                                                    csh cshVar4 = gidVar.t;
                                                    csh cshVar5 = gidVar.u;
                                                    gidVar.r = h1b.s(cshVar);
                                                    csh cshVarH2 = gid.H(gidVar.s, cshVar, gidVar.v, gidVar.y, gidVar.I);
                                                    gidVar.t = cshVarH2;
                                                    gidVar.u = gid.G(cshVarH2, cshVar, gidVar.I, gidVar.v, gidVar.y);
                                                    gidVar.t.equals(cshVar4);
                                                    gidVar.u.equals(cshVar5);
                                                    ghd ghdVar2 = gidVar.a;
                                                    ghdVar2.getClass();
                                                    z4o.H(Looper.myLooper() == ghdVar2.f.getLooper());
                                                    ghdVar2.e.getClass();
                                                    r0b r0bVarC2 = yr9.c(new e4j(-6));
                                                    r0bVarC2.addListener(new d50(gidVar, r0bVarC2, i52, b4), m97Var);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } catch (RuntimeException e6) {
                            w7d.L("Ignoring malformed Bundle for CommandButton", e6);
                            break;
                        }
                    }
                    break;
                case 3017:
                    int i9 = parcel.readInt();
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    Bundle bundle7 = (Bundle) uup.D(parcel, creator4);
                    Bundle bundle8 = (Bundle) uup.D(parcel, creator4);
                    Bundle bundle9 = (Bundle) uup.D(parcel, creator4);
                    if (bundle7 != null && bundle8 != null) {
                        try {
                            R0(new gz3(i9, n3j.a(bundle7), bundle8, bundle9));
                            break;
                        } catch (RuntimeException e7) {
                            w7d.L("Ignoring malformed Bundle for SessionCommand", e7);
                            break;
                        }
                    } else {
                        w7d.K("Ignoring custom command progress update with null args.");
                        break;
                    }
                case 3018:
                    c(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel.readInt();
            String string2 = parcel.readString();
            i3 = parcel.readInt();
            Bundle bundle10 = (Bundle) uup.D(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string2)) {
                w7d.K("onSearchResultChanged(): Ignoring empty query");
            } else if (i3 < 0) {
                str = "onSearchResultChanged(): Ignoring negative itemCount: ";
                vep.y(i3, str);
            } else if (bundle10 != null) {
                try {
                    sjd.a(bundle10);
                    R0(new uac((byte) 27));
                } catch (RuntimeException e8) {
                    w7d.L("Ignoring malformed Bundle for LibraryParams", e8);
                }
            } else {
                R0(new uac((byte) 27));
            }
        }
        return true;
    }

    @Override // defpackage.ksa
    public final void z(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            T0(i, xbc.a(bundle));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for LibraryResult", e);
        }
    }
}
