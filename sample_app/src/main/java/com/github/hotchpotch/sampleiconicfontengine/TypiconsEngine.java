package com.github.hotchpotch.sampleiconicfontengine;

import android.graphics.Typeface;

import com.github.hotchpotch.fontengine.IconicFontEngine;
import com.github.hotchpotch.fontengine.IconicFontMap;

/**
 * Created by yuichi-tateno on 2015/02/28.
 */
public class TypiconsEngine extends IconicFontEngine {
    public final static IconicFontMap FONT_MAP = new IconicFontMap() {{
        put("typcn-adjust-brightness", '\ue000');
        put("typcn-adjust-contrast", '\ue001');
        put("typcn-anchor-outline", '\ue002');
        put("typcn-anchor", '\ue003');
        put("typcn-archive", '\ue004');
        put("typcn-arrow-back-outline", '\ue005');
        put("typcn-arrow-back", '\ue006');
        put("typcn-arrow-down-outline", '\ue007');
        put("typcn-arrow-down-thick", '\ue008');
        put("typcn-arrow-down", '\ue009');
        put("typcn-arrow-forward-outline", '\ue00a');
        put("typcn-arrow-forward", '\ue00b');
        put("typcn-arrow-left-outline", '\ue00c');
        put("typcn-arrow-left-thick", '\ue00d');
        put("typcn-arrow-left", '\ue00e');
        put("typcn-arrow-loop-outline", '\ue00f');
        put("typcn-arrow-loop", '\ue010');
        put("typcn-arrow-maximise-outline", '\ue011');
        put("typcn-arrow-maximise", '\ue012');
        put("typcn-arrow-minimise-outline", '\ue013');
        put("typcn-arrow-minimise", '\ue014');
        put("typcn-arrow-move-outline", '\ue015');
        put("typcn-arrow-move", '\ue016');
        put("typcn-arrow-repeat-outline", '\ue017');
        put("typcn-arrow-repeat", '\ue018');
        put("typcn-arrow-right-outline", '\ue019');
        put("typcn-arrow-right-thick", '\ue01a');
        put("typcn-arrow-right", '\ue01b');
        put("typcn-arrow-shuffle", '\ue01c');
        put("typcn-arrow-sorted-down", '\ue01d');
        put("typcn-arrow-sorted-up", '\ue01e');
        put("typcn-arrow-sync-outline", '\ue01f');
        put("typcn-arrow-sync", '\ue020');
        put("typcn-arrow-unsorted", '\ue021');
        put("typcn-arrow-up-outline", '\ue022');
        put("typcn-arrow-up-thick", '\ue023');
        put("typcn-arrow-up", '\ue024');
        put("typcn-at", '\ue025');
        put("typcn-attachment-outline", '\ue026');
        put("typcn-attachment", '\ue027');
        put("typcn-backspace-outline", '\ue028');
        put("typcn-backspace", '\ue029');
        put("typcn-battery-charge", '\ue02a');
        put("typcn-battery-full", '\ue02b');
        put("typcn-battery-high", '\ue02c');
        put("typcn-battery-low", '\ue02d');
        put("typcn-battery-mid", '\ue02e');
        put("typcn-beaker", '\ue02f');
        put("typcn-beer", '\ue030');
        put("typcn-bell", '\ue031');
        put("typcn-book", '\ue032');
        put("typcn-bookmark", '\ue033');
        put("typcn-briefcase", '\ue034');
        put("typcn-brush", '\ue035');
        put("typcn-business-card", '\ue036');
        put("typcn-calculator", '\ue037');
        put("typcn-calendar-outline", '\ue038');
        put("typcn-calendar", '\ue039');
        put("typcn-camera-outline", '\ue03a');
        put("typcn-camera", '\ue03b');
        put("typcn-cancel-outline", '\ue03c');
        put("typcn-cancel", '\ue03d');
        put("typcn-chart-area-outline", '\ue03e');
        put("typcn-chart-area", '\ue03f');
        put("typcn-chart-bar-outline", '\ue040');
        put("typcn-chart-bar", '\ue041');
        put("typcn-chart-line-outline", '\ue042');
        put("typcn-chart-line", '\ue043');
        put("typcn-chart-pie-outline", '\ue044');
        put("typcn-chart-pie", '\ue045');
        put("typcn-chevron-left-outline", '\ue046');
        put("typcn-chevron-left", '\ue047');
        put("typcn-chevron-right-outline", '\ue048');
        put("typcn-chevron-right", '\ue049');
        put("typcn-clipboard", '\ue04a');
        put("typcn-cloud-storage", '\ue04b');
        put("typcn-cloud-storage-outline", '\ue054');
        put("typcn-code-outline", '\ue04c');
        put("typcn-code", '\ue04d');
        put("typcn-coffee", '\ue04e');
        put("typcn-cog-outline", '\ue04f');
        put("typcn-cog", '\ue050');
        put("typcn-compass", '\ue051');
        put("typcn-contacts", '\ue052');
        put("typcn-credit-card", '\ue053');
        put("typcn-css3", '\ue055');
        put("typcn-database", '\ue056');
        put("typcn-delete-outline", '\ue057');
        put("typcn-delete", '\ue058');
        put("typcn-device-desktop", '\ue059');
        put("typcn-device-laptop", '\ue05a');
        put("typcn-device-phone", '\ue05b');
        put("typcn-device-tablet", '\ue05c');
        put("typcn-directions", '\ue05d');
        put("typcn-divide-outline", '\ue05e');
        put("typcn-divide", '\ue05f');
        put("typcn-document-add", '\ue060');
        put("typcn-document-delete", '\ue061');
        put("typcn-document-text", '\ue062');
        put("typcn-document", '\ue063');
        put("typcn-download-outline", '\ue064');
        put("typcn-download", '\ue065');
        put("typcn-dropbox", '\ue066');
        put("typcn-edit", '\ue067');
        put("typcn-eject-outline", '\ue068');
        put("typcn-eject", '\ue069');
        put("typcn-equals-outline", '\ue06a');
        put("typcn-equals", '\ue06b');
        put("typcn-export-outline", '\ue06c');
        put("typcn-export", '\ue06d');
        put("typcn-eye-outline", '\ue06e');
        put("typcn-eye", '\ue06f');
        put("typcn-feather", '\ue070');
        put("typcn-film", '\ue071');
        put("typcn-filter", '\ue072');
        put("typcn-flag-outline", '\ue073');
        put("typcn-flag", '\ue074');
        put("typcn-flash-outline", '\ue075');
        put("typcn-flash", '\ue076');
        put("typcn-flow-children", '\ue077');
        put("typcn-flow-merge", '\ue078');
        put("typcn-flow-parallel", '\ue079');
        put("typcn-flow-switch", '\ue07a');
        put("typcn-folder-add", '\ue07b');
        put("typcn-folder-delete", '\ue07c');
        put("typcn-folder-open", '\ue07d');
        put("typcn-folder", '\ue07e');
        put("typcn-gift", '\ue07f');
        put("typcn-globe-outline", '\ue080');
        put("typcn-globe", '\ue081');
        put("typcn-group-outline", '\ue082');
        put("typcn-group", '\ue083');
        put("typcn-headphones", '\ue084');
        put("typcn-heart-full-outline", '\ue085');
        put("typcn-heart-half-outline", '\ue086');
        put("typcn-heart-outline", '\ue087');
        put("typcn-heart", '\ue088');
        put("typcn-home-outline", '\ue089');
        put("typcn-home", '\ue08a');
        put("typcn-html5", '\ue08b');
        put("typcn-image-outline", '\ue08c');
        put("typcn-image", '\ue08d');
        put("typcn-infinity-outline", '\ue08e');
        put("typcn-infinity", '\ue08f');
        put("typcn-info-large-outline", '\ue090');
        put("typcn-info-large", '\ue091');
        put("typcn-info-outline", '\ue092');
        put("typcn-info", '\ue093');
        put("typcn-input-checked-outline", '\ue094');
        put("typcn-input-checked", '\ue095');
        put("typcn-key-outline", '\ue096');
        put("typcn-key", '\ue097');
        put("typcn-keyboard", '\ue098');
        put("typcn-leaf", '\ue099');
        put("typcn-lightbulb", '\ue09a');
        put("typcn-link-outline", '\ue09b');
        put("typcn-link", '\ue09c');
        put("typcn-location-arrow-outline", '\ue09d');
        put("typcn-location-arrow", '\ue09e');
        put("typcn-location-outline", '\ue09f');
        put("typcn-location", '\ue0a0');
        put("typcn-lock-closed-outline", '\ue0a1');
        put("typcn-lock-closed", '\ue0a2');
        put("typcn-lock-open-outline", '\ue0a3');
        put("typcn-lock-open", '\ue0a4');
        put("typcn-mail", '\ue0a5');
        put("typcn-map", '\ue0a6');
        put("typcn-media-eject-outline", '\ue0a7');
        put("typcn-media-eject", '\ue0a8');
        put("typcn-media-fast-forward-outline", '\ue0a9');
        put("typcn-media-fast-forward", '\ue0aa');
        put("typcn-media-pause-outline", '\ue0ab');
        put("typcn-media-pause", '\ue0ac');
        put("typcn-media-play-outline", '\ue0ad');
        put("typcn-media-play-reverse-outline", '\ue0ae');
        put("typcn-media-play-reverse", '\ue0af');
        put("typcn-media-play", '\ue0b0');
        put("typcn-media-record-outline", '\ue0b1');
        put("typcn-media-record", '\ue0b2');
        put("typcn-media-rewind-outline", '\ue0b3');
        put("typcn-media-rewind", '\ue0b4');
        put("typcn-media-stop-outline", '\ue0b5');
        put("typcn-media-stop", '\ue0b6');
        put("typcn-message-typing", '\ue0b7');
        put("typcn-message", '\ue0b8');
        put("typcn-messages", '\ue0b9');
        put("typcn-microphone-outline", '\ue0ba');
        put("typcn-microphone", '\ue0bb');
        put("typcn-minus-outline", '\ue0bc');
        put("typcn-minus", '\ue0bd');
        put("typcn-mortar-board", '\ue0be');
        put("typcn-news", '\ue0bf');
        put("typcn-notes-outline", '\ue0c0');
        put("typcn-notes", '\ue0c1');
        put("typcn-pen", '\ue0c2');
        put("typcn-pencil", '\ue0c3');
        put("typcn-phone-outline", '\ue0c4');
        put("typcn-phone", '\ue0c5');
        put("typcn-pi-outline", '\ue0c6');
        put("typcn-pi", '\ue0c7');
        put("typcn-pin-outline", '\ue0c8');
        put("typcn-pin", '\ue0c9');
        put("typcn-pipette", '\ue0ca');
        put("typcn-plane-outline", '\ue0cb');
        put("typcn-plane", '\ue0cc');
        put("typcn-plug", '\ue0cd');
        put("typcn-plus-outline", '\ue0ce');
        put("typcn-plus", '\ue0cf');
        put("typcn-point-of-interest-outline", '\ue0d0');
        put("typcn-point-of-interest", '\ue0d1');
        put("typcn-power-outline", '\ue0d2');
        put("typcn-power", '\ue0d3');
        put("typcn-printer", '\ue0d4');
        put("typcn-puzzle-outline", '\ue0d5');
        put("typcn-puzzle", '\ue0d6');
        put("typcn-radar-outline", '\ue0d7');
        put("typcn-radar", '\ue0d8');
        put("typcn-refresh-outline", '\ue0d9');
        put("typcn-refresh", '\ue0da');
        put("typcn-rss-outline", '\ue0db');
        put("typcn-rss", '\ue0dc');
        put("typcn-scissors-outline", '\ue0dd');
        put("typcn-scissors", '\ue0de');
        put("typcn-shopping-bag", '\ue0df');
        put("typcn-shopping-cart", '\ue0e0');
        put("typcn-social-at-circular", '\ue0e1');
        put("typcn-social-dribbble-circular", '\ue0e2');
        put("typcn-social-dribbble", '\ue0e3');
        put("typcn-social-facebook-circular", '\ue0e4');
        put("typcn-social-facebook", '\ue0e5');
        put("typcn-social-flickr-circular", '\ue0e6');
        put("typcn-social-flickr", '\ue0e7');
        put("typcn-social-github-circular", '\ue0e8');
        put("typcn-social-github", '\ue0e9');
        put("typcn-social-google-plus-circular", '\ue0ea');
        put("typcn-social-google-plus", '\ue0eb');
        put("typcn-social-instagram-circular", '\ue0ec');
        put("typcn-social-instagram", '\ue0ed');
        put("typcn-social-last-fm-circular", '\ue0ee');
        put("typcn-social-last-fm", '\ue0ef');
        put("typcn-social-linkedin-circular", '\ue0f0');
        put("typcn-social-linkedin", '\ue0f1');
        put("typcn-social-pinterest-circular", '\ue0f2');
        put("typcn-social-pinterest", '\ue0f3');
        put("typcn-social-skype-outline", '\ue0f4');
        put("typcn-social-skype", '\ue0f5');
        put("typcn-social-tumbler-circular", '\ue0f6');
        put("typcn-social-tumbler", '\ue0f7');
        put("typcn-social-twitter-circular", '\ue0f8');
        put("typcn-social-twitter", '\ue0f9');
        put("typcn-social-vimeo-circular", '\ue0fa');
        put("typcn-social-vimeo", '\ue0fb');
        put("typcn-social-youtube-circular", '\ue0fc');
        put("typcn-social-youtube", '\ue0fd');
        put("typcn-sort-alphabetically-outline", '\ue0fe');
        put("typcn-sort-alphabetically", '\ue0ff');
        put("typcn-sort-numerically-outline", '\ue100');
        put("typcn-sort-numerically", '\ue101');
        put("typcn-spanner-outline", '\ue102');
        put("typcn-spanner", '\ue103');
        put("typcn-spiral", '\ue104');
        put("typcn-star-full-outline", '\ue105');
        put("typcn-star-half-outline", '\ue106');
        put("typcn-star-half", '\ue107');
        put("typcn-star-outline", '\ue108');
        put("typcn-star", '\ue109');
        put("typcn-starburst-outline", '\ue10a');
        put("typcn-starburst", '\ue10b');
        put("typcn-stopwatch", '\ue10c');
        put("typcn-support", '\ue10d');
        put("typcn-tabs-outline", '\ue10e');
        put("typcn-tag", '\ue10f');
        put("typcn-tags", '\ue110');
        put("typcn-th-large-outline", '\ue111');
        put("typcn-th-large", '\ue112');
        put("typcn-th-list-outline", '\ue113');
        put("typcn-th-list", '\ue114');
        put("typcn-th-menu-outline", '\ue115');
        put("typcn-th-menu", '\ue116');
        put("typcn-th-small-outline", '\ue117');
        put("typcn-th-small", '\ue118');
        put("typcn-thermometer", '\ue119');
        put("typcn-thumbs-down", '\ue11a');
        put("typcn-thumbs-ok", '\ue11b');
        put("typcn-thumbs-up", '\ue11c');
        put("typcn-tick-outline", '\ue11d');
        put("typcn-tick", '\ue11e');
        put("typcn-ticket", '\ue11f');
        put("typcn-time", '\ue120');
        put("typcn-times-outline", '\ue121');
        put("typcn-times", '\ue122');
        put("typcn-trash", '\ue123');
        put("typcn-tree", '\ue124');
        put("typcn-upload-outline", '\ue125');
        put("typcn-upload", '\ue126');
        put("typcn-user-add-outline", '\ue127');
        put("typcn-user-add", '\ue128');
        put("typcn-user-delete-outline", '\ue129');
        put("typcn-user-delete", '\ue12a');
        put("typcn-user-outline", '\ue12b');
        put("typcn-user", '\ue12c');
        put("typcn-vendor-android", '\ue12d');
        put("typcn-vendor-apple", '\ue12e');
        put("typcn-vendor-microsoft", '\ue12f');
        put("typcn-video-outline", '\ue130');
        put("typcn-video", '\ue131');
        put("typcn-volume-down", '\ue132');
        put("typcn-volume-mute", '\ue133');
        put("typcn-volume-up", '\ue134');
        put("typcn-volume", '\ue135');
        put("typcn-warning-outline", '\ue136');
        put("typcn-warning", '\ue137');
        put("typcn-watch", '\ue138');
        put("typcn-waves-outline", '\ue139');
        put("typcn-waves", '\ue13a');
        put("typcn-weather-cloudy", '\ue13b');
        put("typcn-weather-downpour", '\ue13c');
        put("typcn-weather-night", '\ue13d');
        put("typcn-weather-partly-sunny", '\ue13e');
        put("typcn-weather-shower", '\ue13f');
        put("typcn-weather-snow", '\ue140');
        put("typcn-weather-stormy", '\ue141');
        put("typcn-weather-sunny", '\ue142');
        put("typcn-weather-windy-cloudy", '\ue143');
        put("typcn-weather-windy", '\ue144');
        put("typcn-wi-fi-outline", '\ue145');
        put("typcn-wi-fi", '\ue146');
        put("typcn-wine", '\ue147');
        put("typcn-world-outline", '\ue148');
        put("typcn-world", '\ue149');
        put("typcn-zoom-in-outline", '\ue14a');
        put("typcn-zoom-in", '\ue14b');
        put("typcn-zoom-out-outline", '\ue14c');
        put("typcn-zoom-out", '\ue14d');
        put("typcn-zoom-outline", '\ue14e');
        put("typcn-zoom", '\ue14f');
    }};

    public TypiconsEngine(Typeface typeface) {
        super(typeface, FONT_MAP);
    }
}