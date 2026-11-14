package defpackage;

import android.content.IntentSender;
import android.graphics.Rect;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.TopToolbarContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mhk implements kgb, vuj, gdb, zzr {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;

    public mhk(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.c = new LinkedList();
                break;
            case 6:
                this.c = new i72();
                break;
            case 7:
                this.c = new HashMap();
                break;
        }
    }

    public mhk(int i, int[] iArr) {
        y0b y0bVar;
        this.a = (byte) 4;
        this.b = i;
        if (iArr != null) {
            y0b y0bVar2 = y0b.c;
            y0bVar = iArr.length == 0 ? y0b.c : new y0b(Arrays.copyOf(iArr, iArr.length));
        } else {
            y0bVar = y0b.c;
        }
        this.c = y0bVar;
    }

    public /* synthetic */ mhk(cf3 cf3Var, int i) {
        this.a = (byte) 8;
        this.c = cf3Var;
        this.b = i;
    }

    public mhk(BrowserActivity browserActivity) {
        this.a = (byte) 5;
        this.c = browserActivity;
        this.b = mdb.b.nextInt() & 65535;
    }

    public mhk(TopToolbarContainer topToolbarContainer) {
        this.a = (byte) 2;
        this.c = topToolbarContainer;
    }

    public mhk(oe4 oe4Var) {
        this.a = (byte) 1;
        this.c = oe4Var;
        this.b = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
    }

    public final int a(pqo pqoVar) {
        List list = (List) ((HashMap) this.c).get(pqoVar.a);
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer num = 0;
            if (((vho) it.next()).a().j == pqoVar.d) {
                num = 1;
            }
            iIntValue += num.intValue();
        }
        return iIntValue;
    }

    public final void b(String str) {
        HashMap map = (HashMap) this.c;
        List list = (List) map.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vho vhoVar = (vho) it.next();
                vhoVar.getClass();
                if (sjo.o() >= vhoVar.c) {
                    it.remove();
                    vhoVar.i = true;
                }
            }
            if (list.isEmpty()) {
                map.remove(str);
            }
        }
    }

    public final vho c(pqo pqoVar) {
        String str = pqoVar.a;
        b(str);
        HashMap map = (HashMap) this.c;
        int i = this.b;
        int i2 = g1p.a;
        if (i > 10) {
            ArrayList arrayList = new ArrayList();
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                List<vho> list = (List) ((Map.Entry) it.next()).getValue();
                if (list != null && !list.isEmpty()) {
                    for (vho vhoVar : list) {
                        if (vhoVar.c()) {
                            arrayList.add(vhoVar);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i3 = g1p.a;
                int i4 = size - 10;
                if (i4 > 0) {
                    Collections.sort(arrayList, new omj((byte) 23));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i5 = 0; i5 < i4; i5++) {
                        arrayList2.add((vho) arrayList.get(i5));
                    }
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        List list2 = (List) ((Map.Entry) it2.next()).getValue();
                        int size2 = arrayList2.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj = arrayList2.get(i6);
                            i6++;
                            vho vhoVar2 = (vho) obj;
                            if (list2 != null && list2.contains(vhoVar2)) {
                                vhoVar2.i = true;
                                list2.remove(vhoVar2);
                                this.b--;
                            }
                        }
                    }
                }
            }
        }
        List list3 = (List) map.get(str);
        if (list3 != null && !list3.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(list3.size());
            for (Object obj2 : list3) {
                if (((vho) obj2).b.isEmpty()) {
                    arrayList3.add(obj2);
                }
            }
            if (!arrayList3.isEmpty()) {
                list3.removeAll(arrayList3);
            }
            ArrayList arrayList4 = new ArrayList(list3.size());
            for (Object obj3 : list3) {
                if (((vho) obj3).a().j == pqoVar.d) {
                    arrayList4.add(obj3);
                }
            }
            if (!arrayList4.isEmpty()) {
                Collections.sort(arrayList4, new omj((byte) 24));
                vhoVar = arrayList4.size() > 0 ? (vho) arrayList4.get(0) : null;
                if (vhoVar != null) {
                    list3.remove(vhoVar);
                }
                if (list3.isEmpty()) {
                    map.remove(str);
                }
                if (vhoVar != null && vhoVar.c()) {
                    this.b--;
                }
                Objects.toString(vhoVar);
            }
        }
        return vhoVar;
    }

    public final void d(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i << 1;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public final mkm e() {
        LinkedList linkedList = (LinkedList) this.c;
        int size = linkedList.size();
        if (size <= 0) {
            return null;
        }
        mkm mkmVar = (mkm) linkedList.remove(size - 1);
        this.b -= mkmVar.b;
        return mkmVar;
    }

    public final void f(char c) {
        d(this.b, 1);
        char[] cArr = (char[]) this.c;
        int i = this.b;
        this.b = i + 1;
        cArr[i] = c;
    }

    public final void g(mkm mkmVar) {
        this.b += mkmVar.b;
        ((LinkedList) this.c).add(mkmVar);
    }

    public final void h(int i, boolean z) {
        int i2;
        int i3 = this.b;
        if (z) {
            i2 = i3 | i;
            this.b = i2;
        } else {
            i2 = i3 & (~i);
            this.b = i2;
        }
        TopToolbarContainer topToolbarContainer = (TopToolbarContainer) this.c;
        boolean z2 = i2 == 0;
        vvl vvlVar = topToolbarContainer.g;
        if (vvlVar == null || z2 == vvlVar.g) {
            return;
        }
        vvlVar.g = z2;
        if (z2) {
            topToolbarContainer.a((Rect) null);
        }
    }

    public final void i(String str) {
        byte b;
        d(this.b, str.length() + 2);
        char[] cArr = (char[]) this.c;
        int i = this.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            String[] strArr = ohk.a;
            if (c <= 31 || c == '\"' || c == '\\') {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    d(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr = ohk.b;
                    if (cCharAt >= bArr.length || (b = bArr[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) this.c)[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str2 = ohk.a[cCharAt];
                            d(i4, str2.length());
                            str2.getChars(0, str2.length(), (char[]) this.c, i4);
                            int length3 = str2.length() + i4;
                            this.b = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = (char[]) this.c;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            this.b = i4;
                        }
                    }
                }
                d(i4, 1);
                ((char[]) this.c)[i4] = '\"';
                this.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        this.b = i3 + 1;
    }

    public final void j(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        d(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public final void q(IntentSender intentSender, int i) {
        ((BrowserActivity) this.c).startIntentSenderForResult(intentSender, i, null, 0, 0, 0, null);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return new String((char[]) this.c, 0, this.b);
            case 4:
                y0b y0bVar = (y0b) this.c;
                int i = y0bVar.b;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(tym.a0(y0bVar.d(i2)));
                }
                return "UnsupportedBrands{major=" + tym.a0(this.b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    public final void writeLong(long j) {
        j(String.valueOf(j));
    }

    public final Object zza(zzp zzpVar) {
        cf3 cf3Var = (cf3) this.c;
        cf3Var.r(new wqp(cf3Var, zzpVar), this.b);
        return "reconnectIfNeeded";
    }
}
