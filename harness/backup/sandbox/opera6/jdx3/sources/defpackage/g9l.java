package defpackage;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.quicksettings.Tile;
import android.util.Size;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.opera.android.browser.BrowserFragment;
import com.opera.android.custom_views.EqualWidthLinearLayout;
import com.opera.android.mainmenu.tiles.MainMenuTileLayout;
import com.opera.android.tabui2.FadeoutRecyclerView;
import com.opera.android.vpn.quick_settings_tile.VpnProQuickSettingsTileService;
import com.opera.android.widget.AspectRatioLayout;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class g9l implements f7f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g9l(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void d0(Object obj) {
        String string;
        boolean zD;
        AppCompatImageView appCompatImageView;
        byte b = this.a;
        String string2 = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                s9i s9iVar = (s9i) obj2;
                if (((LinkedHashSet) obj).isEmpty()) {
                    s9iVar.h0();
                    break;
                }
                break;
            case 1:
                r05 r05Var = (r05) obj2;
                g03 g03Var = (g03) obj;
                int iMax = Math.max(r05Var.b + g03Var.a, g03Var.b);
                ebl eblVar = (ebl) r05Var.e;
                p37.p0(iMax, eblVar.j);
                p37.p0(iMax, eblVar.g);
                EqualWidthLinearLayout equalWidthLinearLayout = eblVar.b;
                int i = r05Var.c;
                int i2 = g03Var.a;
                p37.o0(equalWidthLinearLayout, 0, 0, 0, i + i2, 7);
                p37.o0(eblVar.A, 0, 0, 0, r05Var.d + i2, 7);
                break;
            case 2:
                fo8 fo8Var = (fo8) obj;
                vzk vzkVar = ((FadeoutRecyclerView) obj2).G0;
                RecyclerView recyclerView = (FadeoutRecyclerView) vzkVar.a;
                if (!Intrinsics.a((fo8) vzkVar.d, fo8Var)) {
                    vzkVar.d = fo8Var;
                    fvl fvlVar = fo8Var.a;
                    qp3 qp3Var = fo8Var.b;
                    if (fvlVar.a() || qp3Var.a()) {
                        recyclerView.setLayerType(2, null);
                        if (fvlVar.a()) {
                            Paint paint = (Paint) vzkVar.b;
                            float f = fvlVar.a;
                            paint.setShader(new LinearGradient(0.0f, f, 0.0f, f + 0.01f, p37.j0(fvlVar.b, 0), 0, Shader.TileMode.CLAMP));
                        }
                        if (qp3Var.a()) {
                            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                            float f2 = qp3Var.c;
                            int[] iArr = new int[4];
                            float[] fArr = new float[4];
                            for (int i3 = 0; i3 < 4; i3++) {
                                float fPow = (float) Math.pow(decelerateInterpolator.getInterpolation(r8) * f2, 2.200000047683716d);
                                fArr[i3] = (i3 * 1.0f) / 3.0f;
                                iArr[i3] = Color.argb(fPow, 0.0f, 0.0f, 0.0f);
                            }
                            Paint paint2 = (Paint) vzkVar.c;
                            float f3 = qp3Var.a;
                            paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f3 < 0.01f ? 0.01f : f3, iArr, fArr, Shader.TileMode.CLAMP));
                        }
                    } else {
                        recyclerView.setLayerType(0, null);
                    }
                    recyclerView.invalidate();
                    break;
                }
                break;
            case 3:
                x5f x5fVar = ((zkk) obj2).a;
                int iOrdinal = ((b3c) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                h9o.p();
                                break;
                            }
                        } else if (x5fVar.h) {
                            zpa zpaVar = x5fVar.d;
                            x56 x56VarF = zpa.F();
                            c66 c66Var = ((bs0) new ck0(zpaVar, x56VarF).k.getValue()).a;
                            c66Var.getClass();
                            c66Var.q(6, 1, wr0.c);
                            x5fVar.U0(x56VarF);
                            break;
                        }
                    } else if (x5fVar.h) {
                        zpa zpaVar2 = x5fVar.d;
                        x56 x56VarF2 = zpa.F();
                        c66 c66Var2 = ((bs0) new ck0(zpaVar2, x56VarF2).k.getValue()).a;
                        c66Var2.getClass();
                        c66Var2.q(6, 1, wr0.b);
                        x5fVar.U0(x56VarF2);
                        break;
                    }
                } else if (x5fVar.h) {
                    zpa zpaVar3 = x5fVar.d;
                    x56 x56VarF3 = zpa.F();
                    c66 c66Var3 = ((bs0) new ck0(zpaVar3, x56VarF3).k.getValue()).a;
                    c66Var3.getClass();
                    c66Var3.q(6, 1, wr0.d);
                    x5fVar.U0(x56VarF3);
                    break;
                }
                break;
            case 4:
                ((h5k) obj2).e();
                break;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MainMenuTileLayout mainMenuTileLayout = ((apl) obj2).b;
                if (mainMenuTileLayout.f != zBooleanValue) {
                    mainMenuTileLayout.f = zBooleanValue;
                    mainMenuTileLayout.b();
                    break;
                }
                break;
            case 6:
                zul zulVar = (zul) obj;
                ((BrowserFragment) ((pr) obj2).d).p.a.e(zulVar.a, zulVar.b);
                break;
            case 7:
                ((b4m) obj2).a();
                break;
            case 8:
                ((r4m) obj2).e0((d5m) obj);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xf8.F0(((xpm) obj2).c, bool);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                xbf xbfVar = (xbf) obj2;
                o2g o2gVarJ = ((vbn) xbfVar.f).j();
                if (o2gVarJ != null && o2gVarJ != ((o2g) xbfVar.c)) {
                    xbfVar.c = o2gVarJ;
                    ((ThemeableLottieAnimationView) xbfVar.b).invalidate();
                    xbfVar.E((s75) o2gVarJ.c, null);
                    break;
                }
                break;
            case 11:
                VpnProQuickSettingsTileService vpnProQuickSettingsTileService = (VpnProQuickSettingsTileService) obj2;
                xen xenVar = (xen) obj;
                int i4 = VpnProQuickSettingsTileService.b;
                Tile qsTile = vpnProQuickSettingsTileService.getQsTile();
                if (qsTile != null) {
                    qsTile.setSubtitle(vpnProQuickSettingsTileService.getString(xenVar.b));
                    qsTile.setContentDescription(qsTile.getLabel());
                    qsTile.setState(xenVar.a);
                    qsTile.setIcon(Icon.createWithResource(vpnProQuickSettingsTileService.getApplicationContext(), xenVar.c));
                    qsTile.updateTile();
                    vpnProQuickSettingsTileService.a(xenVar != xen.d);
                    break;
                }
                break;
            case 12:
                List list = (List) obj;
                qkn qknVar = ((nkn) obj2).B;
                if (qknVar != null) {
                    qknVar.j.T(list);
                    break;
                }
                break;
            case 13:
                ukn uknVar = (ukn) obj2;
                if (uknVar.D != null) {
                    if (uknVar.w.c() && (appCompatImageView = uknVar.B) != null) {
                        appCompatImageView.setEnabled(true);
                    }
                    Bundle bundle = ((rkn) uknVar.v.p()).b;
                    if (bundle != null) {
                        string2 = bundle.getString("category");
                        string = bundle.getString("premium_only");
                        bundle.remove("category");
                    } else {
                        string = null;
                    }
                    qkn qknVar2 = uknVar.D;
                    if (qknVar2 != null && !uknVar.J) {
                        if (string2 != null) {
                            ListIterator listIterator = ((ArrayList) qknVar2.j.d).listIterator();
                            while (true) {
                                if (listIterator.hasNext()) {
                                    int iNextIndex = listIterator.nextIndex();
                                    mkb mkbVar = (mkb) listIterator.next();
                                    if ((mkbVar instanceof bkb) && am2.c(((bkb) mkbVar).a).equals(string2)) {
                                        qknVar2.f.x0(iNextIndex);
                                        zD = true;
                                    }
                                } else {
                                    zD = false;
                                }
                            }
                        } else {
                            zD = qknVar2.d();
                        }
                        if (zD) {
                            uknVar.J = true;
                            AppBarLayout appBarLayout = uknVar.C;
                            if (appBarLayout != null) {
                                appBarLayout.l(true, true);
                                uknVar.C.k(false, false, true);
                            }
                        }
                    }
                    if (string != null) {
                        uknVar.I = string.contains("true");
                    }
                    uknVar.D.c(uknVar.I);
                    break;
                }
                break;
            case 14:
                List list2 = (List) obj;
                qkn qknVar3 = ((tln) obj2).B;
                if (qknVar3 != null) {
                    qknVar3.j.T(list2);
                    break;
                }
                break;
            default:
                jmn jmnVar = (jmn) obj2;
                Size size = (Size) obj;
                AspectRatioLayout aspectRatioLayout = jmnVar.z.b;
                if (!Objects.equals(size, aspectRatioLayout.a)) {
                    aspectRatioLayout.a = size;
                    aspectRatioLayout.requestLayout();
                }
                jmnVar.I0(jmnVar.z.j);
                break;
        }
    }
}
