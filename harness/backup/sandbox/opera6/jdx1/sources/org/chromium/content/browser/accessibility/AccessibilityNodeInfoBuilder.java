package org.chromium.content.browser.accessibility;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.SuggestionSpan;
import android.text.style.URLSpan;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import defpackage.a9;
import defpackage.b9;
import defpackage.g8;
import defpackage.r8;
import defpackage.s8;
import defpackage.t8;
import defpackage.u8;
import defpackage.w8;
import defpackage.x8;
import defpackage.z04;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import org.chromium.content.browser.accessibility.AccessibilityNodeInfoBuilder;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;

/* loaded from: classes.dex */
public final class AccessibilityNodeInfoBuilder {
    public final dcl a;

    public AccessibilityNodeInfoBuilder(dcl dclVar) {
        this.a = dclVar;
    }

    public static void b(Rect rect, Bundle bundle, tvk tvkVar, xr5 xr5Var, boolean z) {
        rect.offset(-((int) tvkVar.l().a), -((int) tvkVar.l().b));
        rect.left = (int) tvkVar.l().a(rect.left);
        rect.top = (int) tvkVar.l().a(rect.top);
        rect.bottom = (int) tvkVar.l().a(rect.bottom);
        rect.right = (int) tvkVar.l().a(rect.right);
        rect.offset(0, (int) tvkVar.l().k);
        int[] iArr = new int[2];
        xr5Var.getLocationOnScreen(iArr);
        if (z) {
            rect.offset(iArr[0], iArr[1]);
        }
        int i = iArr[1] + ((int) tvkVar.l().k);
        int iB = tvkVar.l().b() + i;
        int i2 = iArr[0];
        huh huhVarL = tvkVar.l();
        int iCeil = ((int) Math.ceil(huhVarL.a(huhVarL.e))) + i2;
        if (bundle != null) {
            bundle.putInt("AccessibilityNodeInfo.unclippedTop", rect.top);
            bundle.putInt("AccessibilityNodeInfo.unclippedBottom", rect.bottom);
            bundle.putInt("AccessibilityNodeInfo.unclippedLeft", rect.left);
            bundle.putInt("AccessibilityNodeInfo.unclippedRight", rect.right);
            bundle.putInt("AccessibilityNodeInfo.unclippedWidth", rect.width());
            bundle.putInt("AccessibilityNodeInfo.unclippedHeight", rect.height());
        }
        int i3 = rect.top;
        if (i3 < i) {
            rect.top = i;
        } else if (i3 > iB) {
            rect.top = iB;
        }
        int i4 = rect.bottom;
        if (i4 > iB) {
            rect.bottom = iB;
        } else if (i4 < i) {
            rect.bottom = i;
        }
        int i5 = rect.left;
        if (i5 < i2) {
            rect.left = i2;
        } else if (i5 > iCeil) {
            rect.left = iCeil;
        }
        int i6 = rect.right;
        if (i6 > iCeil) {
            rect.right = iCeil;
        } else if (i6 < i2) {
            rect.right = i2;
        }
    }

