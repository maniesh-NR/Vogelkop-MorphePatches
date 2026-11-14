package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.PowerMonitor;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.leanplum.ActionContext;
import com.leanplum.messagetemplates.OperaConfigBundleSheet;
import com.leanplum.messagetemplates.OperaSubscriptionDialog;
import com.leanplum.messagetemplates.OperaSubscriptionSheet;
import com.leanplum.messagetemplates.OperaWallpaperSheet;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.CircleImageView;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.MenuSettingsListItem;
import com.usercentrics.sdk.PredefinedUIAlertDialogFactory;
import java.util.Arrays;
import java.util.HashSet;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class odf implements bcf, n5o, jtl, xsi, dkj, ktn, jr9, fn8 {
    public final /* synthetic */ byte a;

    public /* synthetic */ odf(byte b) {
        this.a = b;
    }

    public /* synthetic */ odf(Object obj, byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ PowerMonitor d(Object obj) {
        return (PowerMonitor) obj;
    }

    public static /* synthetic */ void h(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    private final void m(Context context, boolean z) {
    }

    @Override // defpackage.dkj
    public final void a() {
    }

    public final Object apply(Object obj) {
        return f1h.b;
    }

    @Override // defpackage.xsi
    public final void b(MenuItem menuItem, boolean z) {
        menuItem.setVisible(!z);
    }

    @Override // defpackage.fn8
    public final cn8[] createExtractors() {
        return new cn8[]{new u8h()};
    }

    public final Object e(WebContentsImpl webContentsImpl) {
        return new yng();
    }

    public final Object g(Object obj) {
        switch (this.a) {
            case 1:
                String str = (String) obj;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.setFlags(335544320);
                intent.addCategory("android.intent.category.BROWSABLE");
                HashSet hashSet = mdb.a;
                intent.putExtra("externally_handled", true);
                ResolveInfo resolveInfoB = qvf.b(65600, intent);
                if (resolveInfoB == null || resolveInfoB.activityInfo == null || bpd.C(Arrays.asList(resolveInfoB)).isEmpty()) {
                    return null;
                }
                PackageManager packageManager = t8.a.getPackageManager();
                return new ogf(str, intent, resolveInfoB.loadIcon(packageManager), packageManager.getApplicationLabel(resolveInfoB.activityInfo.applicationInfo), resolveInfoB.activityInfo.packageName);
            case 2:
            case 3:
            case 4:
            default:
                return OperaWallpaperSheet.initializeSheetRequest$lambda$0((ActionContext) obj);
            case 5:
                return OperaConfigBundleSheet.initializeSheetRequest$lambda$0((ActionContext) obj);
            case 6:
                return OperaSubscriptionDialog.loadResource$lambda$1((ActionContext) obj);
            case 7:
                return OperaSubscriptionSheet.loadResource$lambda$1((ActionContext) obj);
        }
    }

    @Override // defpackage.jtl
    public final Object k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.a) {
            case 13:
                View viewInflate = layoutInflater.inflate(2131558889, viewGroup, false);
                viewGroup.addView(viewInflate);
                int i = 2131364226;
                OperaListItem operaListItem = (OperaListItem) w1h.j(2131364226, viewInflate);
                if (operaListItem != null) {
                    i = 2131364229;
                    OperaListItem operaListItem2 = (OperaListItem) w1h.j(2131364229, viewInflate);
                    if (operaListItem2 != null) {
                        i = 2131364230;
                        OperaListItem operaListItem3 = (OperaListItem) w1h.j(2131364230, viewInflate);
                        if (operaListItem3 != null) {
                            i = 2131364232;
                            OperaListItem operaListItem4 = (OperaListItem) w1h.j(2131364232, viewInflate);
                            if (operaListItem4 != null) {
                                i = 2131364233;
                                if (((SeparatorView) w1h.j(2131364233, viewInflate)) != null) {
                                    i = 2131364235;
                                    OperaListItem operaListItem5 = (OperaListItem) w1h.j(2131364235, viewInflate);
                                    if (operaListItem5 != null) {
                                        i = 2131364236;
                                        OperaListItem operaListItem6 = (OperaListItem) w1h.j(2131364236, viewInflate);
                                        if (operaListItem6 != null) {
                                            i = 2131364237;
                                            OperaListItem operaListItem7 = (OperaListItem) w1h.j(2131364237, viewInflate);
                                            if (operaListItem7 != null) {
                                                i = 2131364238;
                                                if (((SeparatorView) w1h.j(2131364238, viewInflate)) != null) {
                                                    i = 2131364239;
                                                    OperaListItem operaListItem8 = (OperaListItem) w1h.j(2131364239, viewInflate);
                                                    if (operaListItem8 != null) {
                                                        i = 2131364242;
                                                        OperaListItem operaListItem9 = (OperaListItem) w1h.j(2131364242, viewInflate);
                                                        if (operaListItem9 != null) {
                                                            i = 2131364243;
                                                            OperaListItem operaListItem10 = (OperaListItem) w1h.j(2131364243, viewInflate);
                                                            if (operaListItem10 != null) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                break;
            case 17:
                View viewInflate2 = layoutInflater.inflate(2131558891, viewGroup, false);
                viewGroup.addView(viewInflate2);
                int i2 = 2131364247;
                ConstraintLayout constraintLayoutJ = w1h.j(2131364247, viewInflate2);
                if (constraintLayoutJ != null) {
                    i2 = 2131364248;
                    CircleImageView circleImageView = (CircleImageView) w1h.j(2131364248, viewInflate2);
                    if (circleImageView != null) {
                        i2 = 2131364249;
                        ImageView imageView = (ImageView) w1h.j(2131364249, viewInflate2);
                        if (imageView != null) {
                            i2 = 2131364250;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131364250, viewInflate2);
                            if (stylingTextView != null) {
                                i2 = 2131364251;
                                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131364251, viewInflate2);
                                if (stylingTextView2 != null) {
                                    i2 = 2131364256;
                                    MenuSettingsListItem menuSettingsListItemJ = w1h.j(2131364256, viewInflate2);
                                    if (menuSettingsListItemJ != null) {
                                        i2 = 2131364269;
                                        MenuSettingsListItem menuSettingsListItemJ2 = w1h.j(2131364269, viewInflate2);
                                        if (menuSettingsListItemJ2 != null) {
                                            i2 = 2131364274;
                                            MenuSettingsListItem menuSettingsListItemJ3 = w1h.j(2131364274, viewInflate2);
                                            if (menuSettingsListItemJ3 != null) {
                                                i2 = 2131364326;
                                                MenuSettingsListItem menuSettingsListItemJ4 = w1h.j(2131364326, viewInflate2);
                                                if (menuSettingsListItemJ4 != null) {
                                                    i2 = 2131364354;
                                                    MenuSettingsListItem menuSettingsListItemJ5 = w1h.j(2131364354, viewInflate2);
                                                    if (menuSettingsListItemJ5 != null) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
                break;
            default:
                View viewInflate3 = layoutInflater.inflate(2131558894, viewGroup, false);
                viewGroup.addView(viewInflate3);
                int i3 = 2131362007;
                OperaIconedMessage operaIconedMessage = (OperaIconedMessage) w1h.j(2131362007, viewInflate3);
                if (operaIconedMessage != null) {
                    i3 = 2131364252;
                    OperaListItem operaListItem11 = (OperaListItem) w1h.j(2131364252, viewInflate3);
                    if (operaListItem11 != null) {
                        i3 = 2131364265;
                        OperaListItem operaListItem12 = (OperaListItem) w1h.j(2131364265, viewInflate3);
                        if (operaListItem12 != null) {
                            i3 = 2131364271;
                            OperaListItem operaListItem13 = (OperaListItem) w1h.j(2131364271, viewInflate3);
                            if (operaListItem13 != null) {
                                i3 = 2131364272;
                                OperaListItem operaListItem14 = (OperaListItem) w1h.j(2131364272, viewInflate3);
                                if (operaListItem14 != null) {
                                    i3 = 2131364277;
                                    OperaListItem operaListItem15 = (OperaListItem) w1h.j(2131364277, viewInflate3);
                                    if (operaListItem15 != null) {
                                        i3 = 2131364279;
                                        OperaListItem operaListItem16 = (OperaListItem) w1h.j(2131364279, viewInflate3);
                                        if (operaListItem16 != null) {
                                            i3 = 2131364333;
                                            OperaListItem operaListItem17 = (OperaListItem) w1h.j(2131364333, viewInflate3);
                                            if (operaListItem17 != null) {
                                                i3 = 2131364338;
                                                OperaListItem operaListItem18 = (OperaListItem) w1h.j(2131364338, viewInflate3);
                                                if (operaListItem18 != null) {
                                                    i3 = 2131364344;
                                                    OperaListItem operaListItem19 = (OperaListItem) w1h.j(2131364344, viewInflate3);
                                                    if (operaListItem19 != null) {
                                                        i3 = 2131364374;
                                                        OperaListItem operaListItem20 = (OperaListItem) w1h.j(2131364374, viewInflate3);
                                                        if (operaListItem20 != null) {
                                                            i3 = 2131364378;
                                                            OperaListItem operaListItem21 = (OperaListItem) w1h.j(2131364378, viewInflate3);
                                                            if (operaListItem21 != null) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i3)));
                break;
        }
        return null;
    }

    public final void l(Context context, boolean z) {
        switch (this.a) {
            case 11:
                if (!z) {
                    String[] strArr = OperaApplication.K;
                    x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
                    if (x5fVar.h) {
                        zpa zpaVar = x5fVar.d;
                        x56 x56VarF = zpa.F();
                        x56VarF.H(zpaVar).x(zpaVar).d(2, 1);
                        x5fVar.U0(x56VarF);
                        break;
                    }
                } else {
                    String[] strArr2 = OperaApplication.K;
                    x5f x5fVar2 = ((OperaApplication) context.getApplicationContext()).L().c;
                    if (x5fVar2.h) {
                        zpa zpaVar2 = x5fVar2.d;
                        x56 x56VarF2 = zpa.F();
                        x56VarF2.H(zpaVar2).x(zpaVar2).d(1, 1);
                        x5fVar2.U0(x56VarF2);
                        break;
                    }
                }
                break;
        }
    }

    public final g3o l0(View view, g3o g3oVar) {
        switch (this.a) {
            case 0:
                r9b r9bVarI = g3oVar.a.i(519);
                view.setPadding(r9bVarI.a, r9bVarI.b, r9bVarI.c, r9bVarI.d);
                return g3oVar;
            case 1:
            default:
                return PredefinedUIAlertDialogFactory.applySafeInsets$lambda$10(view, g3oVar);
            case 2:
                p37.q0(g3oVar.a.i(519).b, view);
                return g3oVar;
        }
    }
}
