package defpackage;

import ads_mobile_sdk.pd;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.ads.AdError;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class so5 {
    public static final int[] c = {0, 4, 8};
    public static final SparseIntArray d;
    public static final SparseIntArray e;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(pd.T0, 6);
        sparseIntArray.append(pd.U0, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(pd.g1, 13);
        sparseIntArray.append(pd.j1, 16);
        sparseIntArray.append(pd.h1, 14);
        sparseIntArray.append(pd.V0, 11);
        sparseIntArray.append(pd.i1, 15);
        sparseIntArray.append(pd.W0, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(pd.l1, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(pd.W0, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(pd.g1, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(pd.h1, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(pd.V0, 83);
        sparseIntArray2.append(pd.K0, 84);
        sparseIntArray2.append(pd.U0, 85);
        sparseIntArray2.append(pd.T0, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] g(Barrier barrier, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = bhh.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.l;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.l.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static no5 h(Context context, AttributeSet attributeSet, boolean z) {
        no5 no5Var = new no5();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? shh.c : shh.a);
        String[] strArr = ic4.d;
        qo5 qo5Var = no5Var.b;
        ro5 ro5Var = no5Var.e;
        po5 po5Var = no5Var.c;
        oo5 oo5Var = no5Var.d;
        int[] iArr = c;
        SparseIntArray sparseIntArray = d;
        int i = 3;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            mo5 mo5Var = new mo5();
            mo5Var.a = new int[10];
            mo5Var.b = new int[10];
            mo5Var.c = 0;
            mo5Var.d = new int[10];
            mo5Var.e = new float[10];
            mo5Var.f = 0;
            mo5Var.g = new int[5];
            mo5Var.h = new String[5];
            mo5Var.i = 0;
            mo5Var.j = new int[4];
            mo5Var.k = new boolean[4];
            mo5Var.l = 0;
            int i2 = 0;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (e.get(index)) {
                    case 2:
                        mo5Var.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case pd.N0 /* 92 */:
                    default:
                        sparseIntArray.get(index);
                        break;
                    case 5:
                        mo5Var.c(5, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        mo5Var.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oo5Var.C));
                        break;
                    case 7:
                        mo5Var.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oo5Var.D));
                        break;
                    case 8:
                        mo5Var.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.J));
                        break;
                    case 11:
                        mo5Var.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.P));
                        break;
                    case 12:
                        mo5Var.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.Q));
                        break;
                    case 13:
                        mo5Var.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.M));
                        break;
                    case 14:
                        mo5Var.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.O));
                        break;
                    case 15:
                        mo5Var.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.R));
                        break;
                    case 16:
                        mo5Var.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.N));
                        break;
                    case 17:
                        mo5Var.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oo5Var.d));
                        break;
                    case 18:
                        mo5Var.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oo5Var.e));
                        break;
                    case 19:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, oo5Var.f), 19);
                        break;
                    case 20:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, oo5Var.w), 20);
                        break;
                    case 21:
                        mo5Var.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, oo5Var.c));
                        break;
                    case 22:
                        mo5Var.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, qo5Var.a)]);
                        break;
                    case 23:
                        mo5Var.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, oo5Var.b));
                        break;
                    case 24:
                        mo5Var.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.F));
                        break;
                    case 27:
                        mo5Var.b(27, typedArrayObtainStyledAttributes.getInt(index, oo5Var.E));
                        break;
                    case 28:
                        mo5Var.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.G));
                        break;
                    case 31:
                        mo5Var.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.K));
                        break;
                    case 34:
                        mo5Var.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.H));
                        break;
                    case 37:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, oo5Var.x), 37);
                        break;
                    case 38:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, no5Var.a);
                        no5Var.a = resourceId;
                        mo5Var.b(38, resourceId);
                        break;
                    case 39:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, oo5Var.U), 39);
                        break;
                    case 40:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, oo5Var.T), 40);
                        break;
                    case 41:
                        mo5Var.b(41, typedArrayObtainStyledAttributes.getInt(index, oo5Var.V));
                        break;
                    case 42:
                        mo5Var.b(42, typedArrayObtainStyledAttributes.getInt(index, oo5Var.W));
                        break;
                    case 43:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, qo5Var.c), 43);
                        break;
                    case 44:
                        mo5Var.d(44, true);
                        mo5Var.a(typedArrayObtainStyledAttributes.getDimension(index, ro5Var.m), 44);
                        break;
                    case 45:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, ro5Var.b), 45);
                        break;
                    case 46:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, ro5Var.c), 46);
                        break;
                    case 47:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, ro5Var.d), 47);
                        break;
                    case 48:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, ro5Var.e), 48);
                        break;
                    case 49:
                        mo5Var.a(typedArrayObtainStyledAttributes.getDimension(index, ro5Var.f), 49);
                        break;
                    case 50:
                        mo5Var.a(typedArrayObtainStyledAttributes.getDimension(index, ro5Var.g), 50);
                        break;
                    case 51:
                        mo5Var.a(typedArrayObtainStyledAttributes.getDimension(index, ro5Var.i), 51);
                        break;
                    case 52:
                        mo5Var.a(typedArrayObtainStyledAttributes.getDimension(index, ro5Var.j), 52);
                        break;
                    case 53:
                        mo5Var.a(typedArrayObtainStyledAttributes.getDimension(index, ro5Var.k), 53);
                        break;
                    case 54:
                        mo5Var.b(54, typedArrayObtainStyledAttributes.getInt(index, oo5Var.X));
                        break;
                    case 55:
                        mo5Var.b(55, typedArrayObtainStyledAttributes.getInt(index, oo5Var.Y));
                        break;
                    case 56:
                        mo5Var.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.Z));
                        break;
                    case 57:
                        mo5Var.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.a0));
                        break;
                    case 58:
                        mo5Var.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.b0));
                        break;
                    case 59:
                        mo5Var.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.c0));
                        break;
                    case 60:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, ro5Var.a), 60);
                        break;
                    case 62:
                        mo5Var.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.A));
                        break;
                    case 63:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, oo5Var.B), 63);
                        break;
                    case 64:
                        mo5Var.b(64, k(typedArrayObtainStyledAttributes, index, po5Var.a));
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            mo5Var.c(65, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        } else {
                            mo5Var.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        mo5Var.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, po5Var.e), 67);
                        break;
                    case 68:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, qo5Var.d), 68);
                        break;
                    case 69:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        break;
                    case 72:
                        mo5Var.b(72, typedArrayObtainStyledAttributes.getInt(index, oo5Var.f0));
                        break;
                    case 73:
                        mo5Var.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.g0));
                        break;
                    case 74:
                        mo5Var.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        mo5Var.d(75, typedArrayObtainStyledAttributes.getBoolean(index, oo5Var.n0));
                        break;
                    case 76:
                        mo5Var.b(76, typedArrayObtainStyledAttributes.getInt(index, po5Var.c));
                        break;
                    case 77:
                        mo5Var.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        mo5Var.b(78, typedArrayObtainStyledAttributes.getInt(index, qo5Var.b));
                        break;
                    case 79:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, po5Var.d), 79);
                        break;
                    case 80:
                        mo5Var.d(80, typedArrayObtainStyledAttributes.getBoolean(index, oo5Var.l0));
                        break;
                    case 81:
                        mo5Var.d(81, typedArrayObtainStyledAttributes.getBoolean(index, oo5Var.m0));
                        break;
                    case 82:
                        mo5Var.b(82, typedArrayObtainStyledAttributes.getInteger(index, po5Var.b));
                        break;
                    case 83:
                        mo5Var.b(83, k(typedArrayObtainStyledAttributes, index, ro5Var.h));
                        break;
                    case 84:
                        mo5Var.b(84, typedArrayObtainStyledAttributes.getInteger(index, po5Var.g));
                        break;
                    case 85:
                        mo5Var.a(typedArrayObtainStyledAttributes.getFloat(index, po5Var.f), 85);
                        break;
                    case 86:
                        int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            po5Var.i = resourceId2;
                            mo5Var.b(89, resourceId2);
                            if (po5Var.i != -1) {
                                mo5Var.b(88, -2);
                                break;
                            } else {
                                break;
                            }
                        } else if (i3 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            po5Var.h = string;
                            mo5Var.c(90, string);
                            if (po5Var.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                po5Var.i = resourceId3;
                                mo5Var.b(89, resourceId3);
                                mo5Var.b(88, -2);
                                break;
                            } else {
                                mo5Var.b(88, -1);
                                break;
                            }
                        } else {
                            mo5Var.b(88, typedArrayObtainStyledAttributes.getInteger(index, po5Var.i));
                            break;
                        }
                    case 87:
                        sparseIntArray.get(index);
                        break;
                    case pd.O0 /* 93 */:
                        mo5Var.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.L));
                        break;
                    case pd.P0 /* 94 */:
                        mo5Var.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oo5Var.S));
                        break;
                    case pd.p0 /* 95 */:
                        l(mo5Var, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case pd.A0 /* 96 */:
                        l(mo5Var, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case pd.H0 /* 97 */:
                        mo5Var.b(97, typedArrayObtainStyledAttributes.getInt(index, oo5Var.o0));
                        break;
                    case pd.Q0 /* 98 */:
                        int i4 = eae.p;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == i) {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            no5Var.a = typedArrayObtainStyledAttributes.getResourceId(index, no5Var.a);
                            break;
                        }
                    case pd.R0 /* 99 */:
                        mo5Var.d(99, typedArrayObtainStyledAttributes.getBoolean(index, oo5Var.g));
                        break;
                }
                i2++;
                i = 3;
            }
        } else {
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount2; i5++) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i5);
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        oo5Var.p = k(typedArrayObtainStyledAttributes, index2, oo5Var.p);
                        break;
                    case 2:
                        oo5Var.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.I);
                        break;
                    case 3:
                        oo5Var.o = k(typedArrayObtainStyledAttributes, index2, oo5Var.o);
                        break;
                    case 4:
                        oo5Var.n = k(typedArrayObtainStyledAttributes, index2, oo5Var.n);
                        break;
                    case 5:
                        oo5Var.y = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        oo5Var.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, oo5Var.C);
                        break;
                    case 7:
                        oo5Var.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, oo5Var.D);
                        break;
                    case 8:
                        oo5Var.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.J);
                        break;
                    case 9:
                        oo5Var.v = k(typedArrayObtainStyledAttributes, index2, oo5Var.v);
                        break;
                    case 10:
                        oo5Var.u = k(typedArrayObtainStyledAttributes, index2, oo5Var.u);
                        break;
                    case 11:
                        oo5Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.P);
                        break;
                    case 12:
                        oo5Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.Q);
                        break;
                    case 13:
                        oo5Var.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.M);
                        break;
                    case 14:
                        oo5Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.O);
                        break;
                    case 15:
                        oo5Var.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.R);
                        break;
                    case 16:
                        oo5Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.N);
                        break;
                    case 17:
                        oo5Var.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, oo5Var.d);
                        break;
                    case 18:
                        oo5Var.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, oo5Var.e);
                        break;
                    case 19:
                        oo5Var.f = typedArrayObtainStyledAttributes.getFloat(index2, oo5Var.f);
                        break;
                    case 20:
                        oo5Var.w = typedArrayObtainStyledAttributes.getFloat(index2, oo5Var.w);
                        break;
                    case 21:
                        oo5Var.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, oo5Var.c);
                        break;
                    case 22:
                        int i6 = typedArrayObtainStyledAttributes.getInt(index2, qo5Var.a);
                        qo5Var.a = i6;
                        qo5Var.a = iArr[i6];
                        break;
                    case 23:
                        oo5Var.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, oo5Var.b);
                        break;
                    case 24:
                        oo5Var.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.F);
                        break;
                    case 25:
                        oo5Var.h = k(typedArrayObtainStyledAttributes, index2, oo5Var.h);
                        break;
                    case 26:
                        oo5Var.i = k(typedArrayObtainStyledAttributes, index2, oo5Var.i);
                        break;
                    case 27:
                        oo5Var.E = typedArrayObtainStyledAttributes.getInt(index2, oo5Var.E);
                        break;
                    case 28:
                        oo5Var.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.G);
                        break;
                    case 29:
                        oo5Var.j = k(typedArrayObtainStyledAttributes, index2, oo5Var.j);
                        break;
                    case 30:
                        oo5Var.k = k(typedArrayObtainStyledAttributes, index2, oo5Var.k);
                        break;
                    case 31:
                        oo5Var.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.K);
                        break;
                    case 32:
                        oo5Var.s = k(typedArrayObtainStyledAttributes, index2, oo5Var.s);
                        break;
                    case 33:
                        oo5Var.t = k(typedArrayObtainStyledAttributes, index2, oo5Var.t);
                        break;
                    case 34:
                        oo5Var.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.H);
                        break;
                    case 35:
                        oo5Var.m = k(typedArrayObtainStyledAttributes, index2, oo5Var.m);
                        break;
                    case 36:
                        oo5Var.l = k(typedArrayObtainStyledAttributes, index2, oo5Var.l);
                        break;
                    case 37:
                        oo5Var.x = typedArrayObtainStyledAttributes.getFloat(index2, oo5Var.x);
                        break;
                    case 38:
                        no5Var.a = typedArrayObtainStyledAttributes.getResourceId(index2, no5Var.a);
                        break;
                    case 39:
                        oo5Var.U = typedArrayObtainStyledAttributes.getFloat(index2, oo5Var.U);
                        break;
                    case 40:
                        oo5Var.T = typedArrayObtainStyledAttributes.getFloat(index2, oo5Var.T);
                        break;
                    case 41:
                        oo5Var.V = typedArrayObtainStyledAttributes.getInt(index2, oo5Var.V);
                        break;
                    case 42:
                        oo5Var.W = typedArrayObtainStyledAttributes.getInt(index2, oo5Var.W);
                        break;
                    case 43:
                        qo5Var.c = typedArrayObtainStyledAttributes.getFloat(index2, qo5Var.c);
                        break;
                    case 44:
                        ro5Var.l = true;
                        ro5Var.m = typedArrayObtainStyledAttributes.getDimension(index2, ro5Var.m);
                        break;
                    case 45:
                        ro5Var.b = typedArrayObtainStyledAttributes.getFloat(index2, ro5Var.b);
                        break;
                    case 46:
                        ro5Var.c = typedArrayObtainStyledAttributes.getFloat(index2, ro5Var.c);
                        break;
                    case 47:
                        ro5Var.d = typedArrayObtainStyledAttributes.getFloat(index2, ro5Var.d);
                        break;
                    case 48:
                        ro5Var.e = typedArrayObtainStyledAttributes.getFloat(index2, ro5Var.e);
                        break;
                    case 49:
                        ro5Var.f = typedArrayObtainStyledAttributes.getDimension(index2, ro5Var.f);
                        break;
                    case 50:
                        ro5Var.g = typedArrayObtainStyledAttributes.getDimension(index2, ro5Var.g);
                        break;
                    case 51:
                        ro5Var.i = typedArrayObtainStyledAttributes.getDimension(index2, ro5Var.i);
                        break;
                    case 52:
                        ro5Var.j = typedArrayObtainStyledAttributes.getDimension(index2, ro5Var.j);
                        break;
                    case 53:
                        ro5Var.k = typedArrayObtainStyledAttributes.getDimension(index2, ro5Var.k);
                        break;
                    case 54:
                        oo5Var.X = typedArrayObtainStyledAttributes.getInt(index2, oo5Var.X);
                        break;
                    case 55:
                        oo5Var.Y = typedArrayObtainStyledAttributes.getInt(index2, oo5Var.Y);
                        break;
                    case 56:
                        oo5Var.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.Z);
                        break;
                    case 57:
                        oo5Var.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.a0);
                        break;
                    case 58:
                        oo5Var.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.b0);
                        break;
                    case 59:
                        oo5Var.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.c0);
                        break;
                    case 60:
                        ro5Var.a = typedArrayObtainStyledAttributes.getFloat(index2, ro5Var.a);
                        break;
                    case 61:
                        oo5Var.z = k(typedArrayObtainStyledAttributes, index2, oo5Var.z);
                        break;
                    case 62:
                        oo5Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.A);
                        break;
                    case 63:
                        oo5Var.B = typedArrayObtainStyledAttributes.getFloat(index2, oo5Var.B);
                        break;
                    case 64:
                        po5Var.a = k(typedArrayObtainStyledAttributes, index2, po5Var.a);
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            break;
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        }
                    case 66:
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        break;
                    case 67:
                        po5Var.e = typedArrayObtainStyledAttributes.getFloat(index2, po5Var.e);
                        break;
                    case 68:
                        qo5Var.d = typedArrayObtainStyledAttributes.getFloat(index2, qo5Var.d);
                        break;
                    case 69:
                        oo5Var.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        oo5Var.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        break;
                    case 72:
                        oo5Var.f0 = typedArrayObtainStyledAttributes.getInt(index2, oo5Var.f0);
                        break;
                    case 73:
                        oo5Var.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.g0);
                        break;
                    case 74:
                        oo5Var.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        oo5Var.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, oo5Var.n0);
                        break;
                    case 76:
                        po5Var.c = typedArrayObtainStyledAttributes.getInt(index2, po5Var.c);
                        break;
                    case 77:
                        oo5Var.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        qo5Var.b = typedArrayObtainStyledAttributes.getInt(index2, qo5Var.b);
                        break;
                    case 79:
                        po5Var.d = typedArrayObtainStyledAttributes.getFloat(index2, po5Var.d);
                        break;
                    case 80:
                        oo5Var.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, oo5Var.l0);
                        break;
                    case 81:
                        oo5Var.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, oo5Var.m0);
                        break;
                    case 82:
                        po5Var.b = typedArrayObtainStyledAttributes.getInteger(index2, po5Var.b);
                        break;
                    case 83:
                        ro5Var.h = k(typedArrayObtainStyledAttributes, index2, ro5Var.h);
                        break;
                    case 84:
                        po5Var.g = typedArrayObtainStyledAttributes.getInteger(index2, po5Var.g);
                        break;
                    case 85:
                        po5Var.f = typedArrayObtainStyledAttributes.getFloat(index2, po5Var.f);
                        break;
                    case 86:
                        int i7 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i7 == 1) {
                            po5Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i7 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            po5Var.h = string2;
                            if (string2.indexOf("/") > 0) {
                                po5Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, po5Var.i);
                            break;
                        }
                    case 87:
                        sparseIntArray.get(index2);
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        sparseIntArray.get(index2);
                        break;
                    case 91:
                        oo5Var.q = k(typedArrayObtainStyledAttributes, index2, oo5Var.q);
                        break;
                    case pd.N0 /* 92 */:
                        oo5Var.r = k(typedArrayObtainStyledAttributes, index2, oo5Var.r);
                        break;
                    case pd.O0 /* 93 */:
                        oo5Var.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.L);
                        break;
                    case pd.P0 /* 94 */:
                        oo5Var.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, oo5Var.S);
                        break;
                    case pd.p0 /* 95 */:
                        l(oo5Var, typedArrayObtainStyledAttributes, index2, 0);
                        break;
                    case pd.A0 /* 96 */:
                        l(oo5Var, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case pd.H0 /* 97 */:
                        oo5Var.o0 = typedArrayObtainStyledAttributes.getInt(index2, oo5Var.o0);
                        break;
                }
            }
            if (oo5Var.j0 != null) {
                oo5Var.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return no5Var;
    }

    public static int k(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so5.l(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void m(jo5 jo5Var, String str) throws NumberFormatException {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    strSubstring.equalsIgnoreCase("H");
                }
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        Float.parseFloat(strSubstring3);
                        Float.parseFloat(strSubstring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        jo5Var.G = str;
    }

    public static String o(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    public final void a(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(constraintLayout);
        constraintLayout.j = null;
        constraintLayout.requestLayout();
    }

    public final void b(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.b;
        HashSet hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (id == -1) {
                    h9o.r("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    no5 no5Var = (no5) map.get(Integer.valueOf(id));
                    if (no5Var != null) {
                        qo5 qo5Var = no5Var.b;
                        oo5 oo5Var = no5Var.d;
                        ro5 ro5Var = no5Var.e;
                        if (childAt instanceof Barrier) {
                            oo5Var.h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.h = oo5Var.f0;
                            int i2 = oo5Var.g0;
                            u33 u33Var = barrier.i;
                            u33Var.t0 = i2;
                            u33Var.s0 = oo5Var.n0;
                            int[] iArr = oo5Var.i0;
                            if (iArr != null) {
                                barrier.m(iArr);
                            } else {
                                String str = oo5Var.j0;
                                if (str != null) {
                                    int[] iArrG = g(barrier, str);
                                    oo5Var.i0 = iArrG;
                                    barrier.m(iArrG);
                                }
                            }
                        }
                        jo5 jo5Var = (jo5) childAt.getLayoutParams();
                        jo5Var.a();
                        no5Var.a(jo5Var);
                        HashMap map2 = no5Var.f;
                        Class<?> cls = childAt.getClass();
                        for (String strJ : map2.keySet()) {
                            fo5 fo5Var = (fo5) map2.get(strJ);
                            if (!fo5Var.a) {
                                strJ = sko.j("set", strJ);
                            }
                            try {
                                int iA = vep.A(fo5Var.b);
                                Class cls2 = Float.TYPE;
                                Class cls3 = Integer.TYPE;
                                switch (iA) {
                                    case 0:
                                        cls.getMethod(strJ, cls3).invoke(childAt, Integer.valueOf(fo5Var.c));
                                        break;
                                    case 1:
                                        cls.getMethod(strJ, cls2).invoke(childAt, Float.valueOf(fo5Var.d));
                                        break;
                                    case 2:
                                        cls.getMethod(strJ, cls3).invoke(childAt, Integer.valueOf(fo5Var.g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strJ, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(fo5Var.g);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        cls.getMethod(strJ, CharSequence.class).invoke(childAt, fo5Var.e);
                                        break;
                                    case 5:
                                        cls.getMethod(strJ, Boolean.TYPE).invoke(childAt, Boolean.valueOf(fo5Var.f));
                                        break;
                                    case 6:
                                        cls.getMethod(strJ, cls2).invoke(childAt, Float.valueOf(fo5Var.d));
                                        break;
                                    case 7:
                                        cls.getMethod(strJ, cls3).invoke(childAt, Integer.valueOf(fo5Var.c));
                                        break;
                                }
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                            }
                        }
                        childAt.setLayoutParams(jo5Var);
                        if (qo5Var.b == 0) {
                            childAt.setVisibility(qo5Var.a);
                        }
                        childAt.setAlpha(qo5Var.c);
                        childAt.setRotation(ro5Var.a);
                        childAt.setRotationX(ro5Var.b);
                        childAt.setRotationY(ro5Var.c);
                        childAt.setScaleX(ro5Var.d);
                        childAt.setScaleY(ro5Var.e);
                        if (ro5Var.h != -1) {
                            if (((View) childAt.getParent()).findViewById(ro5Var.h) != null) {
                                float bottom = (r4.getBottom() + r4.getTop()) / 2.0f;
                                float right = (r4.getRight() + r4.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(ro5Var.f)) {
                                childAt.setPivotX(ro5Var.f);
                            }
                            if (!Float.isNaN(ro5Var.g)) {
                                childAt.setPivotY(ro5Var.g);
                            }
                        }
                        childAt.setTranslationX(ro5Var.i);
                        childAt.setTranslationY(ro5Var.j);
                        childAt.setTranslationZ(ro5Var.k);
                        if (ro5Var.l) {
                            childAt.setElevation(ro5Var.m);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            no5 no5Var2 = (no5) map.get(num);
            if (no5Var2 != null) {
                oo5 oo5Var2 = no5Var2.d;
                if (oo5Var2.h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = oo5Var2.i0;
                    if (iArr2 != null) {
                        barrier2.m(iArr2);
                    } else {
                        String str2 = oo5Var2.j0;
                        if (str2 != null) {
                            int[] iArrG2 = g(barrier2, str2);
                            oo5Var2.i0 = iArrG2;
                            barrier2.m(iArrG2);
                        }
                    }
                    barrier2.h = oo5Var2.f0;
                    barrier2.i.t0 = oo5Var2.g0;
                    int i3 = ConstraintLayout.o;
                    jo5 jo5Var2 = new jo5(-2, -2);
                    barrier2.o();
                    no5Var2.a(jo5Var2);
                    constraintLayout.addView(barrier2, jo5Var2);
                }
                if (oo5Var2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    int i4 = ConstraintLayout.o;
                    jo5 jo5Var3 = new jo5(-2, -2);
                    no5Var2.a(jo5Var3);
                    constraintLayout.addView(guideline, jo5Var3);
                }
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof ho5) {
                ((ho5) childAt2).f(constraintLayout);
            }
        }
    }

    public final void c(int i, int i2) {
        no5 no5Var;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        if (!map.containsKey(numValueOf) || (no5Var = (no5) map.get(Integer.valueOf(i))) == null) {
            return;
        }
        oo5 oo5Var = no5Var.d;
        switch (i2) {
            case 1:
                oo5Var.i = -1;
                oo5Var.h = -1;
                oo5Var.F = -1;
                oo5Var.M = LinearLayoutManager.INVALID_OFFSET;
                break;
            case 2:
                oo5Var.k = -1;
                oo5Var.j = -1;
                oo5Var.G = -1;
                oo5Var.O = LinearLayoutManager.INVALID_OFFSET;
                break;
            case 3:
                oo5Var.m = -1;
                oo5Var.l = -1;
                oo5Var.H = 0;
                oo5Var.N = LinearLayoutManager.INVALID_OFFSET;
                break;
            case 4:
                oo5Var.n = -1;
                oo5Var.o = -1;
                oo5Var.I = 0;
                oo5Var.P = LinearLayoutManager.INVALID_OFFSET;
                break;
            case 5:
                oo5Var.p = -1;
                oo5Var.q = -1;
                oo5Var.r = -1;
                oo5Var.L = 0;
                oo5Var.S = LinearLayoutManager.INVALID_OFFSET;
                break;
            case 6:
                oo5Var.s = -1;
                oo5Var.t = -1;
                oo5Var.K = 0;
                oo5Var.R = LinearLayoutManager.INVALID_OFFSET;
                break;
            case 7:
                oo5Var.u = -1;
                oo5Var.v = -1;
                oo5Var.J = 0;
                oo5Var.Q = LinearLayoutManager.INVALID_OFFSET;
                break;
            case 8:
                oo5Var.B = -1.0f;
                oo5Var.A = -1;
                oo5Var.z = -1;
                break;
            default:
                qp2.o("unknown constraint");
                break;
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i2;
        int i3;
        so5 so5Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = so5Var.b;
        map2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            jo5 jo5Var = (jo5) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                h9o.r("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new no5());
            }
            no5 no5Var = (no5) map2.get(Integer.valueOf(id));
            if (no5Var == null) {
                i = childCount;
                map = map2;
                i2 = i4;
            } else {
                qo5 qo5Var = no5Var.b;
                oo5 oo5Var = no5Var.d;
                ro5 ro5Var = no5Var.e;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map4 = so5Var.a;
                for (String str : map4.keySet()) {
                    int i5 = childCount;
                    fo5 fo5Var = (fo5) map4.get(str);
                    HashMap map5 = map2;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i3 = i4;
                            try {
                                map3.put(str, new fo5(fo5Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            }
                        } else {
                            i3 = i4;
                            map3.put(str, new fo5(fo5Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                        i3 = i4;
                    }
                    map2 = map5;
                    childCount = i5;
                    i4 = i3;
                }
                i = childCount;
                map = map2;
                i2 = i4;
                no5Var.f = map3;
                no5Var.a = id;
                oo5Var.h = jo5Var.e;
                oo5Var.i = jo5Var.f;
                oo5Var.j = jo5Var.g;
                oo5Var.k = jo5Var.h;
                oo5Var.l = jo5Var.i;
                oo5Var.m = jo5Var.j;
                oo5Var.n = jo5Var.k;
                oo5Var.o = jo5Var.l;
                oo5Var.p = jo5Var.m;
                oo5Var.q = jo5Var.n;
                oo5Var.r = jo5Var.o;
                oo5Var.s = jo5Var.s;
                oo5Var.t = jo5Var.t;
                oo5Var.u = jo5Var.u;
                oo5Var.v = jo5Var.v;
                oo5Var.w = jo5Var.E;
                oo5Var.x = jo5Var.F;
                oo5Var.y = jo5Var.G;
                oo5Var.z = jo5Var.p;
                oo5Var.A = jo5Var.q;
                oo5Var.B = jo5Var.r;
                oo5Var.C = jo5Var.T;
                oo5Var.D = jo5Var.U;
                oo5Var.E = jo5Var.V;
                oo5Var.f = jo5Var.c;
                oo5Var.d = jo5Var.a;
                oo5Var.e = jo5Var.b;
                oo5Var.b = ((ViewGroup.MarginLayoutParams) jo5Var).width;
                oo5Var.c = ((ViewGroup.MarginLayoutParams) jo5Var).height;
                oo5Var.F = ((ViewGroup.MarginLayoutParams) jo5Var).leftMargin;
                oo5Var.G = ((ViewGroup.MarginLayoutParams) jo5Var).rightMargin;
                oo5Var.H = ((ViewGroup.MarginLayoutParams) jo5Var).topMargin;
                oo5Var.I = ((ViewGroup.MarginLayoutParams) jo5Var).bottomMargin;
                oo5Var.L = jo5Var.D;
                oo5Var.T = jo5Var.I;
                oo5Var.U = jo5Var.H;
                oo5Var.W = jo5Var.K;
                oo5Var.V = jo5Var.J;
                oo5Var.l0 = jo5Var.W;
                oo5Var.m0 = jo5Var.X;
                oo5Var.X = jo5Var.L;
                oo5Var.Y = jo5Var.M;
                oo5Var.Z = jo5Var.P;
                oo5Var.a0 = jo5Var.Q;
                oo5Var.b0 = jo5Var.N;
                oo5Var.c0 = jo5Var.O;
                oo5Var.d0 = jo5Var.R;
                oo5Var.e0 = jo5Var.S;
                oo5Var.k0 = jo5Var.Y;
                oo5Var.N = jo5Var.x;
                oo5Var.P = jo5Var.z;
                oo5Var.M = jo5Var.w;
                oo5Var.O = jo5Var.y;
                oo5Var.R = jo5Var.A;
                oo5Var.Q = jo5Var.B;
                oo5Var.S = jo5Var.C;
                oo5Var.o0 = jo5Var.Z;
                oo5Var.J = jo5Var.getMarginEnd();
                oo5Var.K = jo5Var.getMarginStart();
                qo5Var.a = childAt.getVisibility();
                qo5Var.c = childAt.getAlpha();
                ro5Var.a = childAt.getRotation();
                ro5Var.b = childAt.getRotationX();
                ro5Var.c = childAt.getRotationY();
                ro5Var.d = childAt.getScaleX();
                ro5Var.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    ro5Var.f = pivotX;
                    ro5Var.g = pivotY;
                }
                ro5Var.i = childAt.getTranslationX();
                ro5Var.j = childAt.getTranslationY();
                ro5Var.k = childAt.getTranslationZ();
                if (ro5Var.l) {
                    ro5Var.m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    oo5Var.n0 = barrier.i.s0;
                    oo5Var.i0 = Arrays.copyOf(barrier.a, barrier.b);
                    oo5Var.f0 = barrier.h;
                    oo5Var.g0 = barrier.i.t0;
                }
            }
            i4 = i2 + 1;
            so5Var = this;
            map2 = map;
            childCount = i;
        }
    }

    public final void e(int i, int i2, int i3, int i4) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new no5());
        }
        no5 no5Var = (no5) map.get(Integer.valueOf(i));
        if (no5Var == null) {
        }
        oo5 oo5Var = no5Var.d;
        switch (i2) {
            case 1:
                if (i4 != 1) {
                    if (i4 != 2) {
                        uac.k(o(i4), " undefined", "left to ");
                        break;
                    } else {
                        oo5Var.i = i3;
                        oo5Var.h = -1;
                        break;
                    }
                } else {
                    oo5Var.h = i3;
                    oo5Var.i = -1;
                    break;
                }
            case 2:
                if (i4 != 1) {
                    if (i4 != 2) {
                        uac.k(o(i4), " undefined", "right to ");
                        break;
                    } else {
                        oo5Var.k = i3;
                        oo5Var.j = -1;
                        break;
                    }
                } else {
                    oo5Var.j = i3;
                    oo5Var.k = -1;
                    break;
                }
            case 3:
                if (i4 != 3) {
                    if (i4 != 4) {
                        uac.k(o(i4), " undefined", "right to ");
                        break;
                    } else {
                        oo5Var.m = i3;
                        oo5Var.l = -1;
                        oo5Var.p = -1;
                        oo5Var.q = -1;
                        oo5Var.r = -1;
                        break;
                    }
                } else {
                    oo5Var.l = i3;
                    oo5Var.m = -1;
                    oo5Var.p = -1;
                    oo5Var.q = -1;
                    oo5Var.r = -1;
                    break;
                }
            case 4:
                if (i4 != 4) {
                    if (i4 != 3) {
                        uac.k(o(i4), " undefined", "right to ");
                        break;
                    } else {
                        oo5Var.n = i3;
                        oo5Var.o = -1;
                        oo5Var.p = -1;
                        oo5Var.q = -1;
                        oo5Var.r = -1;
                        break;
                    }
                } else {
                    oo5Var.o = i3;
                    oo5Var.n = -1;
                    oo5Var.p = -1;
                    oo5Var.q = -1;
                    oo5Var.r = -1;
                    break;
                }
            case 5:
                if (i4 != 5) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            uac.k(o(i4), " undefined", "right to ");
                            break;
                        } else {
                            oo5Var.r = i3;
                            oo5Var.o = -1;
                            oo5Var.n = -1;
                            oo5Var.l = -1;
                            oo5Var.m = -1;
                            break;
                        }
                    } else {
                        oo5Var.q = i3;
                        oo5Var.o = -1;
                        oo5Var.n = -1;
                        oo5Var.l = -1;
                        oo5Var.m = -1;
                        break;
                    }
                } else {
                    oo5Var.p = i3;
                    oo5Var.o = -1;
                    oo5Var.n = -1;
                    oo5Var.l = -1;
                    oo5Var.m = -1;
                    break;
                }
            case 6:
                if (i4 != 6) {
                    if (i4 != 7) {
                        uac.k(o(i4), " undefined", "right to ");
                        break;
                    } else {
                        oo5Var.s = i3;
                        oo5Var.t = -1;
                        break;
                    }
                } else {
                    oo5Var.t = i3;
                    oo5Var.s = -1;
                    break;
                }
            case 7:
                if (i4 != 7) {
                    if (i4 != 6) {
                        uac.k(o(i4), " undefined", "right to ");
                        break;
                    } else {
                        oo5Var.u = i3;
                        oo5Var.v = -1;
                        break;
                    }
                } else {
                    oo5Var.v = i3;
                    oo5Var.u = -1;
                    break;
                }
            default:
                j9h.s(o(i2), " to ", o(i4), " unknown");
                break;
        }
    }

    public final void f(int i, int i2, int i3, int i4, int i5) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new no5());
        }
        no5 no5Var = (no5) map.get(Integer.valueOf(i));
        if (no5Var == null) {
        }
        oo5 oo5Var = no5Var.d;
        switch (i2) {
            case 1:
                if (i4 != 1) {
                    if (i4 != 2) {
                        uac.k(o(i4), " undefined", "Left to ");
                        break;
                    } else {
                        oo5Var.i = i3;
                        oo5Var.h = -1;
                    }
                } else {
                    oo5Var.h = i3;
                    oo5Var.i = -1;
                }
                oo5Var.F = i5;
                break;
            case 2:
                if (i4 != 1) {
                    if (i4 != 2) {
                        uac.k(o(i4), " undefined", "right to ");
                        break;
                    } else {
                        oo5Var.k = i3;
                        oo5Var.j = -1;
                    }
                } else {
                    oo5Var.j = i3;
                    oo5Var.k = -1;
                }
                oo5Var.G = i5;
                break;
            case 3:
                if (i4 != 3) {
                    if (i4 != 4) {
                        uac.k(o(i4), " undefined", "right to ");
                        break;
                    } else {
                        oo5Var.m = i3;
                        oo5Var.l = -1;
                        oo5Var.p = -1;
                        oo5Var.q = -1;
                        oo5Var.r = -1;
                    }
                } else {
                    oo5Var.l = i3;
                    oo5Var.m = -1;
                    oo5Var.p = -1;
                    oo5Var.q = -1;
                    oo5Var.r = -1;
                }
                oo5Var.H = i5;
                break;
            case 4:
                if (i4 != 4) {
                    if (i4 != 3) {
                        uac.k(o(i4), " undefined", "right to ");
                        break;
                    } else {
                        oo5Var.n = i3;
                        oo5Var.o = -1;
                        oo5Var.p = -1;
                        oo5Var.q = -1;
                        oo5Var.r = -1;
                    }
                } else {
                    oo5Var.o = i3;
                    oo5Var.n = -1;
                    oo5Var.p = -1;
                    oo5Var.q = -1;
                    oo5Var.r = -1;
                }
                oo5Var.I = i5;
                break;
            case 5:
                if (i4 != 5) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            uac.k(o(i4), " undefined", "right to ");
                            break;
                        } else {
                            oo5Var.r = i3;
                            oo5Var.o = -1;
                            oo5Var.n = -1;
                            oo5Var.l = -1;
                            oo5Var.m = -1;
                            break;
                        }
                    } else {
                        oo5Var.q = i3;
                        oo5Var.o = -1;
                        oo5Var.n = -1;
                        oo5Var.l = -1;
                        oo5Var.m = -1;
                        break;
                    }
                } else {
                    oo5Var.p = i3;
                    oo5Var.o = -1;
                    oo5Var.n = -1;
                    oo5Var.l = -1;
                    oo5Var.m = -1;
                    break;
                }
            case 6:
                if (i4 != 6) {
                    if (i4 != 7) {
                        uac.k(o(i4), " undefined", "right to ");
                        break;
                    } else {
                        oo5Var.s = i3;
                        oo5Var.t = -1;
                    }
                } else {
                    oo5Var.t = i3;
                    oo5Var.s = -1;
                }
                oo5Var.K = i5;
                break;
            case 7:
                if (i4 != 7) {
                    if (i4 != 6) {
                        uac.k(o(i4), " undefined", "right to ");
                        break;
                    } else {
                        oo5Var.u = i3;
                        oo5Var.v = -1;
                    }
                } else {
                    oo5Var.v = i3;
                    oo5Var.u = -1;
                }
                oo5Var.J = i5;
                break;
            default:
                j9h.s(o(i2), " to ", o(i4), " unknown");
                break;
        }
    }

    public final no5 i(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new no5());
        }
        return (no5) map.get(Integer.valueOf(i));
    }

    public final void j(int i, Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    no5 no5VarH = h(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        no5VarH.d.a = true;
                    }
                    this.b.put(Integer.valueOf(no5VarH.a), no5VarH);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void n(int i, int i2, int i3) {
        no5 no5VarI = i(i);
        switch (i2) {
            case 1:
                no5VarI.d.F = i3;
                break;
            case 2:
                no5VarI.d.G = i3;
                break;
            case 3:
                no5VarI.d.H = i3;
                break;
            case 4:
                no5VarI.d.I = i3;
                break;
            case 5:
                no5VarI.d.L = i3;
                break;
            case 6:
                no5VarI.d.K = i3;
                break;
            case 7:
                no5VarI.d.J = i3;
                break;
            default:
                qp2.o("unknown constraint");
                break;
        }
    }
}
