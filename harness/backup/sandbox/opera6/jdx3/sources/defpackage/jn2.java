package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class jn2 {
    public final String a;
    public final Integer b;
    public final r18 c;
    public final long d;
    public final long e;
    public final HashMap f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;
    public final ArrayList k;
    public final String l;

    public jn2(String str, Integer num, r18 r18Var, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2, ArrayList arrayList, String str3) {
        this.a = str;
        this.b = num;
        this.c = r18Var;
        this.d = j;
        this.e = j2;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
        this.k = arrayList;
        this.l = str3;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final ala c() {
        ala alaVar = new ala();
        String str = this.a;
        if (str == null) {
            t3p.q("Null transportName");
            return null;
        }
        alaVar.a = str;
        alaVar.b = this.b;
        alaVar.g = this.g;
        alaVar.h = this.h;
        alaVar.i = this.i;
        alaVar.j = this.j;
        alaVar.k = this.k;
        alaVar.l = this.l;
        r18 r18Var = this.c;
        if (r18Var == null) {
            t3p.q("Null encodedPayload");
            return null;
        }
        alaVar.c = r18Var;
        alaVar.d = Long.valueOf(this.d);
        alaVar.e = Long.valueOf(this.e);
        alaVar.f = new HashMap(this.f);
        return alaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jn2)) {
            return false;
        }
        jn2 jn2Var = (jn2) obj;
        if (!this.a.equals(jn2Var.a)) {
            return false;
        }
        Integer num = jn2Var.b;
        Integer num2 = this.b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.c.equals(jn2Var.c) || this.d != jn2Var.d || this.e != jn2Var.e || !this.f.equals(jn2Var.f)) {
            return false;
        }
        Integer num3 = jn2Var.g;
        Integer num4 = this.g;
        if (num4 == null) {
            if (num3 != null) {
                return false;
            }
        } else if (!num4.equals(num3)) {
            return false;
        }
        String str = jn2Var.h;
        String str2 = this.h;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!Arrays.equals(this.i, jn2Var.i) || !Arrays.equals(this.j, jn2Var.j)) {
            return false;
        }
        ArrayList arrayList = jn2Var.k;
        ArrayList arrayList2 = this.k;
        if (arrayList2 == null) {
            if (arrayList != null) {
                return false;
            }
        } else if (!arrayList2.equals(arrayList)) {
            return false;
        }
        String str3 = jn2Var.l;
        String str4 = this.l;
        return str4 == null ? str3 == null : str4.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        long j2 = this.e;
        int iHashCode3 = (((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        int iHashCode5 = (((((iHashCode4 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j)) * 1000003;
        ArrayList arrayList = this.k;
        int iHashCode6 = (iHashCode5 ^ (arrayList == null ? 0 : arrayList.hashCode())) * 1000003;
        String str2 = this.l;
        return iHashCode6 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventInternal{transportName=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", encodedPayload=");
        sb.append(this.c);
        sb.append(", eventMillis=");
        sb.append(this.d);
        sb.append(", uptimeMillis=");
        sb.append(this.e);
        sb.append(", autoMetadata=");
        sb.append(this.f);
        sb.append(", productId=");
        sb.append(this.g);
        sb.append(", pseudonymousId=");
        sb.append(this.h);
        sb.append(", experimentIdsClear=");
        sb.append(Arrays.toString(this.i));
        sb.append(", experimentIdsEncrypted=");
        sb.append(Arrays.toString(this.j));
        sb.append(", experimentIdsEncryptedList=");
        sb.append(this.k);
        sb.append(", pseudonymousIdUpdateReceiverClassName=");
        return z1m.l(sb, this.l, "}");
    }
}
