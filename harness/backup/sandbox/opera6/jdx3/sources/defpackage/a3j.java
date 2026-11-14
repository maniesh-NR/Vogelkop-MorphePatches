package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.MakeOperaDefaultBanner;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.speed_dial.SpeedDialShapePreview;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.MenuSettingsListItem;
import java.util.Iterator;
import org.chromium.content.browser.selection.SmartSelectionClient;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class a3j implements lo7, jtl, xjj, zjj, ktn, n5o, v0k, bcf {
    public final /* synthetic */ byte a;

    public /* synthetic */ a3j(byte b) {
        this.a = b;
    }

    @Override // defpackage.zjj
    public final boolean accept(Object obj) {
        return true;
    }

    public final Object e(WebContentsImpl webContentsImpl) {
        return new SmartSelectionClient(webContentsImpl);
    }

    public final Iterator f(vr3 vr3Var, CharSequence charSequence) {
        return new t0k(vr3Var, charSequence);
    }

    public final Object g(Object obj) {
        return qyn.G((Uri) obj);
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        switch (this.a) {
            case 2:
                tcj tcjVar = (tcj) obj;
                ucj ucjVar = (ucj) iVar;
                Context context = ((i) ucjVar).itemView.getContext();
                q5g q5gVar = ucjVar.b;
                TextView textView = (TextView) q5gVar.c;
                wcj wcjVar = tcjVar.a;
                textView.setText(wcjVar.d(context));
                ((ImageView) q5gVar.d).setImageDrawable(wcjVar.b(context));
                ((i) ucjVar).itemView.setOnClickListener(new j5g(ucjVar, tcjVar, (byte) 13));
                break;
            default:
                break;
        }
    }

    @Override // defpackage.jtl
    public final Object k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.a) {
            case 1:
                xtb[] xtbVarArr = k6j.x;
                View viewInflate = layoutInflater.inflate(2131558901, viewGroup, false);
                viewGroup.addView(viewInflate);
                int i = 2131363386;
                MakeOperaDefaultBanner makeOperaDefaultBanner = (MakeOperaDefaultBanner) w1h.j(2131363386, viewInflate);
                if (makeOperaDefaultBanner != null) {
                    i = 2131364165;
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131364165, viewInflate);
                    if (stylingTextView != null) {
                        i = 2131364245;
                        MenuSettingsListItem menuSettingsListItemJ = w1h.j(2131364245, viewInflate);
                        if (menuSettingsListItemJ != null) {
                            i = 2131364252;
                            OperaListItem operaListItem = (OperaListItem) w1h.j(2131364252, viewInflate);
                            if (operaListItem != null) {
                                i = 2131364262;
                                MenuSettingsListItem menuSettingsListItemJ2 = w1h.j(2131364262, viewInflate);
                                if (menuSettingsListItemJ2 != null) {
                                    i = 2131364263;
                                    OperaListItem operaListItem2 = (OperaListItem) w1h.j(2131364263, viewInflate);
                                    if (operaListItem2 != null) {
                                        i = 2131364267;
                                        MenuSettingsListItem menuSettingsListItemJ3 = w1h.j(2131364267, viewInflate);
                                        if (menuSettingsListItemJ3 != null) {
                                            i = 2131364280;
                                            OperaListItem operaListItem3 = (OperaListItem) w1h.j(2131364280, viewInflate);
                                            if (operaListItem3 != null) {
                                                i = 2131364292;
                                                MenuSettingsListItem menuSettingsListItemJ4 = w1h.j(2131364292, viewInflate);
                                                if (menuSettingsListItemJ4 != null) {
                                                    i = 2131364299;
                                                    MenuSettingsListItem menuSettingsListItemJ5 = w1h.j(2131364299, viewInflate);
                                                    if (menuSettingsListItemJ5 != null) {
                                                        i = 2131364313;
                                                        MenuSettingsListItem menuSettingsListItemJ6 = w1h.j(2131364313, viewInflate);
                                                        if (menuSettingsListItemJ6 != null) {
                                                            i = 2131364318;
                                                            OperaListItem operaListItem4 = (OperaListItem) w1h.j(2131364318, viewInflate);
                                                            if (operaListItem4 != null) {
                                                                i = 2131364321;
                                                                MenuSettingsListItem menuSettingsListItemJ7 = w1h.j(2131364321, viewInflate);
                                                                if (menuSettingsListItemJ7 != null) {
                                                                    i = 2131364327;
                                                                    MenuSettingsListItem menuSettingsListItemJ8 = w1h.j(2131364327, viewInflate);
                                                                    if (menuSettingsListItemJ8 != null) {
                                                                        i = 2131364329;
                                                                        MenuSettingsListItem menuSettingsListItemJ9 = w1h.j(2131364329, viewInflate);
                                                                        if (menuSettingsListItemJ9 != null) {
                                                                            i = 2131364335;
                                                                            MenuSettingsListItem menuSettingsListItemJ10 = w1h.j(2131364335, viewInflate);
                                                                            if (menuSettingsListItemJ10 != null) {
                                                                                i = 2131364349;
                                                                                MenuSettingsListItem menuSettingsListItemJ11 = w1h.j(2131364349, viewInflate);
                                                                                if (menuSettingsListItemJ11 != null) {
                                                                                    i = 2131364374;
                                                                                    OperaListItem operaListItem5 = (OperaListItem) w1h.j(2131364374, viewInflate);
                                                                                    if (operaListItem5 != null) {
                                                                                        i = 2131364378;
                                                                                        OperaListItem operaListItem6 = (OperaListItem) w1h.j(2131364378, viewInflate);
                                                                                        if (operaListItem6 != null) {
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                xtb[] xtbVarArr2 = szj.w;
                View viewInflate2 = layoutInflater.inflate(2131558903, viewGroup, false);
                viewGroup.addView(viewInflate2);
                int i2 = 2131364286;
                OperaListItem operaListItem7 = (OperaListItem) w1h.j(2131364286, viewInflate2);
                if (operaListItem7 != null) {
                    i2 = 2131364307;
                    OperaListItem operaListItem8 = (OperaListItem) w1h.j(2131364307, viewInflate2);
                    if (operaListItem8 != null) {
                        i2 = 2131364340;
                        OperaListItem operaListItem9 = (OperaListItem) w1h.j(2131364340, viewInflate2);
                        if (operaListItem9 != null) {
                            i2 = 2131364346;
                            if (((StylingTextView) w1h.j(2131364346, viewInflate2)) != null) {
                                i2 = 2131364347;
                                ConstraintLayout constraintLayoutJ = w1h.j(2131364347, viewInflate2);
                                if (constraintLayoutJ != null) {
                                    int i3 = 2131364404;
                                    ConstraintLayout constraintLayout = (SpeedDialShapePreview) w1h.j(2131364404, constraintLayoutJ);
                                    if (constraintLayout != null) {
                                        i3 = 2131364405;
                                        SpeedDialShapePreview speedDialShapePreview = (SpeedDialShapePreview) w1h.j(2131364405, constraintLayoutJ);
                                        if (speedDialShapePreview != null) {
                                            i3 = 2131364406;
                                            SpeedDialShapePreview speedDialShapePreview2 = (SpeedDialShapePreview) w1h.j(2131364406, constraintLayoutJ);
                                            if (speedDialShapePreview2 != null) {
                                                vs vsVar = new vs((ViewGroup) constraintLayoutJ, (View) constraintLayout, (Object) speedDialShapePreview, (Object) speedDialShapePreview2, (byte) 20);
                                                i2 = 2131364348;
                                                if (((SeparatorView) w1h.j(2131364348, viewInflate2)) != null) {
                                                    i2 = 2131364351;
                                                    if (((SeparatorView) w1h.j(2131364351, viewInflate2)) != null) {
                                                        i2 = 2131364352;
                                                        LinearLayout linearLayout = (LinearLayout) w1h.j(2131364352, viewInflate2);
                                                        if (linearLayout != null) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    t3p.q("Missing required view with ID: ".concat(constraintLayoutJ.getResources().getResourceName(i3)));
                                    break;
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
                break;
            default:
                View viewInflate3 = layoutInflater.inflate(2131558904, viewGroup, false);
                viewGroup.addView(viewInflate3);
                int i4 = 2131364276;
                OperaListItem operaListItem10 = (OperaListItem) w1h.j(2131364276, viewInflate3);
                if (operaListItem10 != null) {
                    i4 = 2131364278;
                    OperaListItem operaListItem11 = (OperaListItem) w1h.j(2131364278, viewInflate3);
                    if (operaListItem11 != null) {
                        i4 = 2131364288;
                        OperaListItem operaListItem12 = (OperaListItem) w1h.j(2131364288, viewInflate3);
                        if (operaListItem12 != null) {
                            i4 = 2131364311;
                            OperaListItem operaListItem13 = (OperaListItem) w1h.j(2131364311, viewInflate3);
                            if (operaListItem13 != null) {
                                i4 = 2131364315;
                                OperaListItem operaListItem14 = (OperaListItem) w1h.j(2131364315, viewInflate3);
                                if (operaListItem14 != null) {
                                    i4 = 2131364324;
                                    OperaListItem operaListItem15 = (OperaListItem) w1h.j(2131364324, viewInflate3);
                                    if (operaListItem15 != null) {
                                        i4 = 2131364336;
                                        OperaListItem operaListItem16 = (OperaListItem) w1h.j(2131364336, viewInflate3);
                                        if (operaListItem16 != null) {
                                            i4 = 2131364337;
                                            OperaListItem operaListItem17 = (OperaListItem) w1h.j(2131364337, viewInflate3);
                                            if (operaListItem17 != null) {
                                                i4 = 2131364345;
                                                OperaListItem operaListItem18 = (OperaListItem) w1h.j(2131364345, viewInflate3);
                                                if (operaListItem18 != null) {
                                                    i4 = 2131364353;
                                                    OperaListItem operaListItem19 = (OperaListItem) w1h.j(2131364353, viewInflate3);
                                                    if (operaListItem19 != null) {
                                                        i4 = 2131364379;
                                                        OperaListItem operaListItem20 = (OperaListItem) w1h.j(2131364379, viewInflate3);
                                                        if (operaListItem20 != null) {
                                                            i4 = 2131364381;
                                                            OperaListItem operaListItem21 = (OperaListItem) w1h.j(2131364381, viewInflate3);
                                                            if (operaListItem21 != null) {
                                                                i4 = 2131365071;
                                                                RecyclerView recyclerViewJ = w1h.j(2131365071, viewInflate3);
                                                                if (recyclerViewJ != null) {
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
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i4)));
                break;
        }
        return null;
    }

    public final g3o l0(View view, g3o g3oVar) {
        switch (this.a) {
            case 13:
                r9b r9bVarI = g3oVar.a.i(519);
                view.setPadding(0, r9bVarI.b, 0, r9bVarI.d);
                break;
            default:
                view.setPadding(0, g3oVar.a.i(519).b, 0, 0);
                break;
        }
        return g3oVar;
    }

    @Override // defpackage.lo7
    public final no7 x(Context context) {
        switch (this.a) {
            case 0:
                return new e3j(context, 17, "dyn.services.cred");
            case 11:
                return new k7k(context, k7k.m, "start_page_settings");
            default:
                return new wok(context, 17, "suggested_sites");
        }
    }
}
