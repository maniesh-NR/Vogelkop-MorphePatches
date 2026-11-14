package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class myh implements hub {
    public static final t59 j = new t59(50);
    public final jl6 b;
    public final hub c;
    public final hub d;
    public final int e;
    public final int f;
    public final Class g;
    public final trf h;
    public final f2m i;

    public myh(jl6 jl6Var, hub hubVar, hub hubVar2, int i, int i2, f2m f2mVar, Class cls, trf trfVar) {
        this.b = jl6Var;
        this.c = hubVar;
        this.d = hubVar2;
        this.e = i;
        this.f = i2;
        this.i = f2mVar;
        this.g = cls;
        this.h = trfVar;
    }

    @Override // defpackage.hub
    public final void b(MessageDigest messageDigest) {
        Object objK;
        jl6 jl6Var = this.b;
        synchronized (jl6Var) {
            v3d v3dVar = (v3d) jl6Var.e;
            sng sngVarH0 = (sng) ((ArrayDeque) ((n1) v3dVar).b).poll();
            if (sngVarH0 == null) {
                sngVarH0 = v3dVar.H0();
            }
            u3d u3dVar = (u3d) sngVarH0;
            u3dVar.b = 8;
            u3dVar.c = byte[].class;
            objK = jl6Var.k(u3dVar, byte[].class);
        }
        byte[] bArr = (byte[]) objK;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        f2m f2mVar = this.i;
        if (f2mVar != null) {
            f2mVar.b(messageDigest);
        }
        this.h.b(messageDigest);
        t59 t59Var = j;
        Class cls = this.g;
        byte[] bytes = (byte[]) t59Var.e(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(hub.a);
            t59Var.j(cls, bytes);
        }
        messageDigest.update(bytes);
        this.b.o(bArr);
    }

    @Override // defpackage.hub
    public final boolean equals(Object obj) {
        if (obj instanceof myh) {
            myh myhVar = (myh) obj;
            if (this.f == myhVar.f && this.e == myhVar.e && rm5.h(this.i, myhVar.i) && this.g.equals(myhVar.g) && this.c.equals(myhVar.c) && this.d.equals(myhVar.d) && this.h.equals(myhVar.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hub
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        f2m f2mVar = this.i;
        if (f2mVar != null) {
            iHashCode = (iHashCode * 31) + f2mVar.hashCode();
        }
        int iHashCode2 = this.g.hashCode();
        return this.h.b.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