    public final void a(final SpannableString spannableString, Map map, final r8 r8Var) {
        if (map != null) {
            map.forEach(new BiConsumer(this) { // from class: q8
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    int[] iArr;
                    int[] iArr2;
                    ParcelableSpan parcelableSpanA;
                    int[][] iArr3 = (int[][]) obj2;
                    if (iArr3 == null || iArr3.length != 2 || (iArr = iArr3[0]) == null || (iArr2 = iArr3[1]) == null || iArr.length <= 0 || iArr.length != iArr2.length) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        int[] iArr4 = iArr3[0];
                        if (i >= iArr4.length) {
                            return;
                        }
                        int i2 = iArr4[i];
                        int i3 = iArr3[1][i];
                        if (i2 <= i3 && i2 >= 0) {
                            SpannableString spannableString2 = spannableString;
                            if (i3 <= spannableString2.length() && (parcelableSpanA = r8Var.a(obj)) != null) {
                                spannableString2.setSpan(parcelableSpanA, i2, i3, 0);
                            }
                        }
                        i++;
                    }
                }
            });
        }
    }

    public final void addAccessibilityNodeInfoActions(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20) {
        accessibilityNodeInfoCompat.b(s8.m);
        accessibilityNodeInfoCompat.b(s8.n);
        accessibilityNodeInfoCompat.b(s8.y);
        accessibilityNodeInfoCompat.b(s8.I);
        if (z16) {
            accessibilityNodeInfoCompat.b(s8.k);
            accessibilityNodeInfoCompat.b(s8.l);
        }
        if (z8 && z9) {
            if (z10) {
                accessibilityNodeInfoCompat.b(s8.x);
                accessibilityNodeInfoCompat.b(s8.r);
                accessibilityNodeInfoCompat.b(s8.M);
            }
            if (z15) {
                accessibilityNodeInfoCompat.b(s8.t);
                if (z10) {
                    accessibilityNodeInfoCompat.b(s8.s);
                }
                accessibilityNodeInfoCompat.b(s8.q);
            }
        }
        if (z) {
            accessibilityNodeInfoCompat.b(s8.o);
        }
        if (z2) {
            accessibilityNodeInfoCompat.b(s8.p);
        }
        if (z3) {
            accessibilityNodeInfoCompat.b(s8.A);
            accessibilityNodeInfoCompat.b(s8.E);
        }
        if (z4) {
            accessibilityNodeInfoCompat.b(s8.C);
            accessibilityNodeInfoCompat.b(s8.F);
        }
        if (z5) {
            accessibilityNodeInfoCompat.b(s8.B);
            accessibilityNodeInfoCompat.b(s8.G);
        }
        if (z6) {
            accessibilityNodeInfoCompat.b(s8.D);
            accessibilityNodeInfoCompat.b(s8.H);
        }
        if (z11) {
            if (z12) {
                accessibilityNodeInfoCompat.b(s8.f);
            } else {
                accessibilityNodeInfoCompat.b(s8.e);
            }
        }
        if (((WebContentsAccessibilityImpl) this.a.a).n == i) {
            accessibilityNodeInfoCompat.b(s8.j);
        } else {
            accessibilityNodeInfoCompat.b(s8.i);
        }
        if (z7) {
            accessibilityNodeInfoCompat.b(s8.g);
        }
        if (z13) {
            accessibilityNodeInfoCompat.b(s8.u);
        }
        if (z14) {
            accessibilityNodeInfoCompat.b(s8.v);
        }
        if (z17) {
            accessibilityNodeInfoCompat.b(s8.J);
        }
        if (z19) {
            if (z20) {
                accessibilityNodeInfoCompat.b(s8.L);
            } else {
                accessibilityNodeInfoCompat.b(s8.K);
            }
        }
    }

    public final void addAccessibilityNodeInfoChildren(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int[] iArr) {
        for (int i : iArr) {
            accessibilityNodeInfoCompat.a.addChild(((WebContentsAccessibilityImpl) this.a.a).i, i);
        }
    }

    public final void clearAccessibilityNodeInfoExtendedSelectionAttrs(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.A(null);
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SELECTION_START_OFFSET_TYPE");
        accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SELECTION_END_OFFSET_TYPE");
    }

    public final void setAccessibilityNodeInfoBaseAttributes(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i3, int i4, String str7, int i5, String str8, String str9, String str10, int i6, int i7, int[] iArr) {
        WebContentsAccessibilityImpl webContentsAccessibilityImpl = (WebContentsAccessibilityImpl) this.a.a;
        String strValueOf = String.valueOf(i);
        int i8 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.a;
        if (i8 >= 33) {
            t8.c0(accessibilityNodeInfo, strValueOf);
        } else {
            accessibilityNodeInfo.getExtras().putString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY", strValueOf);
        }
        accessibilityNodeInfoCompat.t(str);
        Bundle extras = accessibilityNodeInfo.getExtras();
        if (!str9.isEmpty()) {
            extras.putCharSequence("AccessibilityNodeInfo.brailleLabel", str9);
        }
        if (!str10.isEmpty()) {
            extras.putCharSequence("AccessibilityNodeInfo.brailleRoleDescription", str10);
        }
        extras.putCharSequence("AccessibilityNodeInfo.chromeRole", str2);
        if (!str3.isEmpty()) {
            accessibilityNodeInfoCompat.y(str3);
        }
        extras.putCharSequence("AccessibilityNodeInfo.hint", str4);
        if (!str8.isEmpty()) {
            extras.putCharSequence("AccessibilityNodeInfo.cssDisplay", str8);
        }
        if (!str6.isEmpty()) {
            extras.putCharSequence("AccessibilityNodeInfo.targetUrl", str6);
        }
        if (i == webContentsAccessibilityImpl.h) {
            extras.putCharSequence("ACTION_ARGUMENT_HTML_ELEMENT_STRING_VALUES", webContentsAccessibilityImpl.r);
        }
        if (i2 != -1) {
            xr5 xr5Var = webContentsAccessibilityImpl.i;
            accessibilityNodeInfoCompat.b = i2;
            accessibilityNodeInfo2.setParent(xr5Var, i2);
        }
        accessibilityNodeInfo2.setCanOpenPopup(z);
        accessibilityNodeInfo2.setDismissable(false);
        accessibilityNodeInfo.setMultiLine(z2);
        accessibilityNodeInfo.setInputType(i3);
        accessibilityNodeInfo2.setHintText(str4);
        accessibilityNodeInfo.setTooltipText(str5);
        if (i8 >= 36) {
            u8.o(accessibilityNodeInfo, i6);
        } else {
            accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", i6);
        }
        accessibilityNodeInfo2.setLiveRegion(i4);
        if (accessibilityNodeInfo.isContentInvalid()) {
            accessibilityNodeInfo2.setError(str7);
        }
        if (i5 > 0) {
            extras.putInt("AccessibilityNodeInfo.clickableScore", i5);
        }
        if (i8 >= 36) {
            u8.m(accessibilityNodeInfo, i7);
        } else if (i7 != 1 && i7 != 2 && i7 != 0) {
            qp2.o(sko.i(i7, "Unknown checked argument: "));
            return;
        } else {
            accessibilityNodeInfo.setChecked(i7 == 1);
            accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", i7);
        }
        for (int i9 : iArr) {
            xr5 xr5Var2 = webContentsAccessibilityImpl.i;
            if (Build.VERSION.SDK_INT >= 36) {
                u8.b(accessibilityNodeInfo, xr5Var2, i9);
            } else {
                accessibilityNodeInfo.setLabeledBy(xr5Var2, i9);
            }
        }
    }

    public final void setAccessibilityNodeInfoBooleanAttributes(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        accessibilityNodeInfoCompat.a.setCheckable(z);
        accessibilityNodeInfoCompat.u(z2);
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        accessibilityNodeInfo.setEditable(z5);
        accessibilityNodeInfo.setEnabled(z4);
        accessibilityNodeInfo.setFocusable(z6);
        accessibilityNodeInfo.setFocused(z7);
        accessibilityNodeInfo.setPassword(z9);
        accessibilityNodeInfoCompat.z(z10);
        accessibilityNodeInfo.setSelected(z11);
        accessibilityNodeInfoCompat.D(z13);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 36) {
            u8.p(accessibilityNodeInfo, z15);
        } else {
            accessibilityNodeInfo.getExtras().putBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY", z15);
        }
        accessibilityNodeInfo.setContentInvalid(z3);
        accessibilityNodeInfo.setHeading(z16);
        if (i8.g.f("AccessibilitySetSelectableOnAllNodesWithText")) {
            if (i2 >= 33) {
                t8.b0(accessibilityNodeInfo, z12);
            } else {
                accessibilityNodeInfoCompat.q(8388608, z12);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (z8) {
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.hasImage", "true");
            arrayList.add("AccessibilityNodeInfo.requestImageData");
        }
        if (z14) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_IN_WINDOW_KEY");
        }
        if (z2 && !z17) {
            arrayList.add("android.view.accessibility.extra.DATA_REQUEST_LAYOUT_BASED_ACTIONS_KEY");
        }
        accessibilityNodeInfo.setAvailableExtraData(arrayList);
        if (z18) {
            accessibilityNodeInfo.setMovementGranularities(15);
        }
        accessibilityNodeInfoCompat.p(((WebContentsAccessibilityImpl) this.a.a).n == i);
    }

    public final void setAccessibilityNodeInfoCollectionInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2, boolean z, int i3) {
        accessibilityNodeInfoCompat.v(u59.M(i, i2, i3, z));
    }

    public final void setAccessibilityNodeInfoCollectionItemInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            i5 = 0;
        }
        accessibilityNodeInfoCompat.w(z04.a() ? w8.a(i3, i, i4, i2, i5) : Build.VERSION.SDK_INT >= 33 ? t8.f(i3, i, i4, i2) : new tw2(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, false), (byte) 3));
    }

    public final void setAccessibilityNodeInfoExtendedSelectionAttrs(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2, int i3, int i4, int i5, int i6) {
        WebContentsAccessibilityImpl webContentsAccessibilityImpl = (WebContentsAccessibilityImpl) this.a.a;
        accessibilityNodeInfoCompat.A(new a9(new b9(webContentsAccessibilityImpl.i, i, i2), new b9(webContentsAccessibilityImpl.i, i4, i5)));
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SELECTION_START_OFFSET_TYPE", i3);
        accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SELECTION_END_OFFSET_TYPE", i6);
    }

    public final void setAccessibilityNodeInfoImageData(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, byte[] bArr) {
        accessibilityNodeInfoCompat.a.getExtras().putByteArray("AccessibilityNodeInfo.imageData", bArr);
    }

    public final void setAccessibilityNodeInfoLocation(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        Rect rect = new Rect(i4, i5, i4 + i6, i5 + i7);
        WebContentsAccessibilityImpl webContentsAccessibilityImpl = (WebContentsAccessibilityImpl) this.a.a;
        if (i == webContentsAccessibilityImpl.h) {
            rect.offset(0, (int) ((tvk) webContentsAccessibilityImpl.b.c).l().k);
        }
        accessibilityNodeInfoCompat.r(rect);
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        Rect rect2 = new Rect(i2, i3, i6 + i2, i7 + i3);
        b(rect2, accessibilityNodeInfo.getExtras(), (tvk) webContentsAccessibilityImpl.b.c, webContentsAccessibilityImpl.i, true);
        accessibilityNodeInfoCompat.s(rect2);
        if (z) {
            accessibilityNodeInfo.getExtras().putBoolean("AccessibilityNodeInfo.offscreen", true);
            return;
        }
        if (accessibilityNodeInfo.getExtras().containsKey("AccessibilityNodeInfo.offscreen")) {
            accessibilityNodeInfo.getExtras().remove("AccessibilityNodeInfo.offscreen");
        }
        if (i8.d.f("AccessibilityHandleOccludingViews")) {
            SparseArray sparseArray = webContentsAccessibilityImpl.E;
            if (accessibilityNodeInfo.isVisibleToUser()) {
                Rect rect3 = new Rect();
                accessibilityNodeInfoCompat.g(rect3);
                Rect rectA = AccessibilityNodeInfoUtils.a(rect3, sparseArray);
                if (rectA == null) {
                    accessibilityNodeInfoCompat.D(false);
                } else {
                    if (rectA.equals(rect3)) {
                        return;
                    }
                    accessibilityNodeInfoCompat.s(rectA);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void setAccessibilityNodeInfoMathAttributes(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, String str2, String str3) {
        String str4;
        String str5;
        str.getClass();
        String str6 = "ms";
        String str7 = "mo";
        String str8 = "mn";
        String str9 = "mi";
        String str10 = "munderover";
        String str11 = "munder";
        switch (str.hashCode()) {
            case -1163524814:
                str4 = "msubsup";
                str5 = "mtable";
                if (str.equals("mprescripts")) {
                    c = 0;
                    break;
                }
                break;
            case -1064274047:
                str4 = "msubsup";
                str5 = "mtable";
                if (str.equals(str5)) {
                    c = 1;
                    break;
                }
                break;
            case -1062961525:
                str4 = "msubsup";
                c = str.equals(str11) ? (char) 2 : (char) 65535;
                str11 = str11;
                str5 = "mtable";
                break;
            case -971997729:
                str4 = "msubsup";
                c = str.equals(str10) ? (char) 3 : (char) 65535;
                str10 = str10;
                str5 = "mtable";
                break;
            case 3484:
                str4 = "msubsup";
                c = str.equals(str9) ? (char) 4 : (char) 65535;
                str9 = str9;
                str5 = "mtable";
                break;
            case 3489:
                str4 = "msubsup";
                c = str.equals(str8) ? (char) 5 : (char) 65535;
                str8 = str8;
                str5 = "mtable";
                break;
            case 3490:
                str4 = "msubsup";
                c = str.equals(str7) ? (char) 6 : (char) 65535;
                str7 = str7;
                str5 = "mtable";
                break;
            case 3494:
                str4 = "msubsup";
                c = str.equals(str6) ? (char) 7 : (char) 65535;
                str6 = str6;
                str5 = "mtable";
                break;
            case 108445:
                if (str.equals("mtd")) {
                    c = '\b';
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 108459:
                if (str.equals("mtr")) {
                    c = '\t';
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 3344136:
                if (str.equals("math")) {
                    c = '\n';
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 3360333:
                if (str.equals("mrow")) {
                    c = 11;
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 3361459:
                if (str.equals("msub")) {
                    c = '\f';
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 3361473:
                if (str.equals("msup")) {
                    c = '\r';
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 3387192:
                if (str.equals("none")) {
                    c = 14;
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 103815131:
                if (str.equals("mfrac")) {
                    c = 15;
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 104087233:
                if (str.equals("mover")) {
                    c = 16;
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 104170191:
                if (str.equals("mroot")) {
                    c = 17;
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 104201997:
                if (str.equals("msqrt")) {
                    c = 18;
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 104220442:
                if (str.equals("mtext")) {
                    c = 19;
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 757110428:
                if (str.equals("mmultiscripts")) {
                    c = 20;
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            case 1357091515:
                if (str.equals("msubsup")) {
                    c = 21;
                }
                str4 = "msubsup";
                str5 = "mtable";
                break;
            default:
                str4 = "msubsup";
                str5 = "mtable";
                break;
        }
        switch (c) {
            case 0:
                str5 = "mprescripts";
                break;
            case 1:
                break;
            case 2:
                str5 = str11;
                break;
            case 3:
                str5 = str10;
                break;
            case 4:
                str5 = str9;
                break;
            case 5:
                str5 = str8;
                break;
            case 6:
                str5 = str7;
                break;
            case 7:
                str5 = str6;
                break;
            case '\b':
                str5 = "mtd";
                break;
            case '\t':
                str5 = "mtr";
                break;
            case '\n':
                str5 = "math";
                break;
            case 11:
                str5 = "mrow";
                break;
            case '\f':
                str5 = "msub";
                break;
            case '\r':
                str5 = "msup";
                break;
            case 14:
                str5 = "none";
                break;
            case 15:
                str5 = "mfrac";
                break;
            case 16:
                str5 = "mover";
                break;
            case 17:
                str5 = "mroot";
                break;
            case 18:
                str5 = "msqrt";
                break;
            case 19:
                str5 = "mtext";
                break;
            case 20:
                str5 = "mmultiscripts";
                break;
            case 21:
                str5 = str4;
                break;
            default:
                str5 = null;
                break;
        }
        if (str5 == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.MathInfo mathInfoB = i >= 37 ? x8.b(str5) : null;
        if (!TextUtils.isEmpty(str2) && i >= 37) {
            x8.g(mathInfoB, "intent", str2);
        }
        if (!TextUtils.isEmpty(str3) && i >= 37) {
            x8.g(mathInfoB, "arg", str3);
        }
        if (i >= 37) {
            x8.j(accessibilityNodeInfoCompat.a, mathInfoB);
        } else {
            accessibilityNodeInfoCompat.getClass();
        }
    }

    public final void setAccessibilityNodeInfoPaneTitle(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str) {
        accessibilityNodeInfoCompat.a.setPaneTitle(str);
    }

    public final void setAccessibilityNodeInfoRangeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, float f, float f2, float f3) {
        accessibilityNodeInfoCompat.a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
    }

    public final void setAccessibilityNodeInfoSelectionAttrs(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2) {
        accessibilityNodeInfoCompat.a.setTextSelection(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r20v0, types: [androidx.core.view.accessibility.AccessibilityNodeInfoCompat] */
    @SuppressLint({"NewApi"})
    public final void setAccessibilityNodeInfoText(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, String str2, boolean z, String str3, int[] iArr, int[] iArr2, String[] strArr, String str4, String str5, String str6, String str7) {
        ?? spannableString;
        long j;
        AccessibilityNodeInfoBuilder accessibilityNodeInfoBuilder = this;
        long j2 = 1000;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        if (z || (!(str3.isEmpty() || str3.equals(((WebContentsAccessibilityImpl) accessibilityNodeInfoBuilder.a.a).G)) || (iArr != null && iArr.length > 0))) {
            spannableString = new SpannableString(str);
            if (z) {
                spannableString.setSpan(new URLSpan(str2), 0, spannableString.length(), 0);
            }
            if (!str3.isEmpty() && !str3.equals(((WebContentsAccessibilityImpl) accessibilityNodeInfoBuilder.a.a).G)) {
                spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(str3)), 0, spannableString.length(), 0);
            }
            if (iArr != null && iArr.length > 0) {
                int i = 0;
                while (i < iArr.length) {
                    int i2 = iArr[i];
                    int i3 = iArr2[i];
                    if (i2 > i3 || i2 < 0) {
                        j = j2;
                    } else {
                        j = j2;
                        if (i3 <= spannableString.length()) {
                            spannableString.setSpan(new SuggestionSpan(((WebContentsAccessibilityImpl) accessibilityNodeInfoBuilder.a.a).c, new String[]{strArr[i]}, 2), i2, i3, 0);
                        }
                    }
                    i++;
                    j2 = j;
                    accessibilityNodeInfoBuilder = this;
                }
            }
        } else {
            spannableString = str;
        }
        long j3 = j2;
        if (str4 != null && !str4.isEmpty()) {
            accessibilityNodeInfoCompat.B(str4);
        }
        if (str5 != null && !str5.isEmpty()) {
            int i4 = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
            if (i4 >= 34) {
                g8.O(accessibilityNodeInfo, str5);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY", str5);
            }
        }
        if (str6 != null && !str6.isEmpty()) {
            accessibilityNodeInfoCompat.x(str6);
        }
        if (str7 != null && !str7.isEmpty()) {
            int i5 = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.a;
            if (i5 >= 36) {
                u8.r(accessibilityNodeInfo2, str7);
            } else {
                accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY", str7);
            }
        }
        if (!z) {
            accessibilityNodeInfoCompat.C(spannableString);
        } else if (str6 == null || str6.isEmpty()) {
            accessibilityNodeInfoCompat.x(spannableString.toString());
        }
        ioh.x((SystemClock.elapsedRealtimeNanos() / j3) - jElapsedRealtimeNanos, 1L, 5000L, "Accessibility.Android.Performance.SpannableCreationTime2", 100);
    }

    public final void setAccessibilityNodeInfoText(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, boolean z, String str2, String str3, String str4, String str5, Map<String, int[][]> map, Map<String, int[][]> map2, Map<Float, int[][]> map3, Map<Integer, int[][]> map4, Map<Integer, int[][]> map5, Map<Integer, int[][]> map6, Map<Integer, int[][]> map7, Map<String, int[][]> map8, Map<String, int[][]> map9) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        SpannableString spannableString = new SpannableString(str);
        final byte b = 0;
        a(spannableString, map, new r8(this) { // from class: p8
            public final /* synthetic */ AccessibilityNodeInfoBuilder b;

            {
                this.b = this;
            }

            @Override // defpackage.r8
            public final ParcelableSpan a(Object obj) {
                byte b2 = b;
                AccessibilityNodeInfoBuilder accessibilityNodeInfoBuilder = this.b;
                String str6 = (String) obj;
                switch (b2) {
                    case 0:
                        return new SuggestionSpan(((WebContentsAccessibilityImpl) accessibilityNodeInfoBuilder.a.a).c, new String[]{str6}, 2);
                    default:
                        if (str6.isEmpty() || str6.equals(((WebContentsAccessibilityImpl) accessibilityNodeInfoBuilder.a.a).G)) {
                            return null;
                        }
                        return new LocaleSpan(Locale.forLanguageTag(str6));
                }
            }
        });
        a(spannableString, map2, new mc8((byte) 4));
        a(spannableString, map3, new mc8((byte) 5));
        a(spannableString, map4, new mc8((byte) 6));
        a(spannableString, map5, new mc8((byte) 7));
        a(spannableString, map6, new mc8((byte) 8));
        a(spannableString, map7, new mc8((byte) 9));
        a(spannableString, map8, new mc8((byte) 10));
        final byte b2 = 1;
        a(spannableString, map9, new r8(this) { // from class: p8
            public final /* synthetic */ AccessibilityNodeInfoBuilder b;

            {
                this.b = this;
            }

            @Override // defpackage.r8
            public final ParcelableSpan a(Object obj) {
                byte b22 = b2;
                AccessibilityNodeInfoBuilder accessibilityNodeInfoBuilder = this.b;
                String str6 = (String) obj;
                switch (b22) {
                    case 0:
                        return new SuggestionSpan(((WebContentsAccessibilityImpl) accessibilityNodeInfoBuilder.a.a).c, new String[]{str6}, 2);
                    default:
                        if (str6.isEmpty() || str6.equals(((WebContentsAccessibilityImpl) accessibilityNodeInfoBuilder.a.a).G)) {
                            return null;
                        }
                        return new LocaleSpan(Locale.forLanguageTag(str6));
                }
            }
        });
        if (str2 != null && !str2.isEmpty()) {
            accessibilityNodeInfoCompat.B(str2);
        }
        if (str3 != null && !str3.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
            if (i >= 34) {
                g8.O(accessibilityNodeInfo, str3);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY", str3);
            }
        }
        if (str4 != null && !str4.isEmpty()) {
            accessibilityNodeInfoCompat.x(str4);
        }
        if (str5 != null && !str5.isEmpty()) {
            int i2 = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.a;
            if (i2 >= 36) {
                u8.r(accessibilityNodeInfo2, str5);
            } else {
                accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY", str5);
            }
        }
        if (z && (str4 == null || str4.isEmpty())) {
            accessibilityNodeInfoCompat.x(spannableString.toString());
        } else {
            accessibilityNodeInfoCompat.C(spannableString);
        }
        ioh.x((SystemClock.elapsedRealtimeNanos() / 1000) - jElapsedRealtimeNanos, 1L, 5000L, "Accessibility.Android.Performance.SpannableCreationTime2", 100);
    }

    public final void setAccessibilityNodeInfoViewIdResourceName(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str) {
        accessibilityNodeInfoCompat.a.setViewIdResourceName(str);
    }
}
