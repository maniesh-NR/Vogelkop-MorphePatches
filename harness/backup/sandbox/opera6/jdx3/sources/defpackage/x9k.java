package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.opera.android.custom_views.FadingScrollView;
import com.opera.android.custom_views.StylingTextView;
import java.util.List;

/* loaded from: classes.dex */
public final class x9k extends PagerAdapter {
    public final List a;
    public final boolean b;

    public x9k(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final int getCount() {
        return this.a.size();
    }

    public final int getItemPosition(Object obj) {
        View view = (View) obj;
        int iIntValue = ((Integer) view.getTag(2131363738)).intValue();
        int iIntValue2 = ((Integer) view.getTag(2131363736)).intValue();
        if (this.b != ((Boolean) view.getTag(2131363737)).booleanValue()) {
            return -2;
        }
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return -2;
            }
            if (((z65) list.get(i)).f.a == iIntValue) {
                if (i == iIntValue2) {
                    return -1;
                }
                view.setTag(2131363736, Integer.valueOf(i));
                return i;
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r3v23, types: [android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    /* JADX WARN: Type inference failed for: r3v39, types: [android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        vzk vzkVar;
        wjh wjhVar;
        i3j i3jVar;
        z65 z65Var = (z65) this.a.get(i);
        Context context = viewGroup.getContext();
        byte b = z65Var.j;
        int i2 = 2131364718;
        int i3 = 2131362512;
        ViewGroup viewGroup2 = null;
        boolean z = this.b;
        switch (b) {
            case 0:
                y65 y65Var = (y65) z65Var.k;
                if (!z) {
                    ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131559367, (ViewGroup) null, false);
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362512, constraintLayoutInflate);
                    if (stylingTextView != null) {
                        ImageView imageView = (ImageView) w1h.j(2131363183, constraintLayoutInflate);
                        if (imageView == null) {
                            i2 = 2131363183;
                        } else if (((FadingScrollView) w1h.j(2131364718, constraintLayoutInflate)) != null) {
                            StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363525, constraintLayoutInflate);
                            if (stylingTextView2 != null) {
                                vzkVar = new vzk(constraintLayoutInflate, imageView, stylingTextView2, stylingTextView);
                                viewGroup2 = (ViewGroup) vzkVar.a;
                                ?? r3 = (StylingTextView) vzkVar.d;
                                ((StylingTextView) vzkVar.c).setText(y65Var.a);
                                r3.setText(y65Var.b);
                                ImageView imageView2 = (ImageView) vzkVar.b;
                                kff.a(imageView2, new wm3(imageView2, z, (StylingTextView) r3, viewGroup2));
                            } else {
                                i2 = 2131363525;
                            }
                        }
                    } else {
                        i2 = 2131362512;
                    }
                    t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
                    break;
                } else {
                    View viewInflate = LayoutInflater.from(context).inflate(2131559368, (ViewGroup) null, false);
                    StylingTextView stylingTextView3 = (StylingTextView) w1h.j(2131362512, viewInflate);
                    if (stylingTextView3 != null) {
                        ImageView imageView3 = (ImageView) w1h.j(2131363183, viewInflate);
                        if (imageView3 != null) {
                            StylingTextView stylingTextView4 = (StylingTextView) w1h.j(2131363525, viewInflate);
                            if (stylingTextView4 != null) {
                                vzkVar = new vzk((FadingScrollView) viewInflate, imageView3, stylingTextView4, stylingTextView3);
                                viewGroup2 = (ViewGroup) vzkVar.a;
                                ?? r32 = (StylingTextView) vzkVar.d;
                                ((StylingTextView) vzkVar.c).setText(y65Var.a);
                                r32.setText(y65Var.b);
                                ImageView imageView22 = (ImageView) vzkVar.b;
                                kff.a(imageView22, new wm3(imageView22, z, (StylingTextView) r32, viewGroup2));
                                break;
                            } else {
                                i3 = 2131363525;
                            }
                        } else {
                            i3 = 2131363183;
                        }
                    }
                    t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                    break;
                }
            case 1:
                dm6 dm6Var = (dm6) z65Var.k;
                if (!z) {
                    ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131559369, (ViewGroup) null, false);
                    StylingTextView stylingTextView5 = (StylingTextView) w1h.j(2131362512, constraintLayoutInflate2);
                    if (stylingTextView5 != null) {
                        View viewJ = w1h.j(2131363183, constraintLayoutInflate2);
                        if (viewJ != null) {
                            zt5 zt5VarB = zt5.b(viewJ);
                            if (((FadingScrollView) w1h.j(2131364718, constraintLayoutInflate2)) != null) {
                                StylingTextView stylingTextView6 = (StylingTextView) w1h.j(2131363525, constraintLayoutInflate2);
                                if (stylingTextView6 != null) {
                                    wjhVar = new wjh(constraintLayoutInflate2, zt5VarB.b, zt5VarB.c, stylingTextView6, stylingTextView5, (byte) 18);
                                    viewGroup2 = (ViewGroup) wjhVar.b;
                                    ?? r33 = (StylingTextView) wjhVar.f;
                                    ((TextView) wjhVar.d).setText(dm6Var.a);
                                    ((StylingTextView) wjhVar.e).setText(dm6Var.b);
                                    r33.setText(dm6Var.c);
                                    ConstraintLayout constraintLayout = (ConstraintLayout) wjhVar.c;
                                    kff.a(constraintLayout, new wm3((View) constraintLayout, z, (StylingTextView) r33, viewGroup2));
                                } else {
                                    i2 = 2131363525;
                                }
                            }
                        } else {
                            i2 = 2131363183;
                        }
                    } else {
                        i2 = 2131362512;
                    }
                    t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i2)));
                    break;
                } else {
                    View viewInflate2 = LayoutInflater.from(context).inflate(2131559371, (ViewGroup) null, false);
                    StylingTextView stylingTextView7 = (StylingTextView) w1h.j(2131362512, viewInflate2);
                    if (stylingTextView7 != null) {
                        View viewJ2 = w1h.j(2131363183, viewInflate2);
                        if (viewJ2 != null) {
                            zt5 zt5VarB2 = zt5.b(viewJ2);
                            StylingTextView stylingTextView8 = (StylingTextView) w1h.j(2131363525, viewInflate2);
                            if (stylingTextView8 != null) {
                                wjhVar = new wjh((FadingScrollView) viewInflate2, zt5VarB2.b, zt5VarB2.c, stylingTextView8, stylingTextView7, (byte) 18);
                                viewGroup2 = (ViewGroup) wjhVar.b;
                                ?? r332 = (StylingTextView) wjhVar.f;
                                ((TextView) wjhVar.d).setText(dm6Var.a);
                                ((StylingTextView) wjhVar.e).setText(dm6Var.b);
                                r332.setText(dm6Var.c);
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) wjhVar.c;
                                kff.a(constraintLayout2, new wm3((View) constraintLayout2, z, (StylingTextView) r332, viewGroup2));
                                break;
                            } else {
                                i3 = 2131363525;
                            }
                        } else {
                            i3 = 2131363183;
                        }
                    }
                    t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i3)));
                    break;
                }
            default:
                t2f t2fVar = (t2f) z65Var.k;
                if (!z) {
                    ConstraintLayout constraintLayoutInflate3 = LayoutInflater.from(context).inflate(2131559377, (ViewGroup) null, false);
                    StylingTextView stylingTextView9 = (StylingTextView) w1h.j(2131362512, constraintLayoutInflate3);
                    if (stylingTextView9 != null) {
                        View viewJ3 = w1h.j(2131363183, constraintLayoutInflate3);
                        if (viewJ3 != null) {
                            om9 om9VarB = om9.b(viewJ3);
                            if (((FadingScrollView) w1h.j(2131364718, constraintLayoutInflate3)) != null) {
                                StylingTextView stylingTextView10 = (StylingTextView) w1h.j(2131363525, constraintLayoutInflate3);
                                if (stylingTextView10 != null) {
                                    i3jVar = new i3j(constraintLayoutInflate3, om9VarB.b, stylingTextView10, stylingTextView9);
                                    viewGroup2 = (ViewGroup) i3jVar.a;
                                    ?? r34 = (StylingTextView) i3jVar.d;
                                    ((StylingTextView) i3jVar.c).setText(t2fVar.a);
                                    r34.setText(t2fVar.b);
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) i3jVar.b;
                                    kff.a(constraintLayout3, new wm3((View) constraintLayout3, z, (StylingTextView) r34, viewGroup2));
                                } else {
                                    i2 = 2131363525;
                                }
                            }
                        } else {
                            i2 = 2131363183;
                        }
                    } else {
                        i2 = 2131362512;
                    }
                    t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(i2)));
                    break;
                } else {
                    View viewInflate3 = LayoutInflater.from(context).inflate(2131559378, (ViewGroup) null, false);
                    StylingTextView stylingTextView11 = (StylingTextView) w1h.j(2131362512, viewInflate3);
                    if (stylingTextView11 != null) {
                        View viewJ4 = w1h.j(2131363183, viewInflate3);
                        if (viewJ4 != null) {
                            om9 om9VarB2 = om9.b(viewJ4);
                            StylingTextView stylingTextView12 = (StylingTextView) w1h.j(2131363525, viewInflate3);
                            if (stylingTextView12 != null) {
                                i3jVar = new i3j((FadingScrollView) viewInflate3, om9VarB2.b, stylingTextView12, stylingTextView11);
                                viewGroup2 = (ViewGroup) i3jVar.a;
                                ?? r342 = (StylingTextView) i3jVar.d;
                                ((StylingTextView) i3jVar.c).setText(t2fVar.a);
                                r342.setText(t2fVar.b);
                                ConstraintLayout constraintLayout32 = (ConstraintLayout) i3jVar.b;
                                kff.a(constraintLayout32, new wm3((View) constraintLayout32, z, (StylingTextView) r342, viewGroup2));
                                break;
                            } else {
                                i3 = 2131363525;
                            }
                        } else {
                            i3 = 2131363183;
                        }
                    }
                    t3p.q("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i3)));
                    break;
                }
        }
        viewGroup.addView(viewGroup2);
        viewGroup2.setTag(2131363737, Boolean.valueOf(z));
        viewGroup2.setTag(2131363738, Integer.valueOf(z65Var.f.a));
        viewGroup2.setTag(2131363736, Integer.valueOf(i));
        return viewGroup2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
