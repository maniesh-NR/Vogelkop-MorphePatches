package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.leanplum.internal.Constants;
import com.opera.android.aiassistant.db.AiAssistantDatabase_Impl;
import com.opera.android.aiassistant.db.TopAiActivityDatabase_Impl;
import com.opera.android.autofill.assetlinks.db.AssetLinksDataBase_Impl;
import com.opera.android.browser.blocklist.manifest.db.BlockListDatabase_Impl;
import com.opera.android.favorites.data.FavoriteRemovedSuggestionsDatabase_Impl;
import com.opera.android.live_score.data.db.LiveScoreDatabase_Impl;
import com.opera.android.redirect_store.RedirectStoreDatabase_Impl;
import com.opera.android.settings.settings_search.database.SettingsSearchDatabase_Impl;
import com.opera.android.suggested_sites.SuggestedSitesDatabase_Impl;
import com.opera.android.tabui2.screenshots.TabScreenshotEntryDatabase_Impl;
import com.opera.android.tabui2.siteimages.ImageUrlRepDatabase_Impl;
import com.opera.android.touch.MessageDatabase_Impl;
import com.opera.android.translate_web_pages.TranslateWebPagesDatabase_Impl;
import com.opera.android.wallet.ExchangeRateDatabase_Impl;
import com.opera.android.wallet.WalletDatabase_Impl;
import com.opera.android.webaiassistant.db.HistoryDatabase_Impl;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class sv0 extends c6i {
    public final /* synthetic */ byte d = 0;
    public final /* synthetic */ y5i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(AiAssistantDatabase_Impl aiAssistantDatabase_Impl) {
        super(3, "6d989fe02e513c8dc3901e4f9a4f3b88", "f6adf8e0875ce0e9a3e8b067e6e1173d");
        this.e = aiAssistantDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(TopAiActivityDatabase_Impl topAiActivityDatabase_Impl) {
        super(1, "16d96924dadd598277269025e52fb3ce", "52115f5709bae5192554225051e2fd8f");
        this.e = topAiActivityDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(AssetLinksDataBase_Impl assetLinksDataBase_Impl) {
        super(2, "23b424cc2ee2f478ba4791a39d826c33", "6bd4e0f487e36d0c72db4dc6c0093a75");
        this.e = assetLinksDataBase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(BlockListDatabase_Impl blockListDatabase_Impl) {
        super(1, "a9fadb1b09260e0633a5150850afb062", "47551fc10defc347b47bee7fd4a4545c");
        this.e = blockListDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(FavoriteRemovedSuggestionsDatabase_Impl favoriteRemovedSuggestionsDatabase_Impl) {
        super(1, "a673d61cd2da079af365881aae2754de", "4941b408cc48d25bb4e8d6da1c6b9e88");
        this.e = favoriteRemovedSuggestionsDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(LiveScoreDatabase_Impl liveScoreDatabase_Impl) {
        super(15, "8a769f86638077f95235f296aaeacf08", "90adfb5cd0642f22939d15554ffb9de3");
        this.e = liveScoreDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(RedirectStoreDatabase_Impl redirectStoreDatabase_Impl) {
        super(1, "34a3d0f90ec50006704e977999bc525b", "bf33711050aeda23f915a37aec8bb7c2");
        this.e = redirectStoreDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(SettingsSearchDatabase_Impl settingsSearchDatabase_Impl) {
        super(1, "b804005a4b248e10eff9db0f143b2d2d", "4ff34749fdc430d5867af29cdbcde99f");
        this.e = settingsSearchDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(SuggestedSitesDatabase_Impl suggestedSitesDatabase_Impl) {
        super(7, "4af472ceba8119f727587e1d81496cd9", "a412514782ee6774bb82e421d11d96f3");
        this.e = suggestedSitesDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(TabScreenshotEntryDatabase_Impl tabScreenshotEntryDatabase_Impl) {
        super(2, "a5425f6fc4e8d9b3635923705c9b5165", "8e3e8884a7533751cec77ab41e5444b7");
        this.e = tabScreenshotEntryDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(ImageUrlRepDatabase_Impl imageUrlRepDatabase_Impl) {
        super(1, "26bea7fdae43feeb15d4d11c1cd18d8b", "502db12a781f59a7f8144c52cf0c870f");
        this.e = imageUrlRepDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(MessageDatabase_Impl messageDatabase_Impl) {
        super(4, "cc9c90479474bc0393ff631729f7599f", "13dc9e8b0093b5d96f38b16abe2379a4");
        this.e = messageDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(TranslateWebPagesDatabase_Impl translateWebPagesDatabase_Impl) {
        super(1, "448ff8bc2bfc40823a4789d3bab6babe", "7e9e501400422641a225f94c7e210682");
        this.e = translateWebPagesDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(ExchangeRateDatabase_Impl exchangeRateDatabase_Impl) {
        super(1, "76c9aec990bce949c74f79ef62978f2d", "db74036462f1b05bf1ff851efd4d48ee");
        this.e = exchangeRateDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(WalletDatabase_Impl walletDatabase_Impl) {
        super(24, "50fc139d6c76f2a0c5a5fbcdc0a901d9", "cdd7589a648f76816b2ba39fe46a8bee");
        this.e = walletDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(HistoryDatabase_Impl historyDatabase_Impl) {
        super(1, "55398c71f7c5005441887493ce40d5fa", "223fc1300fed9fa4467db6fb5780bd34");
        this.e = historyDatabase_Impl;
    }

    private final void A() {
    }

    private final void B() {
    }

    private final void C() {
    }

    private final void D() {
    }

    private final void E() {
    }

    private final void F() {
    }

    private final void G() {
    }

    private final void H() {
    }

    private final void I() {
    }

    private final void J() {
    }

    private final void K() {
    }

    private final void L() {
    }

    private final void M() {
    }

    private final ei2 N(osk oskVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pageUrl", new tal("pageUrl", "TEXT", 1, 1, true, (String) null));
        linkedHashMap.put("imageUrl", new tal("imageUrl", "TEXT", 0, 1, false, (String) null));
        linkedHashMap.put("timeStamp", new tal("timeStamp", "INTEGER", 0, 1, true, (String) null));
        linkedHashMap.put("flags", new tal("flags", "INTEGER", 0, 1, true, (String) null));
        wal walVar = new wal("Entry", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        wal walVarK = w0h.k(oskVar, "Entry");
        if (walVar.equals(walVarK)) {
            return new ei2(true, null);
        }
        return new ei2(false, z1m.k("Entry(com.opera.android.tabui2.siteimages.TabImageUrlRepository.Entry).\n Expected:\n", walVar, "\n Found:\n", walVarK));
    }

    private final ei2 O(osk oskVar) {
        HashMap map = new HashMap(23);
        map.put("oscoreId", new tal("oscoreId", "INTEGER", 1, 1, true, (String) null));
        map.put("source", new tal("source", "INTEGER", 0, 1, true, (String) null));
        map.put("homeTeamName", new tal("homeTeamName", "TEXT", 0, 1, true, (String) null));
        map.put("homeTeamLogoUrl", new tal("homeTeamLogoUrl", "TEXT", 0, 1, true, (String) null));
        map.put("homeTeamScore", new tal("homeTeamScore", "INTEGER", 0, 1, true, (String) null));
        map.put("homeTeamScorePenalties", new tal("homeTeamScorePenalties", "INTEGER", 0, 1, true, (String) null));
        map.put("awayTeamName", new tal("awayTeamName", "TEXT", 0, 1, true, (String) null));
        map.put("awayTeamLogoUrl", new tal("awayTeamLogoUrl", "TEXT", 0, 1, true, (String) null));
        map.put("awayTeamScore", new tal("awayTeamScore", "INTEGER", 0, 1, true, (String) null));
        map.put("awayTeamScorePenalties", new tal("awayTeamScorePenalties", "INTEGER", 0, 1, true, (String) null));
        map.put("eventStatus", new tal("eventStatus", "TEXT", 0, 1, true, (String) null));
        map.put("statusDescription", new tal("statusDescription", "TEXT", 0, 1, false, (String) null));
        map.put("finishType", new tal("finishType", "TEXT", 0, 1, false, (String) null));
        map.put("startTimestamp", new tal("startTimestamp", "INTEGER", 0, 1, true, (String) null));
        map.put("timeCurrent", new tal("timeCurrent", "INTEGER", 0, 1, false, (String) null));
        map.put("timeFirstHalf", new tal("timeFirstHalf", "INTEGER", 0, 1, false, (String) null));
        map.put("timeFirstHalfExtended", new tal("timeFirstHalfExtended", "INTEGER", 0, 1, false, (String) null));
        map.put("timeSecondHalf", new tal("timeSecondHalf", "INTEGER", 0, 1, false, (String) null));
        map.put("timeSecondHalfExtended", new tal("timeSecondHalfExtended", "INTEGER", 0, 1, false, (String) null));
        map.put("timeFirstHalfExtra", new tal("timeFirstHalfExtra", "INTEGER", 0, 1, false, (String) null));
        map.put("timeFirstHalfExtraExtended", new tal("timeFirstHalfExtraExtended", "INTEGER", 0, 1, false, (String) null));
        map.put("timeSecondHalfExtra", new tal("timeSecondHalfExtra", "INTEGER", 0, 1, false, (String) null));
        boolean z = false;
        wal walVar = new wal("football_events", map, z1m.o(map, "timeSecondHalfExtraExtended", new tal("timeSecondHalfExtraExtended", "INTEGER", 0, 1, false, (String) null), 0), new HashSet(0));
        wal walVarK = w0h.k(oskVar, "football_events");
        if (!walVar.equals(walVarK)) {
            return new ei2(z, z1m.k("football_events(com.opera.android.live_score.football.data.db.LocalFootballEvent).\n Expected:\n", walVar, "\n Found:\n", walVarK));
        }
        HashMap map2 = new HashMap(4);
        map2.put("oscoreId", new tal("oscoreId", "INTEGER", 1, 1, true, (String) null));
        map2.put("sport", new tal("sport", "INTEGER", 2, 1, true, (String) null));
        map2.put("ttlEndTimestamp", new tal("ttlEndTimestamp", "INTEGER", 0, 1, true, (String) null));
        wal walVar2 = new wal("notifications", map2, z1m.o(map2, "subscribed", new tal("subscribed", "INTEGER", 0, 1, true, "1"), 0), new HashSet(0));
        wal walVarK2 = w0h.k(oskVar, "notifications");
        if (!walVar2.equals(walVarK2)) {
            return new ei2(z, z1m.k("notifications(com.opera.android.live_score.data.db.Notification).\n Expected:\n", walVar2, "\n Found:\n", walVarK2));
        }
        HashMap map3 = new HashMap(2);
        map3.put("oscoreId", new tal("oscoreId", "INTEGER", 1, 1, true, (String) null));
        wal walVar3 = new wal("followed_matches", map3, z1m.o(map3, "sport", new tal("sport", "INTEGER", 2, 1, true, (String) null), 0), new HashSet(0));
        wal walVarK3 = w0h.k(oskVar, "followed_matches");
        if (!walVar3.equals(walVarK3)) {
            return new ei2(z, z1m.k("followed_matches(com.opera.android.live_score.data.db.FollowedMatch).\n Expected:\n", walVar3, "\n Found:\n", walVarK3));
        }
        HashMap map4 = new HashMap(2);
        map4.put("oscoreId", new tal("oscoreId", "INTEGER", 1, 1, true, (String) null));
        wal walVar4 = new wal("followed_teams", map4, z1m.o(map4, "sport", new tal("sport", "INTEGER", 2, 1, true, (String) null), 0), new HashSet(0));
        wal walVarK4 = w0h.k(oskVar, "followed_teams");
        if (!walVar4.equals(walVarK4)) {
            return new ei2(z, z1m.k("followed_teams(com.opera.android.live_score.data.db.FollowedTeam).\n Expected:\n", walVar4, "\n Found:\n", walVarK4));
        }
        HashMap map5 = new HashMap(2);
        map5.put("oscoreId", new tal("oscoreId", "INTEGER", 1, 1, true, (String) null));
        wal walVar5 = new wal("followed_tournaments", map5, z1m.o(map5, "sport", new tal("sport", "INTEGER", 2, 1, true, (String) null), 0), new HashSet(0));
        wal walVarK5 = w0h.k(oskVar, "followed_tournaments");
        if (!walVar5.equals(walVarK5)) {
            return new ei2(z, z1m.k("followed_tournaments(com.opera.android.live_score.data.db.FollowedTournament).\n Expected:\n", walVar5, "\n Found:\n", walVarK5));
        }
        HashMap map6 = new HashMap(9);
        map6.put("oddsId", new tal("oddsId", "TEXT", 1, 1, true, (String) null));
        map6.put("oddsProvider", new tal("oddsProvider", "TEXT", 0, 1, false, (String) null));
        map6.put("oddsType", new tal("oddsType", "TEXT", 0, 1, false, (String) null));
        map6.put("eventOscoreId", new tal("eventOscoreId", "INTEGER", 0, 1, true, (String) null));
        map6.put(Constants.Params.NAME, new tal(Constants.Params.NAME, "TEXT", 0, 1, true, (String) null));
        map6.put(Constants.Params.VALUE, new tal(Constants.Params.VALUE, "REAL", 0, 1, true, (String) null));
        map6.put("delta", new tal("delta", "INTEGER", 0, 1, true, (String) null));
        map6.put("jumpUrl", new tal("jumpUrl", "TEXT", 0, 1, false, (String) null));
        wal walVar6 = new wal("event_odds", map6, z1m.o(map6, "order", new tal("order", "INTEGER", 0, 1, true, (String) null), 0), new HashSet(0));
        wal walVarK6 = w0h.k(oskVar, "event_odds");
        if (!walVar6.equals(walVarK6)) {
            return new ei2(z, z1m.k("event_odds(com.opera.android.live_score.data.db.EventOdds).\n Expected:\n", walVar6, "\n Found:\n", walVarK6));
        }
        HashMap map7 = new HashMap(6);
        map7.put("id", new tal("id", "TEXT", 1, 1, true, (String) null));
        map7.put(Constants.Params.NAME, new tal(Constants.Params.NAME, "TEXT", 0, 1, false, (String) null));
        map7.put("normalIcon", new tal("normalIcon", "TEXT", 0, 1, false, (String) null));
        map7.put("lightIcon", new tal("lightIcon", "TEXT", 0, 1, false, (String) null));
        map7.put("smallIcon", new tal("smallIcon", "TEXT", 0, 1, false, (String) null));
        wal walVar7 = new wal("odds_provider_config", map7, z1m.o(map7, "logoClickUrl", new tal("logoClickUrl", "TEXT", 0, 1, false, (String) null), 0), new HashSet(0));
        wal walVarK7 = w0h.k(oskVar, "odds_provider_config");
        if (!walVar7.equals(walVarK7)) {
            return new ei2(z, z1m.k("odds_provider_config(com.opera.android.live_score.data.db.OddsProviderConfig).\n Expected:\n", walVar7, "\n Found:\n", walVarK7));
        }
        HashMap map8 = new HashMap(2);
        map8.put("oscoreId", new tal("oscoreId", "INTEGER", 1, 1, true, (String) null));
        wal walVar8 = new wal("football_audio_commentary", map8, z1m.o(map8, ImagesContract.URL, new tal(ImagesContract.URL, "TEXT", 0, 1, true, (String) null), 0), new HashSet(0));
        wal walVarK8 = w0h.k(oskVar, "football_audio_commentary");
        return !walVar8.equals(walVarK8) ? new ei2(z, z1m.k("football_audio_commentary(com.opera.android.live_score.football.data.db.LocalFootballAudioCommentary).\n Expected:\n", walVar8, "\n Found:\n", walVarK8)) : new ei2(true, null);
    }

    private final ei2 P(osk oskVar) {
        HashMap map = new HashMap(9);
        map.put("id", new tal("id", "INTEGER", 1, 1, true, (String) null));
        map.put("received", new tal("received", "INTEGER", 0, 1, true, (String) null));
        map.put("created_by", new tal("created_by", "TEXT", 0, 1, true, (String) null));
        map.put("encrypted_metadata", new tal("encrypted_metadata", "TEXT", 0, 1, true, (String) null));
        map.put("encrypted_content", new tal("encrypted_content", "TEXT", 0, 1, true, (String) null));
        map.put("content_url", new tal("content_url", "TEXT", 0, 1, false, (String) null));
        map.put("iv_metadata", new tal("iv_metadata", "TEXT", 0, 1, true, (String) null));
        map.put("iv", new tal("iv", "TEXT", 0, 1, true, (String) null));
        boolean z = false;
        wal walVar = new wal(Constants.Keys.MESSAGES, map, z1m.o(map, "local_content", new tal("local_content", "TEXT", 0, 1, false, (String) null), 0), new HashSet(0));
        wal walVarK = w0h.k(oskVar, Constants.Keys.MESSAGES);
        return !walVar.equals(walVarK) ? new ei2(z, z1m.k("messages(com.opera.android.touch.Message).\n Expected:\n", walVar, "\n Found:\n", walVarK)) : new ei2(true, null);
    }

    private final ei2 Q(osk oskVar) {
        HashMap map = new HashMap(2);
        map.put("original_url", new tal("original_url", "TEXT", 1, 1, true, (String) null));
        boolean z = false;
        wal walVar = new wal("redirects", map, z1m.o(map, "final_url", new tal("final_url", "TEXT", 0, 1, true, (String) null), 0), new HashSet(0));
        wal walVarK = w0h.k(oskVar, "redirects");
        return !walVar.equals(walVarK) ? new ei2(z, z1m.k("redirects(com.opera.android.redirect_store.Redirect).\n Expected:\n", walVar, "\n Found:\n", walVarK)) : new ei2(true, null);
    }

    private final ei2 R(osk oskVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("settings_id", new tal("settings_id", "INTEGER", 1, 1, true, (String) null));
        linkedHashMap.put("timestamp", new tal("timestamp", "INTEGER", 0, 1, true, (String) null));
        wal walVar = new wal("recent_searches", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        wal walVarK = w0h.k(oskVar, "recent_searches");
        if (walVar.equals(walVarK)) {
            return new ei2(true, null);
        }
        return new ei2(false, z1m.k("recent_searches(com.opera.android.settings.settings_search.database.RecentSearch).\n Expected:\n", walVar, "\n Found:\n", walVarK));
    }

    private final ei2 S(osk oskVar) {
        HashMap map = new HashMap(6);
        map.put("urlHash", new tal("urlHash", "TEXT", 1, 1, true, (String) null));
        map.put(Constants.Params.TYPE, new tal(Constants.Params.TYPE, "INTEGER", 2, 1, true, (String) null));
        map.put("impressions", new tal("impressions", "INTEGER", 0, 1, true, (String) null));
        map.put("clicks", new tal("clicks", "INTEGER", 0, 1, true, (String) null));
        map.put("previous_impression_time", new tal("previous_impression_time", "INTEGER", 0, 1, true, (String) null));
        boolean z = false;
        wal walVar = new wal("metadata", map, z1m.o(map, "blacklisted", new tal("blacklisted", "INTEGER", 0, 1, true, (String) null), 0), new HashSet(0));
        wal walVarK = w0h.k(oskVar, "metadata");
        if (!walVar.equals(walVarK)) {
            return new ei2(z, z1m.k("metadata(com.opera.android.suggested_sites.Metadata).\n Expected:\n", walVar, "\n Found:\n", walVarK));
        }
        HashMap map2 = new HashMap(2);
        map2.put(Constants.Params.TYPE, new tal(Constants.Params.TYPE, "INTEGER", 1, 1, true, (String) null));
        wal walVar2 = new wal("provider_info", map2, z1m.o(map2, "score", new tal("score", "REAL", 0, 1, true, (String) null), 0), new HashSet(0));
        wal walVarK2 = w0h.k(oskVar, "provider_info");
        if (!walVar2.equals(walVarK2)) {
            return new ei2(z, z1m.k("provider_info(com.opera.android.suggested_sites.ProviderInfo).\n Expected:\n", walVar2, "\n Found:\n", walVarK2));
        }
        HashMap map3 = new HashMap(11);
        map3.put("id", new tal("id", "INTEGER", 1, 1, true, (String) null));
        map3.put(ImagesContract.URL, new tal(ImagesContract.URL, "TEXT", 0, 1, true, (String) null));
        map3.put("final_domain", new tal("final_domain", "TEXT", 0, 1, true, (String) null));
        map3.put("title", new tal("title", "TEXT", 0, 1, true, (String) null));
        map3.put("score", new tal("score", "REAL", 0, 1, true, (String) null));
        map3.put(Constants.Keys.PUSH_MESSAGE_ICON_URL, new tal(Constants.Keys.PUSH_MESSAGE_ICON_URL, "TEXT", 0, 1, true, (String) null));
        map3.put("received", new tal("received", "INTEGER", 0, 1, true, (String) null));
        map3.put("keep_until", new tal("keep_until", "INTEGER", 0, 1, true, (String) null));
        map3.put("global_score", new tal("global_score", "REAL", 0, 1, true, (String) null));
        map3.put("autocomplete_chars", new tal("autocomplete_chars", "INTEGER", 0, 1, true, (String) null));
        wal walVar3 = new wal("partner_data", map3, z1m.o(map3, "recommend_chars", new tal("recommend_chars", "INTEGER", 0, 1, true, (String) null), 0), new HashSet(0));
        wal walVarK3 = w0h.k(oskVar, "partner_data");
        if (!walVar3.equals(walVarK3)) {
            return new ei2(z, z1m.k("partner_data(com.opera.android.suggested_sites.PartnerData).\n Expected:\n", walVar3, "\n Found:\n", walVarK3));
        }
        HashMap map4 = new HashMap(3);
        map4.put("received", new tal("received", "INTEGER", 1, 1, true, (String) null));
        map4.put("keep_until", new tal("keep_until", "INTEGER", 0, 1, true, (String) null));
        wal walVar4 = new wal("partner_tree", map4, z1m.o(map4, "tree", new tal("tree", "BLOB", 0, 1, true, (String) null), 0), new HashSet(0));
        wal walVarK4 = w0h.k(oskVar, "partner_tree");
        if (!walVar4.equals(walVarK4)) {
            return new ei2(z, z1m.k("partner_tree(com.opera.android.suggested_sites.PartnerTree).\n Expected:\n", walVar4, "\n Found:\n", walVarK4));
        }
        HashMap map5 = new HashMap(3);
        map5.put("domain", new tal("domain", "TEXT", 1, 1, true, (String) null));
        map5.put("rating", new tal("rating", "INTEGER", 0, 1, true, (String) null));
        wal walVar5 = new wal("domain_data", map5, z1m.o(map5, "last_updated", new tal("last_updated", "INTEGER", 0, 1, true, (String) null), 0), new HashSet(0));
        wal walVarK5 = w0h.k(oskVar, "domain_data");
        return !walVar5.equals(walVarK5) ? new ei2(z, z1m.k("domain_data(com.opera.android.suggested_sites.DomainData).\n Expected:\n", walVar5, "\n Found:\n", walVarK5)) : new ei2(true, null);
    }

    private final ei2 T(osk oskVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tabId", new tal("tabId", "INTEGER", 1, 1, true, (String) null));
        linkedHashMap.put("descriptionMedium", new tal("descriptionMedium", "TEXT", 0, 1, true, (String) null));
        linkedHashMap.put("descriptionMini", new tal("descriptionMini", "TEXT", 0, 1, true, (String) null));
        wal walVar = new wal("Entry", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        wal walVarK = w0h.k(oskVar, "Entry");
        if (walVar.equals(walVarK)) {
            return new ei2(true, null);
        }
        return new ei2(false, z1m.k("Entry(com.opera.android.tabui2.screenshots.TabScreenshotDb.Entry).\n Expected:\n", walVar, "\n Found:\n", walVarK));
    }

    private final ei2 U(osk oskVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ImagesContract.URL, new tal(ImagesContract.URL, "TEXT", 1, 1, true, (String) null));
        linkedHashMap.put("lastAccess", new tal("lastAccess", "INTEGER", 0, 1, true, (String) null));
        wal walVar = new wal("activity", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        wal walVarK = w0h.k(oskVar, "activity");
        if (walVar.equals(walVarK)) {
            return new ei2(true, null);
        }
        return new ei2(false, z1m.k("activity(com.opera.android.aiassistant.db.ActivityEntry).\n Expected:\n", walVar, "\n Found:\n", walVarK));
    }

    private final ei2 V(osk oskVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ImagesContract.URL, new tal(ImagesContract.URL, "TEXT", 1, 1, true, (String) null));
        wal walVar = new wal("excluded_sites", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        wal walVarK = w0h.k(oskVar, "excluded_sites");
        boolean z = false;
        if (!walVar.equals(walVarK)) {
            return new ei2(z, z1m.k("excluded_sites(com.opera.android.translate_web_pages.ExcludedSiteEntry).\n Expected:\n", walVar, "\n Found:\n", walVarK));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("language_string", new tal("language_string", "TEXT", 1, 1, true, (String) null));
        linkedHashMap2.put("translate_behavior", new tal("translate_behavior", "INTEGER", 0, 1, true, (String) null));
        wal walVar2 = new wal("language_prefs", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        wal walVarK2 = w0h.k(oskVar, "language_prefs");
        return !walVar2.equals(walVarK2) ? new ei2(z, z1m.k("language_prefs(com.opera.android.translate_web_pages.LanguagePreferenceEntry).\n Expected:\n", walVar2, "\n Found:\n", walVarK2)) : new ei2(true, null);
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }

    private final void r() {
    }

    private final void s() {
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }

    private final void w() {
    }

    private final void x() {
    }

    private final void y() {
    }

    private final void z() {
    }

    public final void a(osk oskVar) {
        switch (this.d) {
            case 0:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `chat` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `session` TEXT, `created` INTEGER NOT NULL, `title` TEXT, `expired` INTEGER NOT NULL)");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `chat_message` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chat` INTEGER NOT NULL, `source` TEXT NOT NULL, `content` TEXT NOT NULL, `created` INTEGER NOT NULL, `urls` TEXT NOT NULL, `name` TEXT, `messageId` TEXT, FOREIGN KEY(`chat`) REFERENCES `chat`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                nxg.k(oskVar, "CREATE INDEX IF NOT EXISTS `index_chat_message_chat` ON `chat_message` (`chat`)");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6d989fe02e513c8dc3901e4f9a4f3b88')");
                break;
            case 1:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `asset_links` (`domain` TEXT NOT NULL, `relation` TEXT NOT NULL, `namespace` TEXT, `packageName` TEXT NOT NULL, `sha256CertFingerprints` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`domain`, `packageName`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `whitelisted_domains` (`domain` TEXT NOT NULL, PRIMARY KEY(`domain`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '23b424cc2ee2f478ba4791a39d826c33')");
                break;
            case 2:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `active_block_lists` (`name` TEXT NOT NULL, `kind` TEXT NOT NULL, `checksum` TEXT NOT NULL, `addedTimestampMillis` INTEGER NOT NULL, `ttlMillis` INTEGER NOT NULL, `version` INTEGER NOT NULL, `active` INTEGER NOT NULL, PRIMARY KEY(`name`, `kind`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a9fadb1b09260e0633a5150850afb062')");
                break;
            case 3:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `exchange_rates` (`from` TEXT NOT NULL, `to` TEXT NOT NULL, `price` TEXT NOT NULL, `date` INTEGER NOT NULL, PRIMARY KEY(`from`, `to`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '76c9aec990bce949c74f79ef62978f2d')");
                break;
            case 4:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `add_favorite_removed_suggestion` (`url` TEXT NOT NULL, PRIMARY KEY(`url`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a673d61cd2da079af365881aae2754de')");
                break;
            case 5:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `entry` (`storageId` TEXT NOT NULL, `startQuery` TEXT NOT NULL, PRIMARY KEY(`storageId`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '55398c71f7c5005441887493ce40d5fa')");
                break;
            case 6:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `Entry` (`pageUrl` TEXT NOT NULL, `imageUrl` TEXT, `timeStamp` INTEGER NOT NULL, `flags` INTEGER NOT NULL, PRIMARY KEY(`pageUrl`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '26bea7fdae43feeb15d4d11c1cd18d8b')");
                break;
            case 7:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `football_events` (`oscoreId` INTEGER NOT NULL, `source` INTEGER NOT NULL, `homeTeamName` TEXT NOT NULL, `homeTeamLogoUrl` TEXT NOT NULL, `homeTeamScore` INTEGER NOT NULL, `homeTeamScorePenalties` INTEGER NOT NULL, `awayTeamName` TEXT NOT NULL, `awayTeamLogoUrl` TEXT NOT NULL, `awayTeamScore` INTEGER NOT NULL, `awayTeamScorePenalties` INTEGER NOT NULL, `eventStatus` TEXT NOT NULL, `statusDescription` TEXT, `finishType` TEXT, `startTimestamp` INTEGER NOT NULL, `timeCurrent` INTEGER, `timeFirstHalf` INTEGER, `timeFirstHalfExtended` INTEGER, `timeSecondHalf` INTEGER, `timeSecondHalfExtended` INTEGER, `timeFirstHalfExtra` INTEGER, `timeFirstHalfExtraExtended` INTEGER, `timeSecondHalfExtra` INTEGER, `timeSecondHalfExtraExtended` INTEGER, PRIMARY KEY(`oscoreId`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `notifications` (`oscoreId` INTEGER NOT NULL, `sport` INTEGER NOT NULL, `ttlEndTimestamp` INTEGER NOT NULL, `subscribed` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`oscoreId`, `sport`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `followed_matches` (`oscoreId` INTEGER NOT NULL, `sport` INTEGER NOT NULL, PRIMARY KEY(`oscoreId`, `sport`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `followed_teams` (`oscoreId` INTEGER NOT NULL, `sport` INTEGER NOT NULL, PRIMARY KEY(`oscoreId`, `sport`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `followed_tournaments` (`oscoreId` INTEGER NOT NULL, `sport` INTEGER NOT NULL, PRIMARY KEY(`oscoreId`, `sport`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `event_odds` (`oddsId` TEXT NOT NULL, `oddsProvider` TEXT, `oddsType` TEXT, `eventOscoreId` INTEGER NOT NULL, `name` TEXT NOT NULL, `value` REAL NOT NULL, `delta` INTEGER NOT NULL, `jumpUrl` TEXT, `order` INTEGER NOT NULL, PRIMARY KEY(`oddsId`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `odds_provider_config` (`id` TEXT NOT NULL, `name` TEXT, `normalIcon` TEXT, `lightIcon` TEXT, `smallIcon` TEXT, `logoClickUrl` TEXT, PRIMARY KEY(`id`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `football_audio_commentary` (`oscoreId` INTEGER NOT NULL, `url` TEXT NOT NULL, PRIMARY KEY(`oscoreId`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8a769f86638077f95235f296aaeacf08')");
                break;
            case 8:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `messages` (`id` INTEGER NOT NULL, `received` INTEGER NOT NULL, `created_by` TEXT NOT NULL, `encrypted_metadata` TEXT NOT NULL, `encrypted_content` TEXT NOT NULL, `content_url` TEXT, `iv_metadata` TEXT NOT NULL, `iv` TEXT NOT NULL, `local_content` TEXT, PRIMARY KEY(`id`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cc9c90479474bc0393ff631729f7599f')");
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `redirects` (`original_url` TEXT NOT NULL, `final_url` TEXT NOT NULL, PRIMARY KEY(`original_url`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '34a3d0f90ec50006704e977999bc525b')");
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `recent_searches` (`settings_id` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`settings_id`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b804005a4b248e10eff9db0f143b2d2d')");
                break;
            case 11:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `metadata` (`urlHash` TEXT NOT NULL, `type` INTEGER NOT NULL, `impressions` INTEGER NOT NULL, `clicks` INTEGER NOT NULL, `previous_impression_time` INTEGER NOT NULL, `blacklisted` INTEGER NOT NULL, PRIMARY KEY(`urlHash`, `type`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `provider_info` (`type` INTEGER NOT NULL, `score` REAL NOT NULL, PRIMARY KEY(`type`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `partner_data` (`id` INTEGER NOT NULL, `url` TEXT NOT NULL, `final_domain` TEXT NOT NULL, `title` TEXT NOT NULL, `score` REAL NOT NULL, `icon_url` TEXT NOT NULL, `received` INTEGER NOT NULL, `keep_until` INTEGER NOT NULL, `global_score` REAL NOT NULL, `autocomplete_chars` INTEGER NOT NULL, `recommend_chars` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `partner_tree` (`received` INTEGER NOT NULL, `keep_until` INTEGER NOT NULL, `tree` BLOB NOT NULL, PRIMARY KEY(`received`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `domain_data` (`domain` TEXT NOT NULL, `rating` INTEGER NOT NULL, `last_updated` INTEGER NOT NULL, PRIMARY KEY(`domain`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4af472ceba8119f727587e1d81496cd9')");
                break;
            case 12:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `Entry` (`tabId` INTEGER NOT NULL, `descriptionMedium` TEXT NOT NULL, `descriptionMini` TEXT NOT NULL, PRIMARY KEY(`tabId`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a5425f6fc4e8d9b3635923705c9b5165')");
                break;
            case 13:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `activity` (`url` TEXT NOT NULL, `lastAccess` INTEGER NOT NULL, PRIMARY KEY(`url`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '16d96924dadd598277269025e52fb3ce')");
                break;
            case 14:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `excluded_sites` (`url` TEXT NOT NULL, PRIMARY KEY(`url`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `language_prefs` (`language_string` TEXT NOT NULL, `translate_behavior` INTEGER NOT NULL, PRIMARY KEY(`language_string`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '448ff8bc2bfc40823a4789d3bab6babe')");
                break;
            default:
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `wallets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `secret` BLOB NOT NULL, `imported` INTEGER NOT NULL, `passphrase_ack` INTEGER NOT NULL, `ext_id` TEXT)");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `wallet_id` INTEGER NOT NULL, `coin_type` INTEGER NOT NULL, `data` TEXT NOT NULL, `amount` TEXT NOT NULL, `updated` INTEGER NOT NULL, `used` INTEGER NOT NULL, `unconfirmed` TEXT NOT NULL, `active` INTEGER NOT NULL, `position` INTEGER NOT NULL, FOREIGN KEY(`wallet_id`) REFERENCES `wallets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                nxg.k(oskVar, "CREATE INDEX IF NOT EXISTS `index_accounts_wallet_id` ON `accounts` (`wallet_id`)");
                nxg.k(oskVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_accounts_wallet_id_coin_type` ON `accounts` (`wallet_id`, `coin_type`)");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `tokens` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_id` INTEGER NOT NULL, `updated` INTEGER NOT NULL, `amount` TEXT NOT NULL, `identifier` TEXT NOT NULL, `token_id` TEXT NOT NULL, `name` TEXT NOT NULL, `symbol` TEXT NOT NULL, `decimals` INTEGER NOT NULL, `type` INTEGER NOT NULL, `transfer_method` TEXT NOT NULL, `quantization` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `accounts`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                nxg.k(oskVar, "CREATE INDEX IF NOT EXISTS `index_tokens_account_id` ON `tokens` (`account_id`)");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `tokens_info` (`net` INTEGER NOT NULL, `updated` INTEGER NOT NULL, `coin_type` INTEGER NOT NULL, `identifier` TEXT NOT NULL, `token_id` TEXT NOT NULL, `name` TEXT NOT NULL, `symbol` TEXT NOT NULL, `decimals` INTEGER NOT NULL, `type` INTEGER NOT NULL, `transfer_method` TEXT NOT NULL, `quantization` INTEGER NOT NULL, PRIMARY KEY(`net`, `identifier`, `coin_type`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `collectibles` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_id` INTEGER NOT NULL, `contract` TEXT NOT NULL, `name` TEXT NOT NULL, `updated` INTEGER NOT NULL, `token_id` TEXT NOT NULL, `icon` TEXT NOT NULL, `description` TEXT NOT NULL, `url` TEXT NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `accounts`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                nxg.k(oskVar, "CREATE INDEX IF NOT EXISTS `index_collectibles_account_id` ON `collectibles` (`account_id`)");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `transactions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hash` TEXT NOT NULL, `log_index` INTEGER NOT NULL, `account_id` INTEGER NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `type` INTEGER NOT NULL, `token_id` TEXT NOT NULL, `value` TEXT NOT NULL, `time` INTEGER NOT NULL, `block` INTEGER NOT NULL, `status` INTEGER NOT NULL, `transaction_type` TEXT NOT NULL, `token_to_id` TEXT, `token_to_type` INTEGER, FOREIGN KEY(`account_id`) REFERENCES `accounts`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                nxg.k(oskVar, "CREATE INDEX IF NOT EXISTS `index_transactions_account_id` ON `transactions` (`account_id`)");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `favorites` (`name` TEXT NOT NULL, `address` TEXT NOT NULL, `coin_type` INTEGER NOT NULL, PRIMARY KEY(`address`))");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS `deposits` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hash` TEXT NOT NULL, `account_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `value` TEXT NOT NULL, `compensation` TEXT NOT NULL, `deposit_ts` INTEGER NOT NULL, `withdraw_ts` INTEGER NOT NULL, `status` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `accounts`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                nxg.k(oskVar, "CREATE INDEX IF NOT EXISTS `index_deposits_account_id` ON `deposits` (`account_id`)");
                nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '50fc139d6c76f2a0c5a5fbcdc0a901d9')");
                break;
        }
    }

    public final void b(osk oskVar) {
        switch (this.d) {
            case 0:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `chat`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `chat_message`");
                break;
            case 1:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `asset_links`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `whitelisted_domains`");
                break;
            case 2:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `active_block_lists`");
                break;
            case 3:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `exchange_rates`");
                break;
            case 4:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `add_favorite_removed_suggestion`");
                break;
            case 5:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `entry`");
                break;
            case 6:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `Entry`");
                break;
            case 7:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `football_events`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `notifications`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `followed_matches`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `followed_teams`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `followed_tournaments`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `event_odds`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `odds_provider_config`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `football_audio_commentary`");
                break;
            case 8:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `messages`");
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `redirects`");
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `recent_searches`");
                break;
            case 11:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `metadata`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `provider_info`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `partner_data`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `partner_tree`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `domain_data`");
                break;
            case 12:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `Entry`");
                break;
            case 13:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `activity`");
                break;
            case 14:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `excluded_sites`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `language_prefs`");
                break;
            default:
                nxg.k(oskVar, "DROP TABLE IF EXISTS `wallets`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `accounts`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `tokens`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `tokens_info`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `collectibles`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `transactions`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `favorites`");
                nxg.k(oskVar, "DROP TABLE IF EXISTS `deposits`");
                break;
        }
    }

    public final void c() {
        byte b = this.d;
    }

    public final void d(osk oskVar) {
        byte b = this.d;
        y5i y5iVar = this.e;
        switch (b) {
            case 0:
                nxg.k(oskVar, "PRAGMA foreign_keys = ON");
                ((AiAssistantDatabase_Impl) y5iVar).q(oskVar);
                break;
            case 1:
                ((AssetLinksDataBase_Impl) y5iVar).q(oskVar);
                break;
            case 2:
                ((BlockListDatabase_Impl) y5iVar).q(oskVar);
                break;
            case 3:
                ((ExchangeRateDatabase_Impl) y5iVar).q(oskVar);
                break;
            case 4:
                ((FavoriteRemovedSuggestionsDatabase_Impl) y5iVar).q(oskVar);
                break;
            case 5:
                ((HistoryDatabase_Impl) y5iVar).q(oskVar);
                break;
            case 6:
                ((ImageUrlRepDatabase_Impl) y5iVar).q(oskVar);
                break;
            case 7:
                ((LiveScoreDatabase_Impl) y5iVar).q(oskVar);
                break;
            case 8:
                ((MessageDatabase_Impl) y5iVar).q(oskVar);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((RedirectStoreDatabase_Impl) y5iVar).q(oskVar);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((SettingsSearchDatabase_Impl) y5iVar).q(oskVar);
                break;
            case 11:
                ((SuggestedSitesDatabase_Impl) y5iVar).q(oskVar);
                break;
            case 12:
                ((TabScreenshotEntryDatabase_Impl) y5iVar).q(oskVar);
                break;
            case 13:
                ((TopAiActivityDatabase_Impl) y5iVar).q(oskVar);
                break;
            case 14:
                ((TranslateWebPagesDatabase_Impl) y5iVar).q(oskVar);
                break;
            default:
                nxg.k(oskVar, "PRAGMA foreign_keys = ON");
                ((WalletDatabase_Impl) y5iVar).q(oskVar);
                break;
        }
    }

    public final void e() {
        byte b = this.d;
    }

    public final void f(osk oskVar) {
        switch (this.d) {
            case 0:
                z4o.O(oskVar);
                break;
            case 1:
                z4o.O(oskVar);
                break;
            case 2:
                z4o.O(oskVar);
                break;
            case 3:
                z4o.O(oskVar);
                break;
            case 4:
                z4o.O(oskVar);
                break;
            case 5:
                z4o.O(oskVar);
                break;
            case 6:
                z4o.O(oskVar);
                break;
            case 7:
                z4o.O(oskVar);
                break;
            case 8:
                z4o.O(oskVar);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                z4o.O(oskVar);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                z4o.O(oskVar);
                break;
            case 11:
                z4o.O(oskVar);
                break;
            case 12:
                z4o.O(oskVar);
                break;
            case 13:
                z4o.O(oskVar);
                break;
            case 14:
                z4o.O(oskVar);
                break;
            default:
                z4o.O(oskVar);
                break;
        }
    }

    public final ei2 g(osk oskVar) {
        boolean z = false;
        switch (this.d) {
            case 0:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new tal("id", "INTEGER", 1, 1, true, (String) null));
                linkedHashMap.put("session", new tal("session", "TEXT", 0, 1, false, (String) null));
                linkedHashMap.put("created", new tal("created", "INTEGER", 0, 1, true, (String) null));
                linkedHashMap.put("title", new tal("title", "TEXT", 0, 1, false, (String) null));
                linkedHashMap.put("expired", new tal("expired", "INTEGER", 0, 1, true, (String) null));
                wal walVar = new wal("chat", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                wal walVarK = w0h.k(oskVar, "chat");
                if (!walVar.equals(walVarK)) {
                    return new ei2(false, z1m.k("chat(com.opera.android.aiassistant.db.Chat).\n Expected:\n", walVar, "\n Found:\n", walVarK));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new tal("id", "INTEGER", 1, 1, true, (String) null));
                linkedHashMap2.put("chat", new tal("chat", "INTEGER", 0, 1, true, (String) null));
                linkedHashMap2.put("source", new tal("source", "TEXT", 0, 1, true, (String) null));
                linkedHashMap2.put("content", new tal("content", "TEXT", 0, 1, true, (String) null));
                linkedHashMap2.put("created", new tal("created", "INTEGER", 0, 1, true, (String) null));
                linkedHashMap2.put("urls", new tal("urls", "TEXT", 0, 1, true, (String) null));
                linkedHashMap2.put(Constants.Params.NAME, new tal(Constants.Params.NAME, "TEXT", 0, 1, false, (String) null));
                linkedHashMap2.put(Constants.Params.MESSAGE_ID, new tal(Constants.Params.MESSAGE_ID, "TEXT", 0, 1, false, (String) null));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new ual("chat", "CASCADE", "NO ACTION", Collections.singletonList("chat"), Collections.singletonList("id")));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                boolean z2 = false;
                linkedHashSet2.add(new val("index_chat_message_chat", Collections.singletonList("chat"), Collections.singletonList("ASC"), false));
                wal walVar2 = new wal("chat_message", linkedHashMap2, linkedHashSet, linkedHashSet2);
                wal walVarK2 = w0h.k(oskVar, "chat_message");
                if (!walVar2.equals(walVarK2)) {
                    return new ei2(z2, z1m.k("chat_message(com.opera.android.aiassistant.db.ChatMessage).\n Expected:\n", walVar2, "\n Found:\n", walVarK2));
                }
                return new ei2(true, null);
            case 1:
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("domain", new tal("domain", "TEXT", 1, 1, true, (String) null));
                linkedHashMap3.put("relation", new tal("relation", "TEXT", 0, 1, true, (String) null));
                linkedHashMap3.put("namespace", new tal("namespace", "TEXT", 0, 1, false, (String) null));
                linkedHashMap3.put("packageName", new tal("packageName", "TEXT", 2, 1, true, (String) null));
                linkedHashMap3.put("sha256CertFingerprints", new tal("sha256CertFingerprints", "TEXT", 0, 1, true, (String) null));
                linkedHashMap3.put("timestamp", new tal("timestamp", "INTEGER", 0, 1, true, (String) null));
                wal walVar3 = new wal("asset_links", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                wal walVarK3 = w0h.k(oskVar, "asset_links");
                if (!walVar3.equals(walVarK3)) {
                    return new ei2(false, z1m.k("asset_links(com.opera.android.autofill.assetlinks.db.AssetLinksDbModel).\n Expected:\n", walVar3, "\n Found:\n", walVarK3));
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("domain", new tal("domain", "TEXT", 1, 1, true, (String) null));
                wal walVar4 = new wal("whitelisted_domains", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                wal walVarK4 = w0h.k(oskVar, "whitelisted_domains");
                if (walVar4.equals(walVarK4)) {
                    return new ei2(true, null);
                }
                return new ei2(false, z1m.k("whitelisted_domains(com.opera.android.autofill.assetlinks.db.WhitelistedDomainDbModel).\n Expected:\n", walVar4, "\n Found:\n", walVarK4));
            case 2:
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put(Constants.Params.NAME, new tal(Constants.Params.NAME, "TEXT", 1, 1, true, (String) null));
                linkedHashMap5.put("kind", new tal("kind", "TEXT", 2, 1, true, (String) null));
                linkedHashMap5.put("checksum", new tal("checksum", "TEXT", 0, 1, true, (String) null));
                linkedHashMap5.put("addedTimestampMillis", new tal("addedTimestampMillis", "INTEGER", 0, 1, true, (String) null));
                linkedHashMap5.put("ttlMillis", new tal("ttlMillis", "INTEGER", 0, 1, true, (String) null));
                linkedHashMap5.put("version", new tal("version", "INTEGER", 0, 1, true, (String) null));
                linkedHashMap5.put("active", new tal("active", "INTEGER", 0, 1, true, (String) null));
                wal walVar5 = new wal("active_block_lists", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
                wal walVarK5 = w0h.k(oskVar, "active_block_lists");
                if (walVar5.equals(walVarK5)) {
                    return new ei2(true, null);
                }
                return new ei2(false, z1m.k("active_block_lists(com.opera.android.browser.blocklist.manifest.db.BlockListModel).\n Expected:\n", walVar5, "\n Found:\n", walVarK5));
            case 3:
                HashMap map = new HashMap(4);
                map.put("from", new tal("from", "TEXT", 1, 1, true, (String) null));
                map.put("to", new tal("to", "TEXT", 2, 1, true, (String) null));
                map.put("price", new tal("price", "TEXT", 0, 1, true, (String) null));
                boolean z3 = false;
                wal walVar6 = new wal("exchange_rates", map, z1m.o(map, "date", new tal("date", "INTEGER", 0, 1, true, (String) null), 0), new HashSet(0));
                wal walVarK6 = w0h.k(oskVar, "exchange_rates");
                if (!walVar6.equals(walVarK6)) {
                    return new ei2(z3, z1m.k("exchange_rates(com.opera.android.wallet.ExchangeRate).\n Expected:\n", walVar6, "\n Found:\n", walVarK6));
                }
                return new ei2(true, null);
            case 4:
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put(ImagesContract.URL, new tal(ImagesContract.URL, "TEXT", 1, 1, true, (String) null));
                wal walVar7 = new wal("add_favorite_removed_suggestion", linkedHashMap6, new LinkedHashSet(), new LinkedHashSet());
                wal walVarK7 = w0h.k(oskVar, "add_favorite_removed_suggestion");
                if (walVar7.equals(walVarK7)) {
                    return new ei2(true, null);
                }
                return new ei2(false, z1m.k("add_favorite_removed_suggestion(com.opera.android.favorites.data.FavoriteRemovedSuggestion).\n Expected:\n", walVar7, "\n Found:\n", walVarK7));
            case 5:
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("storageId", new tal("storageId", "TEXT", 1, 1, true, (String) null));
                linkedHashMap7.put("startQuery", new tal("startQuery", "TEXT", 0, 1, true, (String) null));
                wal walVar8 = new wal("entry", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
                wal walVarK8 = w0h.k(oskVar, "entry");
                if (walVar8.equals(walVarK8)) {
                    return new ei2(true, null);
                }
                return new ei2(false, z1m.k("entry(com.opera.android.webaiassistant.db.HistoryEntry).\n Expected:\n", walVar8, "\n Found:\n", walVarK8));
            case 6:
                return N(oskVar);
            case 7:
                return O(oskVar);
            case 8:
                return P(oskVar);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return Q(oskVar);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return R(oskVar);
            case 11:
                return S(oskVar);
            case 12:
                return T(oskVar);
            case 13:
                return U(oskVar);
            case 14:
                return V(oskVar);
            default:
                HashMap map2 = new HashMap(5);
                map2.put("id", new tal("id", "INTEGER", 1, 1, true, (String) null));
                map2.put("secret", new tal("secret", "BLOB", 0, 1, true, (String) null));
                map2.put("imported", new tal("imported", "INTEGER", 0, 1, true, (String) null));
                map2.put("passphrase_ack", new tal("passphrase_ack", "INTEGER", 0, 1, true, (String) null));
                wal walVar9 = new wal("wallets", map2, z1m.o(map2, "ext_id", new tal("ext_id", "TEXT", 0, 1, false, (String) null), 0), new HashSet(0));
                wal walVarK9 = w0h.k(oskVar, "wallets");
                if (!walVar9.equals(walVarK9)) {
                    return new ei2(z, z1m.k("wallets(com.opera.android.wallet.Wallet).\n Expected:\n", walVar9, "\n Found:\n", walVarK9));
                }
                HashMap map3 = new HashMap(10);
                map3.put("id", new tal("id", "INTEGER", 1, 1, true, (String) null));
                map3.put("wallet_id", new tal("wallet_id", "INTEGER", 0, 1, true, (String) null));
                map3.put("coin_type", new tal("coin_type", "INTEGER", 0, 1, true, (String) null));
                map3.put(Constants.Params.DATA, new tal(Constants.Params.DATA, "TEXT", 0, 1, true, (String) null));
                map3.put("amount", new tal("amount", "TEXT", 0, 1, true, (String) null));
                map3.put("updated", new tal("updated", "INTEGER", 0, 1, true, (String) null));
                map3.put("used", new tal("used", "INTEGER", 0, 1, true, (String) null));
                map3.put("unconfirmed", new tal("unconfirmed", "TEXT", 0, 1, true, (String) null));
                map3.put("active", new tal("active", "INTEGER", 0, 1, true, (String) null));
                HashSet hashSetO = z1m.o(map3, "position", new tal("position", "INTEGER", 0, 1, true, (String) null), 1);
                hashSetO.add(new ual("wallets", "CASCADE", "NO ACTION", Arrays.asList("wallet_id"), Arrays.asList("id")));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new val("index_accounts_wallet_id", Arrays.asList("wallet_id"), Arrays.asList("ASC"), false));
                hashSet.add(new val("index_accounts_wallet_id_coin_type", Arrays.asList("wallet_id", "coin_type"), Arrays.asList("ASC", "ASC"), true));
                wal walVar10 = new wal("accounts", map3, hashSetO, hashSet);
                wal walVarK10 = w0h.k(oskVar, "accounts");
                if (!walVar10.equals(walVarK10)) {
                    return new ei2(false, z1m.k("accounts(com.opera.android.wallet.Account).\n Expected:\n", walVar10, "\n Found:\n", walVarK10));
                }
                HashMap map4 = new HashMap(12);
                map4.put("id", new tal("id", "INTEGER", 1, 1, true, (String) null));
                map4.put("account_id", new tal("account_id", "INTEGER", 0, 1, true, (String) null));
                map4.put("updated", new tal("updated", "INTEGER", 0, 1, true, (String) null));
                map4.put("amount", new tal("amount", "TEXT", 0, 1, true, (String) null));
                map4.put("identifier", new tal("identifier", "TEXT", 0, 1, true, (String) null));
                map4.put("token_id", new tal("token_id", "TEXT", 0, 1, true, (String) null));
                map4.put(Constants.Params.NAME, new tal(Constants.Params.NAME, "TEXT", 0, 1, true, (String) null));
                map4.put("symbol", new tal("symbol", "TEXT", 0, 1, true, (String) null));
                map4.put("decimals", new tal("decimals", "INTEGER", 0, 1, true, (String) null));
                map4.put(Constants.Params.TYPE, new tal(Constants.Params.TYPE, "INTEGER", 0, 1, true, (String) null));
                map4.put("transfer_method", new tal("transfer_method", "TEXT", 0, 1, true, (String) null));
                HashSet hashSetO2 = z1m.o(map4, "quantization", new tal("quantization", "INTEGER", 0, 1, true, (String) null), 1);
                hashSetO2.add(new ual("accounts", "CASCADE", "NO ACTION", Arrays.asList("account_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(1);
                boolean z4 = false;
                hashSet2.add(new val("index_tokens_account_id", Arrays.asList("account_id"), Arrays.asList("ASC"), false));
                wal walVar11 = new wal("tokens", map4, hashSetO2, hashSet2);
                wal walVarK11 = w0h.k(oskVar, "tokens");
                if (!walVar11.equals(walVarK11)) {
                    return new ei2(z4, z1m.k("tokens(com.opera.android.wallet.AccountToken).\n Expected:\n", walVar11, "\n Found:\n", walVarK11));
                }
                HashMap map5 = new HashMap(11);
                map5.put("net", new tal("net", "INTEGER", 1, 1, true, (String) null));
                map5.put("updated", new tal("updated", "INTEGER", 0, 1, true, (String) null));
                map5.put("coin_type", new tal("coin_type", "INTEGER", 3, 1, true, (String) null));
                map5.put("identifier", new tal("identifier", "TEXT", 2, 1, true, (String) null));
                map5.put("token_id", new tal("token_id", "TEXT", 0, 1, true, (String) null));
                map5.put(Constants.Params.NAME, new tal(Constants.Params.NAME, "TEXT", 0, 1, true, (String) null));
                map5.put("symbol", new tal("symbol", "TEXT", 0, 1, true, (String) null));
                map5.put("decimals", new tal("decimals", "INTEGER", 0, 1, true, (String) null));
                map5.put(Constants.Params.TYPE, new tal(Constants.Params.TYPE, "INTEGER", 0, 1, true, (String) null));
                map5.put("transfer_method", new tal("transfer_method", "TEXT", 0, 1, true, (String) null));
                boolean z5 = false;
                wal walVar12 = new wal("tokens_info", map5, z1m.o(map5, "quantization", new tal("quantization", "INTEGER", 0, 1, true, (String) null), 0), new HashSet(0));
                wal walVarK12 = w0h.k(oskVar, "tokens_info");
                if (!walVar12.equals(walVarK12)) {
                    return new ei2(z5, z1m.k("tokens_info(com.opera.android.wallet.TokenInfo).\n Expected:\n", walVar12, "\n Found:\n", walVarK12));
                }
                HashMap map6 = new HashMap(9);
                map6.put("id", new tal("id", "INTEGER", 1, 1, true, (String) null));
                map6.put("account_id", new tal("account_id", "INTEGER", 0, 1, true, (String) null));
                map6.put("contract", new tal("contract", "TEXT", 0, 1, true, (String) null));
                map6.put(Constants.Params.NAME, new tal(Constants.Params.NAME, "TEXT", 0, 1, true, (String) null));
                map6.put("updated", new tal("updated", "INTEGER", 0, 1, true, (String) null));
                map6.put("token_id", new tal("token_id", "TEXT", 0, 1, true, (String) null));
                map6.put("icon", new tal("icon", "TEXT", 0, 1, true, (String) null));
                map6.put("description", new tal("description", "TEXT", 0, 1, true, (String) null));
                HashSet hashSetO3 = z1m.o(map6, ImagesContract.URL, new tal(ImagesContract.URL, "TEXT", 0, 1, true, (String) null), 1);
                hashSetO3.add(new ual("accounts", "CASCADE", "NO ACTION", Arrays.asList("account_id"), Arrays.asList("id")));
                HashSet hashSet3 = new HashSet(1);
                boolean z6 = false;
                hashSet3.add(new val("index_collectibles_account_id", Arrays.asList("account_id"), Arrays.asList("ASC"), false));
                wal walVar13 = new wal("collectibles", map6, hashSetO3, hashSet3);
                wal walVarK13 = w0h.k(oskVar, "collectibles");
                if (!walVar13.equals(walVarK13)) {
                    return new ei2(z6, z1m.k("collectibles(com.opera.android.wallet.Collectible).\n Expected:\n", walVar13, "\n Found:\n", walVarK13));
                }
                HashMap map7 = new HashMap(15);
                map7.put("id", new tal("id", "INTEGER", 1, 1, true, (String) null));
                map7.put(Constants.Keys.HASH, new tal(Constants.Keys.HASH, "TEXT", 0, 1, true, (String) null));
                map7.put("log_index", new tal("log_index", "INTEGER", 0, 1, true, (String) null));
                map7.put("account_id", new tal("account_id", "INTEGER", 0, 1, true, (String) null));
                map7.put("from", new tal("from", "TEXT", 0, 1, true, (String) null));
                map7.put("to", new tal("to", "TEXT", 0, 1, true, (String) null));
                map7.put(Constants.Params.TYPE, new tal(Constants.Params.TYPE, "INTEGER", 0, 1, true, (String) null));
                map7.put("token_id", new tal("token_id", "TEXT", 0, 1, true, (String) null));
                map7.put(Constants.Params.VALUE, new tal(Constants.Params.VALUE, "TEXT", 0, 1, true, (String) null));
                map7.put(Constants.Params.TIME, new tal(Constants.Params.TIME, "INTEGER", 0, 1, true, (String) null));
                map7.put("block", new tal("block", "INTEGER", 0, 1, true, (String) null));
                map7.put("status", new tal("status", "INTEGER", 0, 1, true, (String) null));
                map7.put("transaction_type", new tal("transaction_type", "TEXT", 0, 1, true, (String) null));
                map7.put("token_to_id", new tal("token_to_id", "TEXT", 0, 1, false, (String) null));
                HashSet hashSetO4 = z1m.o(map7, "token_to_type", new tal("token_to_type", "INTEGER", 0, 1, false, (String) null), 1);
                hashSetO4.add(new ual("accounts", "CASCADE", "NO ACTION", Arrays.asList("account_id"), Arrays.asList("id")));
                HashSet hashSet4 = new HashSet(1);
                boolean z7 = false;
                hashSet4.add(new val("index_transactions_account_id", Arrays.asList("account_id"), Arrays.asList("ASC"), false));
                wal walVar14 = new wal("transactions", map7, hashSetO4, hashSet4);
                wal walVarK14 = w0h.k(oskVar, "transactions");
                if (!walVar14.equals(walVarK14)) {
                    return new ei2(z7, z1m.k("transactions(com.opera.android.wallet.HistoryTransaction).\n Expected:\n", walVar14, "\n Found:\n", walVarK14));
                }
                HashMap map8 = new HashMap(3);
                map8.put(Constants.Params.NAME, new tal(Constants.Params.NAME, "TEXT", 0, 1, true, (String) null));
                map8.put("address", new tal("address", "TEXT", 1, 1, true, (String) null));
                boolean z8 = false;
                wal walVar15 = new wal("favorites", map8, z1m.o(map8, "coin_type", new tal("coin_type", "INTEGER", 0, 1, true, (String) null), 0), new HashSet(0));
                wal walVarK15 = w0h.k(oskVar, "favorites");
                if (!walVar15.equals(walVarK15)) {
                    return new ei2(z8, z1m.k("favorites(com.opera.android.wallet.Favorite).\n Expected:\n", walVar15, "\n Found:\n", walVarK15));
                }
                HashMap map9 = new HashMap(9);
                map9.put("id", new tal("id", "INTEGER", 1, 1, true, (String) null));
                map9.put(Constants.Keys.HASH, new tal(Constants.Keys.HASH, "TEXT", 0, 1, true, (String) null));
                map9.put("account_id", new tal("account_id", "INTEGER", 0, 1, true, (String) null));
                map9.put(Constants.Params.TYPE, new tal(Constants.Params.TYPE, "INTEGER", 0, 1, true, (String) null));
                map9.put(Constants.Params.VALUE, new tal(Constants.Params.VALUE, "TEXT", 0, 1, true, (String) null));
                map9.put("compensation", new tal("compensation", "TEXT", 0, 1, true, (String) null));
                map9.put("deposit_ts", new tal("deposit_ts", "INTEGER", 0, 1, true, (String) null));
                map9.put("withdraw_ts", new tal("withdraw_ts", "INTEGER", 0, 1, true, (String) null));
                HashSet hashSetO5 = z1m.o(map9, "status", new tal("status", "INTEGER", 0, 1, true, (String) null), 1);
                hashSetO5.add(new ual("accounts", "CASCADE", "NO ACTION", Arrays.asList("account_id"), Arrays.asList("id")));
                HashSet hashSet5 = new HashSet(1);
                boolean z9 = false;
                hashSet5.add(new val("index_deposits_account_id", Arrays.asList("account_id"), Arrays.asList("ASC"), false));
                wal walVar16 = new wal("deposits", map9, hashSetO5, hashSet5);
                wal walVarK16 = w0h.k(oskVar, "deposits");
                if (!walVar16.equals(walVarK16)) {
                    return new ei2(z9, z1m.k("deposits(com.opera.android.wallet.Deposit).\n Expected:\n", walVar16, "\n Found:\n", walVarK16));
                }
                return new ei2(true, null);
        }
    }
}
