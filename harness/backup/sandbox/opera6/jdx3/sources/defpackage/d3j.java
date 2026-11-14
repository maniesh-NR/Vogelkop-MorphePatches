package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.leanplum.utils.SizeUtil;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d3j implements ffd {
    public final SparseArray a;
    public final SparseArray b;

    public d3j(SparseArray sparseArray, SparseArray sparseArray2) {
        this.a = sparseArray;
        this.b = sparseArray2;
    }

    public final ArrayList a(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            String str = (String) this.a.get(i);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final qsh b(int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = 8;
                break;
            case 2:
                i2 = 11;
                break;
            case 3:
                i2 = 20;
                break;
            case 4:
                i2 = 25;
                break;
            case 5:
                i2 = 38;
                break;
            case 6:
                i2 = 54;
                break;
            default:
                throw null;
        }
        b3j b3jVar = (b3j) this.b.get(i2);
        if (b3jVar == null) {
            return null;
        }
        return new qsh(b3jVar.b, a(b3jVar.c));
    }

    public final c3j c(int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = 15;
                break;
            case 2:
                i2 = 16;
                break;
            case 3:
                i2 = 24;
                break;
            case 4:
                i2 = 35;
                break;
            case 5:
                i2 = 42;
                break;
            case 6:
                i2 = 45;
                break;
            case 7:
                i2 = 49;
                break;
            case 8:
                i2 = 53;
                break;
            default:
                throw null;
        }
        b3j b3jVar = (b3j) this.b.get(i2);
        if (b3jVar == null) {
            return null;
        }
        String str = b3jVar.a;
        if (str.isEmpty()) {
            return null;
        }
        Uri uri = Uri.parse(str);
        if (uri.getHost() == null || uri.getScheme() == null) {
            return null;
        }
        return new c3j(uri, b3jVar.b, a(b3jVar.c));
    }

    public final c3j d(int i, boolean z) {
        int i2;
        switch (i) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
            case 8:
                i2 = 9;
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                i2 = 10;
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                i2 = 12;
                break;
            case 11:
                i2 = 13;
                break;
            case 12:
                i2 = 14;
                break;
            case 13:
                i2 = 17;
                break;
            case 14:
                i2 = 18;
                break;
            case 15:
                i2 = 19;
                break;
            case 16:
                i2 = 21;
                break;
            case 17:
                i2 = 22;
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                i2 = 23;
                break;
            case 19:
                i2 = 26;
                break;
            case SizeUtil.textSize0 /* 20 */:
                i2 = 27;
                break;
            case 21:
                i2 = 28;
                break;
            case SizeUtil.textSize1 /* 22 */:
                i2 = 29;
                break;
            case 23:
                i2 = 30;
                break;
            case SizeUtil.textSize2 /* 24 */:
                i2 = 31;
                break;
            case 25:
                i2 = 32;
                break;
            case 26:
                i2 = 33;
                break;
            case 27:
                i2 = 34;
                break;
            case 28:
                i2 = 36;
                break;
            case 29:
                i2 = 37;
                break;
            case 30:
                i2 = 39;
                break;
            case 31:
                i2 = 41;
                break;
            case 32:
                i2 = 43;
                break;
            case 33:
                i2 = 44;
                break;
            case 34:
                i2 = 46;
                break;
            case 35:
                i2 = 47;
                break;
            case 36:
                i2 = 48;
                break;
            case 37:
                i2 = 50;
                break;
            case 38:
                i2 = 51;
                break;
            case 39:
                i2 = 55;
                break;
            case 40:
                i2 = 56;
                break;
            case 41:
                i2 = 57;
                break;
            case 42:
                i2 = 58;
                break;
            case 43:
                i2 = 59;
                break;
            case 44:
                i2 = 60;
                break;
            case 45:
                i2 = 61;
                break;
            default:
                throw null;
        }
        b3j b3jVar = (b3j) this.b.get(i2);
        if (b3jVar != null) {
            int[] iArr = b3jVar.c;
            String str = b3jVar.b;
            String str2 = b3jVar.a;
            String str3 = "";
            if (str2.isEmpty()) {
                if (z) {
                    return new c3j(str3, str, a(iArr));
                }
            } else {
                if (str2.indexOf(47) == -1) {
                    return new c3j(str2, str, a(iArr));
                }
                if (z) {
                    return new c3j(str3, str, a(iArr));
                }
            }
        }
        return null;
    }

    @Override // defpackage.ffd
    public final boolean isEmpty() {
        return this.b.size() == 0;
    }
}
