package com.leanplum.messagetemplates;

import android.content.SharedPreferences;
import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.internal.Constants;
import com.leanplum.messagetemplates.Offer;
import com.opera.android.BrowserActivity;
import com.opera.api.Callback;
import defpackage.amk;
import defpackage.bmk;
import defpackage.cmk;
import defpackage.dmk;
import defpackage.eg0;
import defpackage.fmk;
import defpackage.ni6;
import defpackage.orb;
import defpackage.rw7;
import defpackage.rzj;
import defpackage.sko;
import defpackage.sw7;
import defpackage.tw7;
import defpackage.ulk;
import defpackage.yjb;
import defpackage.ylk;
import defpackage.zlk;
import defpackage.zsk;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u001a1\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0004\u0012\u00020\u00050\u00032\u001a\u0010\f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0013\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a?\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u001a\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00150\tH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a?\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0003H\u0002¢\u0006\u0004\b!\u0010\"\u001a/\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010)\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*\"\u001a\u0010+\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/leanplum/ActionContext;", "actionContext", "Lcom/opera/api/Callback;", "Ltw7;", "", "Lcom/leanplum/messagetemplates/DiscardInfo;", "callback", "applySubscriptionOffers", "(Lcom/leanplum/ActionContext;Lcom/opera/api/Callback;)V", "", "", "", "rawOffers", "Lcom/leanplum/messagetemplates/Offer;", "parseAndValidateOffers", "(Ljava/util/List;)Ltw7;", "offers", "Lfmk;", "subscriptionPlansProvider", "applyOffersToProvider", "(Ljava/util/List;Lfmk;Lcom/opera/api/Callback;)V", "Lkotlin/Pair;", "appliedProductOfferIds", "findNonAppliedOfferIds", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "verifyOffersApplied", "(Lfmk;Ljava/util/List;Lcom/opera/api/Callback;)V", "", "validateOffers", "(Ljava/util/List;)Z", "offer", "validateOffer", "(Lcom/leanplum/messagetemplates/Offer;)Z", "getSubscriptionPlansProvider", "()Ltw7;", "offerMaps", "parseOffers", "(Ljava/util/List;)Ljava/util/List;", Constants.Params.MESSAGE, "Leg0;", "reason", "makeDiscardInfo", "(Ljava/lang/String;Leg0;)Lcom/leanplum/messagetemplates/DiscardInfo;", "DISCARD_MESSAGE_PREFIX", "Ljava/lang/String;", "getDISCARD_MESSAGE_PREFIX$annotations", "()V", "app"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SubscriptionOffersKt {

    @NotNull
    public static final String DISCARD_MESSAGE_PREFIX = "Subscription: ";

    public static final void applyOffersToProvider(@NotNull List<Offer> list, @NotNull fmk fmkVar, @NotNull Callback callback) throws JSONException {
        List<Offer> list2 = list;
        int iA = qbd.a(k95.o(list2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Offer offer : list2) {
            linkedHashMap.put(offer.getProductId(), new ulk(offer.getOfferId(), offer.getExpirationTime(), offer.isPersonalized()));
        }
        ni6 ni6Var = (ni6) fmkVar.e.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(qbd.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ulk ulkVar = (ulk) entry.getValue();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("offer_id", orb.t(ulkVar.a));
                try {
                    jSONObject.put("expiration_time", orb.t(((SimpleDateFormat) yjb.a.get()).format(ulkVar.b)));
                    try {
                        jSONObject.put("is_personalized", ulkVar.c);
                        linkedHashMap2.put(key, jSONObject.toString());
                    } catch (JSONException e) {
                        t3p.n(e);
                        return;
                    }
                } catch (JSONException e2) {
                    t3p.n(e2);
                    return;
                }
            } catch (JSONException e3) {
                t3p.n(e3);
                return;
            }
        }
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ni6Var.a.get()).edit();
        editorEdit.clear();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            editorEdit.putString((String) entry2.getKey(), (String) entry2.getValue());
        }
        editorEdit.apply();
        verifyOffersApplied(fmkVar, list, callback);
    }

    public static final void applySubscriptionOffers(@NotNull ActionContext actionContext, @NotNull Callback callback) {
        try {
            tw7 andValidateOffers = parseAndValidateOffers((List) actionContext.objectNamed(OperaArgs.OFFERS));
            if (andValidateOffers instanceof rw7) {
                callback.run(new rw7((DiscardInfo) ((rw7) andValidateOffers).a));
                return;
            }
            if (!(andValidateOffers instanceof sw7)) {
                h9o.p();
                return;
            }
            List list = (List) ((sw7) andValidateOffers).a;
            tw7 subscriptionPlansProvider = getSubscriptionPlansProvider();
            if (subscriptionPlansProvider instanceof rw7) {
                callback.run(new rw7((DiscardInfo) ((rw7) subscriptionPlansProvider).a));
            } else if (subscriptionPlansProvider instanceof sw7) {
                applyOffersToProvider(list, (fmk) ((sw7) subscriptionPlansProvider).a, callback);
            } else {
                h9o.p();
            }
        } catch (ClassCastException unused) {
            callback.run(new rw7(makeDiscardInfo("Invalid offer format", eg0.e)));
        }
    }

    @NotNull
    public static final List<String> findNonAppliedOfferIds(@NotNull List<Offer> list, @NotNull List<Pair<String, String>> list2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Offer offer = (Offer) obj;
            if (!list2.contains(new Pair(offer.getProductId(), offer.getOfferId()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((Offer) obj2).getOfferId());
        }
        return arrayList2;
    }

    public static /* synthetic */ void getDISCARD_MESSAGE_PREFIX$annotations() {
    }

    private static final tw7 getSubscriptionPlansProvider() {
        Object currentActivity = LeanplumActivityHelper.getCurrentActivity();
        return !(currentActivity instanceof BrowserActivity) ? new rw7(makeDiscardInfo("Invalid activity", eg0.f)) : new sw7((fmk) ((BrowserActivity) currentActivity).y.a.y().get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DiscardInfo makeDiscardInfo(String str, eg0 eg0Var) {
        return new DiscardInfo(sko.j(DISCARD_MESSAGE_PREFIX, str), eg0Var);
    }

    @NotNull
    public static final tw7 parseAndValidateOffers(List<? extends Map<String, String>> list) {
        List<Offer> offers;
        List<? extends Map<String, String>> list2 = list;
        eg0 eg0Var = eg0.e;
        if (list2 == null || list2.isEmpty()) {
            offers = l08.a;
        } else {
            try {
                offers = parseOffers(list);
            } catch (IllegalArgumentException unused) {
                return new rw7(makeDiscardInfo("Failed to parse offers", eg0Var));
            }
        }
        return !validateOffers(offers) ? new rw7(makeDiscardInfo("Invalid subscription offers", eg0Var)) : new sw7(offers);
    }

    private static final List<Offer> parseOffers(List<? extends Map<String, String>> list) {
        try {
            List<? extends Map<String, String>> list2 = list;
            Offer.Companion companion = Offer.INSTANCE;
            ArrayList arrayList = new ArrayList(k95.o(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(companion.parse((Map) it.next()));
            }
            return arrayList;
        } catch (NoSuchElementException e) {
            t3p.n(e);
            return null;
        } catch (JSONException e2) {
            t3p.n(e2);
            return null;
        }
    }

    private static final boolean validateOffer(Offer offer) {
        return zsk.f.containsKey(offer.getProductId()) && !offer.getExpirationTime().before(new Date());
    }

    private static final boolean validateOffers(List<Offer> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((Offer) obj).getProductId())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != list.size()) {
            return false;
        }
        List<Offer> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (!validateOffer((Offer) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static final void verifyOffersApplied(fmk fmkVar, List<Offer> list, Callback callback) {
        fmkVar.d.add(new rzj(callback, list));
        fmkVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void verifyOffersApplied$lambda$0(final Callback callback, final List list, ylk ylkVar) {
        ylkVar.s0(new dmk() { // from class: com.leanplum.messagetemplates.SubscriptionOffersKt$verifyOffersApplied$1$1
            @Override // defpackage.dmk
            public void handleSubscriptionPlans(bmk list2) {
                csh cshVar = list2.c;
                ArrayList arrayList = new ArrayList(k95.o(cshVar, 10));
                int i = cshVar.d;
                int i2 = 0;
                while (i2 < i) {
                    Object obj = cshVar.get(i2);
                    i2++;
                    amk amkVar = (amk) obj;
                    arrayList.add(new Pair(amkVar.a.a, amkVar.c.e));
                }
                List<String> listFindNonAppliedOfferIds = SubscriptionOffersKt.findNonAppliedOfferIds(list, arrayList);
                boolean zIsEmpty = listFindNonAppliedOfferIds.isEmpty();
                Callback callback2 = callback;
                if (zIsEmpty) {
                    callback2.run(new sw7(Unit.a));
                } else {
                    callback2.run(new rw7(SubscriptionOffersKt.makeDiscardInfo("Non-applied offers: ".concat(CollectionsKt.P(listFindNonAppliedOfferIds, ", ", (CharSequence) null, (String) null, 0, (Function1) null, 62)), eg0.e)));
                }
            }

            @Override // defpackage.dmk
            public void handleSubscriptionPlans(cmk loading) {
                callback.run(new rw7(SubscriptionOffersKt.makeDiscardInfo("Failed to load subscriptions", eg0.f)));
            }

            @Override // defpackage.dmk
            public void handleSubscriptionPlans(zlk failure) {
                callback.run(new rw7(SubscriptionOffersKt.makeDiscardInfo("Failed to load subscriptions", eg0.f)));
            }
        });
    }
}
