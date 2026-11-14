package defpackage;

import android.text.ParcelableSpan;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassification;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.Slider;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.autofill.Address;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class mc8 implements fn8, r8, jtl, grj, xjj, yjj {
    public static final mc8 b = new mc8(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ mc8(byte b2) {
        this.a = b2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: d0 */
    public static /* synthetic */ void b(Object obj, String str) throws d0 {
        throw new d0(str + obj);
    }

    public final ParcelableSpan a(Object obj) {
        switch (this.a) {
            case 4:
                return new URLSpan((String) obj);
            case 5:
                Float f = (Float) obj;
                if (f.floatValue() >= 0.0f) {
                    return new AbsoluteSizeSpan(Math.round(f.floatValue()));
                }
                return null;
            case 6:
                Integer num = (Integer) obj;
                if (num.intValue() == 1) {
                    return new StyleSpan(1);
                }
                if (num.intValue() == 2) {
                    return new StyleSpan(2);
                }
                if (num.intValue() == 3) {
                    return new UnderlineSpan();
                }
                if (num.intValue() == 4) {
                    return new StrikethroughSpan();
                }
                return null;
            case 7:
                Integer num2 = (Integer) obj;
                if (num2.intValue() == 1) {
                    return new SubscriptSpan();
                }
                if (num2.intValue() == 2) {
                    return new SuperscriptSpan();
                }
                return null;
            case 8:
                return new ForegroundColorSpan(((Integer) obj).intValue());
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new BackgroundColorSpan(((Integer) obj).intValue());
            default:
                String str = (String) obj;
                if (str.isEmpty()) {
                    return null;
                }
                return new TypefaceSpan(str);
        }
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        switch (this.a) {
            case SizeUtil.textSize1 /* 22 */:
                Object objInflate = p37.U(viewGroup).inflate(2131558436, viewGroup, false);
                if (objInflate == null) {
                    t3p.q("rootView");
                    break;
                } else {
                    break;
                }
            case 23:
                Object objInflate2 = p37.U(viewGroup).inflate(2131558435, viewGroup, false);
                if (objInflate2 == null) {
                    t3p.q("rootView");
                    break;
                } else {
                    break;
                }
            case SizeUtil.textSize2 /* 24 */:
            default:
                Object objInflate3 = p37.U(viewGroup).inflate(2131558434, viewGroup, false);
                if (objInflate3 == null) {
                    t3p.q("rootView");
                    break;
                } else {
                    break;
                }
            case 25:
                Object objInflate4 = p37.U(viewGroup).inflate(2131558433, viewGroup, false);
                if (objInflate4 == null) {
                    t3p.q("rootView");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    @Override // defpackage.fn8
    public final cn8[] createExtractors() {
        switch (this.a) {
            case 2:
                return new cn8[]{new n7()};
            default:
                return new cn8[]{new p7()};
        }
    }

    @Override // defpackage.grj
    public final TextClassification e0() {
        return null;
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        switch (this.a) {
            case 21:
                tf tfVar = (tf) iVar;
                pc pcVar = ((vf) obj).a;
                if (pcVar != tfVar.f) {
                    tfVar.f = pcVar;
                    tfVar.U();
                    break;
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                yq1 yq1Var = ((fk) iVar).b;
                yq1Var.setText(((bk) obj).W.a(yq1Var.getResources()));
                break;
            default:
                Address address = (Address) obj;
                ww wwVar = (ww) iVar;
                vs vsVar = wwVar.b;
                yq1 yq1Var2 = (StylingTextView) vsVar.c;
                String str = address.c;
                int length = str.length();
                String strV = address.b;
                if (length > 0) {
                    strV = sko.v(strV, " - ", str);
                }
                yq1Var2.setText(strV);
                ((StylingTextView) vsVar.e).setText(address.n);
                ((i) wwVar).itemView.setOnClickListener(new nf(wwVar.c, address, (byte) 5));
                ((ImageView) vsVar.d).setOnClickListener(new nf(wwVar, address, (byte) 6));
                break;
        }
    }

    @Override // defpackage.jtl
    public final Object k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.a) {
            case SizeUtil.textSize0_1 /* 18 */:
                View viewInflate = layoutInflater.inflate(2131558867, viewGroup, false);
                viewGroup.addView(viewInflate);
                int i = 2131364283;
                OperaListItem operaListItem = (OperaListItem) w1h.j(2131364283, viewInflate);
                if (operaListItem != null) {
                    i = 2131364293;
                    OperaListItem operaListItem2 = (OperaListItem) w1h.j(2131364293, viewInflate);
                    if (operaListItem2 != null) {
                        i = 2131364334;
                        OperaListItem operaListItem3 = (OperaListItem) w1h.j(2131364334, viewInflate);
                        if (operaListItem3 != null) {
                            i = 2131364369;
                            OperaListItem operaListItem4 = (OperaListItem) w1h.j(2131364369, viewInflate);
                            if (operaListItem4 != null) {
                                i = 2131364382;
                                FrameLayout frameLayout = (FrameLayout) w1h.j(2131364382, viewInflate);
                                if (frameLayout != null) {
                                    i = 2131364383;
                                    StylingImageButton stylingImageButton = (StylingImageButton) w1h.j(2131364383, viewInflate);
                                    if (stylingImageButton != null) {
                                        i = 2131364384;
                                        if (((StylingTextView) w1h.j(2131364384, viewInflate)) != null) {
                                            i = 2131364385;
                                            StylingImageButton stylingImageButton2 = (StylingImageButton) w1h.j(2131364385, viewInflate);
                                            if (stylingImageButton2 != null) {
                                                i = 2131364386;
                                                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131364386, viewInflate);
                                                if (stylingTextView != null) {
                                                    i = 2131364387;
                                                    StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131364387, viewInflate);
                                                    if (stylingTextView2 != null) {
                                                        i = 2131364388;
                                                        TextView textView = (TextView) w1h.j(2131364388, viewInflate);
                                                        if (textView != null) {
                                                            i = 2131364389;
                                                            LinearLayout linearLayout = (LinearLayout) w1h.j(2131364389, viewInflate);
                                                            if (linearLayout != null) {
                                                                i = 2131364390;
                                                                ImageView imageView = (ImageView) w1h.j(2131364390, viewInflate);
                                                                if (imageView != null) {
                                                                    i = 2131364391;
                                                                    StylingTextView stylingTextView3 = (StylingTextView) w1h.j(2131364391, viewInflate);
                                                                    if (stylingTextView3 != null) {
                                                                        i = 2131364392;
                                                                        Slider sliderJ = w1h.j(2131364392, viewInflate);
                                                                        if (sliderJ != null) {
                                                                            i = 2131364393;
                                                                            if (((LayoutDirectionLinearLayout) w1h.j(2131364393, viewInflate)) != null) {
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
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                break;
            case 27:
                View viewInflate2 = layoutInflater.inflate(2131558887, viewGroup, false);
                viewGroup.addView(viewInflate2);
                int i2 = 2131362049;
                MaterialAutoCompleteTextView materialAutoCompleteTextViewJ = w1h.j(2131362049, viewInflate2);
                if (materialAutoCompleteTextViewJ != null) {
                    i2 = 2131362051;
                    TextInputLayout textInputLayoutJ = w1h.j(2131362051, viewInflate2);
                    if (textInputLayoutJ != null) {
                        i2 = 2131362247;
                        MaterialButton materialButtonJ = w1h.j(2131362247, viewInflate2);
                        if (materialButtonJ != null) {
                            i2 = 2131362660;
                            if (w1h.j(2131362660, viewInflate2) != null) {
                                i2 = 2131363037;
                                StylingImageButton stylingImageButton3 = (StylingImageButton) w1h.j(2131363037, viewInflate2);
                                if (stylingImageButton3 != null) {
                                    i2 = 2131363859;
                                    OperaTextInputEditText operaTextInputEditText = (OperaTextInputEditText) w1h.j(2131363859, viewInflate2);
                                    if (operaTextInputEditText != null) {
                                        i2 = 2131363861;
                                        TextInputLayout textInputLayoutJ2 = w1h.j(2131363861, viewInflate2);
                                        if (textInputLayoutJ2 != null) {
                                            i2 = 2131364118;
                                            MaterialButton materialButtonJ2 = w1h.j(2131364118, viewInflate2);
                                            if (materialButtonJ2 != null) {
                                                i2 = 2131364511;
                                                if (((Space) w1h.j(2131364511, viewInflate2)) != null) {
                                                    i2 = 2131364984;
                                                    OperaTextInputEditText operaTextInputEditText2 = (OperaTextInputEditText) w1h.j(2131364984, viewInflate2);
                                                    if (operaTextInputEditText2 != null) {
                                                        i2 = 2131364985;
                                                        TextInputLayout textInputLayoutJ3 = w1h.j(2131364985, viewInflate2);
                                                        if (textInputLayoutJ3 != null) {
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
                t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
                break;
            default:
                View viewInflate3 = layoutInflater.inflate(2131558870, viewGroup, false);
                viewGroup.addView(viewInflate3);
                int i3 = 2131364227;
                SeparatorView separatorView = (SeparatorView) w1h.j(2131364227, viewInflate3);
                if (separatorView != null) {
                    i3 = 2131364228;
                    RecyclerView recyclerViewJ = w1h.j(2131364228, viewInflate3);
                    if (recyclerViewJ != null) {
                        i3 = 2131364240;
                        OperaListItem operaListItem5 = (OperaListItem) w1h.j(2131364240, viewInflate3);
                        if (operaListItem5 != null) {
                            i3 = 2131364253;
                            View viewJ = w1h.j(2131364253, viewInflate3);
                            if (viewJ != null) {
                                break;
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i3)));
                break;
        }
        return null;
    }
}
