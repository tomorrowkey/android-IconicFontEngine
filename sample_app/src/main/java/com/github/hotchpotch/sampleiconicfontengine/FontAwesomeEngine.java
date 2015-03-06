package com.github.hotchpotch.sampleiconicfontengine;

import android.graphics.Typeface;

import com.github.hotchpotch.fontengine.IconicFontEngine;
import com.github.hotchpotch.fontengine.IconicFontMap;

/**
 * Created by yuichi-tateno on 2015/02/28.
 */
public class FontAwesomeEngine extends IconicFontEngine {
    public final static IconicFontMap FONT_MAP = new IconicFontMap() {{
        put("fa-adjust", '\uf042');
        put("fa-adn", '\uf170');
        put("fa-align-center", '\uf037');
        put("fa-align-justify", '\uf039');
        put("fa-align-left", '\uf036');
        put("fa-align-right", '\uf038');
        put("fa-ambulance", '\uf0f9');
        put("fa-anchor", '\uf13d');
        put("fa-android", '\uf17b');
        put("fa-angellist", '\uf209');
        put("fa-angle-double-down", '\uf103');
        put("fa-angle-double-left", '\uf100');
        put("fa-angle-double-right", '\uf101');
        put("fa-angle-double-up", '\uf102');
        put("fa-angle-down", '\uf107');
        put("fa-angle-left", '\uf104');
        put("fa-angle-right", '\uf105');
        put("fa-angle-up", '\uf106');
        put("fa-apple", '\uf179');
        put("fa-archive", '\uf187');
        put("fa-area-chart", '\uf1fe');
        put("fa-arrow-circle-down", '\uf0ab');
        put("fa-arrow-circle-left", '\uf0a8');
        put("fa-arrow-circle-o-down", '\uf01a');
        put("fa-arrow-circle-o-left", '\uf190');
        put("fa-arrow-circle-o-right", '\uf18e');
        put("fa-arrow-circle-o-up", '\uf01b');
        put("fa-arrow-circle-right", '\uf0a9');
        put("fa-arrow-circle-up", '\uf0aa');
        put("fa-arrow-down", '\uf063');
        put("fa-arrow-left", '\uf060');
        put("fa-arrow-right", '\uf061');
        put("fa-arrow-up", '\uf062');
        put("fa-arrows", '\uf047');
        put("fa-arrows-alt", '\uf0b2');
        put("fa-arrows-h", '\uf07e');
        put("fa-arrows-v", '\uf07d');
        put("fa-asterisk", '\uf069');
        put("fa-at", '\uf1fa');
        put("fa-automobile", '\uf1b9');
        put("fa-backward", '\uf04a');
        put("fa-ban", '\uf05e');
        put("fa-bank", '\uf19c');
        put("fa-bar-chart", '\uf080');
        put("fa-bar-chart-o", '\uf080');
        put("fa-barcode", '\uf02a');
        put("fa-bars", '\uf0c9');
        put("fa-bed", '\uf236');
        put("fa-beer", '\uf0fc');
        put("fa-behance", '\uf1b4');
        put("fa-behance-square", '\uf1b5');
        put("fa-bell", '\uf0f3');
        put("fa-bell-o", '\uf0a2');
        put("fa-bell-slash", '\uf1f6');
        put("fa-bell-slash-o", '\uf1f7');
        put("fa-bicycle", '\uf206');
        put("fa-binoculars", '\uf1e5');
        put("fa-birthday-cake", '\uf1fd');
        put("fa-bitbucket", '\uf171');
        put("fa-bitbucket-square", '\uf172');
        put("fa-bitcoin", '\uf15a');
        put("fa-bold", '\uf032');
        put("fa-bolt", '\uf0e7');
        put("fa-bomb", '\uf1e2');
        put("fa-book", '\uf02d');
        put("fa-bookmark", '\uf02e');
        put("fa-bookmark-o", '\uf097');
        put("fa-briefcase", '\uf0b1');
        put("fa-btc", '\uf15a');
        put("fa-bug", '\uf188');
        put("fa-building", '\uf1ad');
        put("fa-building-o", '\uf0f7');
        put("fa-bullhorn", '\uf0a1');
        put("fa-bullseye", '\uf140');
        put("fa-bus", '\uf207');
        put("fa-buysellads", '\uf20d');
        put("fa-cab", '\uf1ba');
        put("fa-calculator", '\uf1ec');
        put("fa-calendar", '\uf073');
        put("fa-calendar-o", '\uf133');
        put("fa-camera", '\uf030');
        put("fa-camera-retro", '\uf083');
        put("fa-car", '\uf1b9');
        put("fa-caret-down", '\uf0d7');
        put("fa-caret-left", '\uf0d9');
        put("fa-caret-right", '\uf0da');
        put("fa-caret-square-o-down", '\uf150');
        put("fa-caret-square-o-left", '\uf191');
        put("fa-caret-square-o-right", '\uf152');
        put("fa-caret-square-o-up", '\uf151');
        put("fa-caret-up", '\uf0d8');
        put("fa-cart-arrow-down", '\uf218');
        put("fa-cart-plus", '\uf217');
        put("fa-cc", '\uf20a');
        put("fa-cc-amex", '\uf1f3');
        put("fa-cc-discover", '\uf1f2');
        put("fa-cc-mastercard", '\uf1f1');
        put("fa-cc-paypal", '\uf1f4');
        put("fa-cc-stripe", '\uf1f5');
        put("fa-cc-visa", '\uf1f0');
        put("fa-certificate", '\uf0a3');
        put("fa-chain", '\uf0c1');
        put("fa-chain-broken", '\uf127');
        put("fa-check", '\uf00c');
        put("fa-check-circle", '\uf058');
        put("fa-check-circle-o", '\uf05d');
        put("fa-check-square", '\uf14a');
        put("fa-check-square-o", '\uf046');
        put("fa-chevron-circle-down", '\uf13a');
        put("fa-chevron-circle-left", '\uf137');
        put("fa-chevron-circle-right", '\uf138');
        put("fa-chevron-circle-up", '\uf139');
        put("fa-chevron-down", '\uf078');
        put("fa-chevron-left", '\uf053');
        put("fa-chevron-right", '\uf054');
        put("fa-chevron-up", '\uf077');
        put("fa-child", '\uf1ae');
        put("fa-circle", '\uf111');
        put("fa-circle-o", '\uf10c');
        put("fa-circle-o-notch", '\uf1ce');
        put("fa-circle-thin", '\uf1db');
        put("fa-clipboard", '\uf0ea');
        put("fa-clock-o", '\uf017');
        put("fa-close", '\uf00d');
        put("fa-cloud", '\uf0c2');
        put("fa-cloud-download", '\uf0ed');
        put("fa-cloud-upload", '\uf0ee');
        put("fa-cny", '\uf157');
        put("fa-code", '\uf121');
        put("fa-code-fork", '\uf126');
        put("fa-codepen", '\uf1cb');
        put("fa-coffee", '\uf0f4');
        put("fa-cog", '\uf013');
        put("fa-cogs", '\uf085');
        put("fa-columns", '\uf0db');
        put("fa-comment", '\uf075');
        put("fa-comment-o", '\uf0e5');
        put("fa-comments", '\uf086');
        put("fa-comments-o", '\uf0e6');
        put("fa-compass", '\uf14e');
        put("fa-compress", '\uf066');
        put("fa-connectdevelop", '\uf20e');
        put("fa-copy", '\uf0c5');
        put("fa-copyright", '\uf1f9');
        put("fa-credit-card", '\uf09d');
        put("fa-crop", '\uf125');
        put("fa-crosshairs", '\uf05b');
        put("fa-css3", '\uf13c');
        put("fa-cube", '\uf1b2');
        put("fa-cubes", '\uf1b3');
        put("fa-cut", '\uf0c4');
        put("fa-cutlery", '\uf0f5');
        put("fa-dashboard", '\uf0e4');
        put("fa-dashcube", '\uf210');
        put("fa-database", '\uf1c0');
        put("fa-dedent", '\uf03b');
        put("fa-delicious", '\uf1a5');
        put("fa-desktop", '\uf108');
        put("fa-deviantart", '\uf1bd');
        put("fa-diamond", '\uf219');
        put("fa-digg", '\uf1a6');
        put("fa-dollar", '\uf155');
        put("fa-dot-circle-o", '\uf192');
        put("fa-download", '\uf019');
        put("fa-dribbble", '\uf17d');
        put("fa-dropbox", '\uf16b');
        put("fa-drupal", '\uf1a9');
        put("fa-edit", '\uf044');
        put("fa-eject", '\uf052');
        put("fa-ellipsis-h", '\uf141');
        put("fa-ellipsis-v", '\uf142');
        put("fa-empire", '\uf1d1');
        put("fa-envelope", '\uf0e0');
        put("fa-envelope-o", '\uf003');
        put("fa-envelope-square", '\uf199');
        put("fa-eraser", '\uf12d');
        put("fa-eur", '\uf153');
        put("fa-euro", '\uf153');
        put("fa-exchange", '\uf0ec');
        put("fa-exclamation", '\uf12a');
        put("fa-exclamation-circle", '\uf06a');
        put("fa-exclamation-triangle", '\uf071');
        put("fa-expand", '\uf065');
        put("fa-external-link", '\uf08e');
        put("fa-external-link-square", '\uf14c');
        put("fa-eye", '\uf06e');
        put("fa-eye-slash", '\uf070');
        put("fa-eyedropper", '\uf1fb');
        put("fa-facebook", '\uf09a');
        put("fa-facebook-f", '\uf09a');
        put("fa-facebook-official", '\uf230');
        put("fa-facebook-square", '\uf082');
        put("fa-fast-backward", '\uf049');
        put("fa-fast-forward", '\uf050');
        put("fa-fax", '\uf1ac');
        put("fa-female", '\uf182');
        put("fa-fighter-jet", '\uf0fb');
        put("fa-file", '\uf15b');
        put("fa-file-archive-o", '\uf1c6');
        put("fa-file-audio-o", '\uf1c7');
        put("fa-file-code-o", '\uf1c9');
        put("fa-file-excel-o", '\uf1c3');
        put("fa-file-image-o", '\uf1c5');
        put("fa-file-movie-o", '\uf1c8');
        put("fa-file-o", '\uf016');
        put("fa-file-pdf-o", '\uf1c1');
        put("fa-file-photo-o", '\uf1c5');
        put("fa-file-picture-o", '\uf1c5');
        put("fa-file-powerpoint-o", '\uf1c4');
        put("fa-file-sound-o", '\uf1c7');
        put("fa-file-text", '\uf15c');
        put("fa-file-text-o", '\uf0f6');
        put("fa-file-video-o", '\uf1c8');
        put("fa-file-word-o", '\uf1c2');
        put("fa-file-zip-o", '\uf1c6');
        put("fa-files-o", '\uf0c5');
        put("fa-film", '\uf008');
        put("fa-filter", '\uf0b0');
        put("fa-fire", '\uf06d');
        put("fa-fire-extinguisher", '\uf134');
        put("fa-flag", '\uf024');
        put("fa-flag-checkered", '\uf11e');
        put("fa-flag-o", '\uf11d');
        put("fa-flash", '\uf0e7');
        put("fa-flask", '\uf0c3');
        put("fa-flickr", '\uf16e');
        put("fa-floppy-o", '\uf0c7');
        put("fa-folder", '\uf07b');
        put("fa-folder-o", '\uf114');
        put("fa-folder-open", '\uf07c');
        put("fa-folder-open-o", '\uf115');
        put("fa-font", '\uf031');
        put("fa-forumbee", '\uf211');
        put("fa-forward", '\uf04e');
        put("fa-foursquare", '\uf180');
        put("fa-frown-o", '\uf119');
        put("fa-futbol-o", '\uf1e3');
        put("fa-gamepad", '\uf11b');
        put("fa-gavel", '\uf0e3');
        put("fa-gbp", '\uf154');
        put("fa-ge", '\uf1d1');
        put("fa-gear", '\uf013');
        put("fa-gears", '\uf085');
        put("fa-genderless", '\uf1db');
        put("fa-gift", '\uf06b');
        put("fa-git", '\uf1d3');
        put("fa-git-square", '\uf1d2');
        put("fa-github", '\uf09b');
        put("fa-github-alt", '\uf113');
        put("fa-github-square", '\uf092');
        put("fa-gittip", '\uf184');
        put("fa-glass", '\uf000');
        put("fa-globe", '\uf0ac');
        put("fa-google", '\uf1a0');
        put("fa-google-plus", '\uf0d5');
        put("fa-google-plus-square", '\uf0d4');
        put("fa-google-wallet", '\uf1ee');
        put("fa-graduation-cap", '\uf19d');
        put("fa-gratipay", '\uf184');
        put("fa-group", '\uf0c0');
        put("fa-h-square", '\uf0fd');
        put("fa-hacker-news", '\uf1d4');
        put("fa-hand-o-down", '\uf0a7');
        put("fa-hand-o-left", '\uf0a5');
        put("fa-hand-o-right", '\uf0a4');
        put("fa-hand-o-up", '\uf0a6');
        put("fa-hdd-o", '\uf0a0');
        put("fa-header", '\uf1dc');
        put("fa-headphones", '\uf025');
        put("fa-heart", '\uf004');
        put("fa-heart-o", '\uf08a');
        put("fa-heartbeat", '\uf21e');
        put("fa-history", '\uf1da');
        put("fa-home", '\uf015');
        put("fa-hospital-o", '\uf0f8');
        put("fa-hotel", '\uf236');
        put("fa-html5", '\uf13b');
        put("fa-ils", '\uf20b');
        put("fa-image", '\uf03e');
        put("fa-inbox", '\uf01c');
        put("fa-indent", '\uf03c');
        put("fa-info", '\uf129');
        put("fa-info-circle", '\uf05a');
        put("fa-inr", '\uf156');
        put("fa-instagram", '\uf16d');
        put("fa-institution", '\uf19c');
        put("fa-ioxhost", '\uf208');
        put("fa-italic", '\uf033');
        put("fa-joomla", '\uf1aa');
        put("fa-jpy", '\uf157');
        put("fa-jsfiddle", '\uf1cc');
        put("fa-key", '\uf084');
        put("fa-keyboard-o", '\uf11c');
        put("fa-krw", '\uf159');
        put("fa-language", '\uf1ab');
        put("fa-laptop", '\uf109');
        put("fa-lastfm", '\uf202');
        put("fa-lastfm-square", '\uf203');
        put("fa-leaf", '\uf06c');
        put("fa-leanpub", '\uf212');
        put("fa-legal", '\uf0e3');
        put("fa-lemon-o", '\uf094');
        put("fa-level-down", '\uf149');
        put("fa-level-up", '\uf148');
        put("fa-life-bouy", '\uf1cd');
        put("fa-life-buoy", '\uf1cd');
        put("fa-life-ring", '\uf1cd');
        put("fa-life-saver", '\uf1cd');
        put("fa-lightbulb-o", '\uf0eb');
        put("fa-line-chart", '\uf201');
        put("fa-link", '\uf0c1');
        put("fa-linkedin", '\uf0e1');
        put("fa-linkedin-square", '\uf08c');
        put("fa-linux", '\uf17c');
        put("fa-list", '\uf03a');
        put("fa-list-alt", '\uf022');
        put("fa-list-ol", '\uf0cb');
        put("fa-list-ul", '\uf0ca');
        put("fa-location-arrow", '\uf124');
        put("fa-lock", '\uf023');
        put("fa-long-arrow-down", '\uf175');
        put("fa-long-arrow-left", '\uf177');
        put("fa-long-arrow-right", '\uf178');
        put("fa-long-arrow-up", '\uf176');
        put("fa-magic", '\uf0d0');
        put("fa-magnet", '\uf076');
        put("fa-mail-forward", '\uf064');
        put("fa-mail-reply", '\uf112');
        put("fa-mail-reply-all", '\uf122');
        put("fa-male", '\uf183');
        put("fa-map-marker", '\uf041');
        put("fa-mars", '\uf222');
        put("fa-mars-double", '\uf227');
        put("fa-mars-stroke", '\uf229');
        put("fa-mars-stroke-h", '\uf22b');
        put("fa-mars-stroke-v", '\uf22a');
        put("fa-maxcdn", '\uf136');
        put("fa-meanpath", '\uf20c');
        put("fa-medium", '\uf23a');
        put("fa-medkit", '\uf0fa');
        put("fa-meh-o", '\uf11a');
        put("fa-mercury", '\uf223');
        put("fa-microphone", '\uf130');
        put("fa-microphone-slash", '\uf131');
        put("fa-minus", '\uf068');
        put("fa-minus-circle", '\uf056');
        put("fa-minus-square", '\uf146');
        put("fa-minus-square-o", '\uf147');
        put("fa-mobile", '\uf10b');
        put("fa-mobile-phone", '\uf10b');
        put("fa-money", '\uf0d6');
        put("fa-moon-o", '\uf186');
        put("fa-mortar-board", '\uf19d');
        put("fa-motorcycle", '\uf21c');
        put("fa-music", '\uf001');
        put("fa-navicon", '\uf0c9');
        put("fa-neuter", '\uf22c');
        put("fa-newspaper-o", '\uf1ea');
        put("fa-openid", '\uf19b');
        put("fa-outdent", '\uf03b');
        put("fa-pagelines", '\uf18c');
        put("fa-paint-brush", '\uf1fc');
        put("fa-paper-plane", '\uf1d8');
        put("fa-paper-plane-o", '\uf1d9');
        put("fa-paperclip", '\uf0c6');
        put("fa-paragraph", '\uf1dd');
        put("fa-paste", '\uf0ea');
        put("fa-pause", '\uf04c');
        put("fa-paw", '\uf1b0');
        put("fa-paypal", '\uf1ed');
        put("fa-pencil", '\uf040');
        put("fa-pencil-square", '\uf14b');
        put("fa-pencil-square-o", '\uf044');
        put("fa-phone", '\uf095');
        put("fa-phone-square", '\uf098');
        put("fa-photo", '\uf03e');
        put("fa-picture-o", '\uf03e');
        put("fa-pie-chart", '\uf200');
        put("fa-pied-piper", '\uf1a7');
        put("fa-pied-piper-alt", '\uf1a8');
        put("fa-pinterest", '\uf0d2');
        put("fa-pinterest-p", '\uf231');
        put("fa-pinterest-square", '\uf0d3');
        put("fa-plane", '\uf072');
        put("fa-play", '\uf04b');
        put("fa-play-circle", '\uf144');
        put("fa-play-circle-o", '\uf01d');
        put("fa-plug", '\uf1e6');
        put("fa-plus", '\uf067');
        put("fa-plus-circle", '\uf055');
        put("fa-plus-square", '\uf0fe');
        put("fa-plus-square-o", '\uf196');
        put("fa-power-off", '\uf011');
        put("fa-print", '\uf02f');
        put("fa-puzzle-piece", '\uf12e');
        put("fa-qq", '\uf1d6');
        put("fa-qrcode", '\uf029');
        put("fa-question", '\uf128');
        put("fa-question-circle", '\uf059');
        put("fa-quote-left", '\uf10d');
        put("fa-quote-right", '\uf10e');
        put("fa-ra", '\uf1d0');
        put("fa-random", '\uf074');
        put("fa-rebel", '\uf1d0');
        put("fa-recycle", '\uf1b8');
        put("fa-reddit", '\uf1a1');
        put("fa-reddit-square", '\uf1a2');
        put("fa-refresh", '\uf021');
        put("fa-remove", '\uf00d');
        put("fa-renren", '\uf18b');
        put("fa-reorder", '\uf0c9');
        put("fa-repeat", '\uf01e');
        put("fa-reply", '\uf112');
        put("fa-reply-all", '\uf122');
        put("fa-retweet", '\uf079');
        put("fa-rmb", '\uf157');
        put("fa-road", '\uf018');
        put("fa-rocket", '\uf135');
        put("fa-rotate-left", '\uf0e2');
        put("fa-rotate-right", '\uf01e');
        put("fa-rouble", '\uf158');
        put("fa-rss", '\uf09e');
        put("fa-rss-square", '\uf143');
        put("fa-rub", '\uf158');
        put("fa-ruble", '\uf158');
        put("fa-rupee", '\uf156');
        put("fa-save", '\uf0c7');
        put("fa-scissors", '\uf0c4');
        put("fa-search", '\uf002');
        put("fa-search-minus", '\uf010');
        put("fa-search-plus", '\uf00e');
        put("fa-sellsy", '\uf213');
        put("fa-send", '\uf1d8');
        put("fa-send-o", '\uf1d9');
        put("fa-server", '\uf233');
        put("fa-share", '\uf064');
        put("fa-share-alt", '\uf1e0');
        put("fa-share-alt-square", '\uf1e1');
        put("fa-share-square", '\uf14d');
        put("fa-share-square-o", '\uf045');
        put("fa-shekel", '\uf20b');
        put("fa-sheqel", '\uf20b');
        put("fa-shield", '\uf132');
        put("fa-ship", '\uf21a');
        put("fa-shirtsinbulk", '\uf214');
        put("fa-shopping-cart", '\uf07a');
        put("fa-sign-in", '\uf090');
        put("fa-sign-out", '\uf08b');
        put("fa-signal", '\uf012');
        put("fa-simplybuilt", '\uf215');
        put("fa-sitemap", '\uf0e8');
        put("fa-skyatlas", '\uf216');
        put("fa-skype", '\uf17e');
        put("fa-slack", '\uf198');
        put("fa-sliders", '\uf1de');
        put("fa-slideshare", '\uf1e7');
        put("fa-smile-o", '\uf118');
        put("fa-soccer-ball-o", '\uf1e3');
        put("fa-sort", '\uf0dc');
        put("fa-sort-alpha-asc", '\uf15d');
        put("fa-sort-alpha-desc", '\uf15e');
        put("fa-sort-amount-asc", '\uf160');
        put("fa-sort-amount-desc", '\uf161');
        put("fa-sort-asc", '\uf0de');
        put("fa-sort-desc", '\uf0dd');
        put("fa-sort-down", '\uf0dd');
        put("fa-sort-numeric-asc", '\uf162');
        put("fa-sort-numeric-desc", '\uf163');
        put("fa-sort-up", '\uf0de');
        put("fa-soundcloud", '\uf1be');
        put("fa-space-shuttle", '\uf197');
        put("fa-spinner", '\uf110');
        put("fa-spoon", '\uf1b1');
        put("fa-spotify", '\uf1bc');
        put("fa-square", '\uf0c8');
        put("fa-square-o", '\uf096');
        put("fa-stack-exchange", '\uf18d');
        put("fa-stack-overflow", '\uf16c');
        put("fa-star", '\uf005');
        put("fa-star-half", '\uf089');
        put("fa-star-half-empty", '\uf123');
        put("fa-star-half-full", '\uf123');
        put("fa-star-half-o", '\uf123');
        put("fa-star-o", '\uf006');
        put("fa-steam", '\uf1b6');
        put("fa-steam-square", '\uf1b7');
        put("fa-step-backward", '\uf048');
        put("fa-step-forward", '\uf051');
        put("fa-stethoscope", '\uf0f1');
        put("fa-stop", '\uf04d');
        put("fa-street-view", '\uf21d');
        put("fa-strikethrough", '\uf0cc');
        put("fa-stumbleupon", '\uf1a4');
        put("fa-stumbleupon-circle", '\uf1a3');
        put("fa-subscript", '\uf12c');
        put("fa-subway", '\uf239');
        put("fa-suitcase", '\uf0f2');
        put("fa-sun-o", '\uf185');
        put("fa-superscript", '\uf12b');
        put("fa-support", '\uf1cd');
        put("fa-table", '\uf0ce');
        put("fa-tablet", '\uf10a');
        put("fa-tachometer", '\uf0e4');
        put("fa-tag", '\uf02b');
        put("fa-tags", '\uf02c');
        put("fa-tasks", '\uf0ae');
        put("fa-taxi", '\uf1ba');
        put("fa-tencent-weibo", '\uf1d5');
        put("fa-terminal", '\uf120');
        put("fa-text-height", '\uf034');
        put("fa-text-width", '\uf035');
        put("fa-th", '\uf00a');
        put("fa-th-large", '\uf009');
        put("fa-th-list", '\uf00b');
        put("fa-thumb-tack", '\uf08d');
        put("fa-thumbs-down", '\uf165');
        put("fa-thumbs-o-down", '\uf088');
        put("fa-thumbs-o-up", '\uf087');
        put("fa-thumbs-up", '\uf164');
        put("fa-ticket", '\uf145');
        put("fa-times", '\uf00d');
        put("fa-times-circle", '\uf057');
        put("fa-times-circle-o", '\uf05c');
        put("fa-tint", '\uf043');
        put("fa-toggle-down", '\uf150');
        put("fa-toggle-left", '\uf191');
        put("fa-toggle-off", '\uf204');
        put("fa-toggle-on", '\uf205');
        put("fa-toggle-right", '\uf152');
        put("fa-toggle-up", '\uf151');
        put("fa-train", '\uf238');
        put("fa-transgender", '\uf224');
        put("fa-transgender-alt", '\uf225');
        put("fa-trash", '\uf1f8');
        put("fa-trash-o", '\uf014');
        put("fa-tree", '\uf1bb');
        put("fa-trello", '\uf181');
        put("fa-trophy", '\uf091');
        put("fa-truck", '\uf0d1');
        put("fa-try", '\uf195');
        put("fa-tty", '\uf1e4');
        put("fa-tumblr", '\uf173');
        put("fa-tumblr-square", '\uf174');
        put("fa-turkish-lira", '\uf195');
        put("fa-twitch", '\uf1e8');
        put("fa-twitter", '\uf099');
        put("fa-twitter-square", '\uf081');
        put("fa-umbrella", '\uf0e9');
        put("fa-underline", '\uf0cd');
        put("fa-undo", '\uf0e2');
        put("fa-university", '\uf19c');
        put("fa-unlink", '\uf127');
        put("fa-unlock", '\uf09c');
        put("fa-unlock-alt", '\uf13e');
        put("fa-unsorted", '\uf0dc');
        put("fa-upload", '\uf093');
        put("fa-usd", '\uf155');
        put("fa-user", '\uf007');
        put("fa-user-md", '\uf0f0');
        put("fa-user-plus", '\uf234');
        put("fa-user-secret", '\uf21b');
        put("fa-user-times", '\uf235');
        put("fa-users", '\uf0c0');
        put("fa-venus", '\uf221');
        put("fa-venus-double", '\uf226');
        put("fa-venus-mars", '\uf228');
        put("fa-viacoin", '\uf237');
        put("fa-video-camera", '\uf03d');
        put("fa-vimeo-square", '\uf194');
        put("fa-vine", '\uf1ca');
        put("fa-vk", '\uf189');
        put("fa-volume-down", '\uf027');
        put("fa-volume-off", '\uf026');
        put("fa-volume-up", '\uf028');
        put("fa-warning", '\uf071');
        put("fa-wechat", '\uf1d7');
        put("fa-weibo", '\uf18a');
        put("fa-weixin", '\uf1d7');
        put("fa-whatsapp", '\uf232');
        put("fa-wheelchair", '\uf193');
        put("fa-wifi", '\uf1eb');
        put("fa-windows", '\uf17a');
        put("fa-won", '\uf159');
        put("fa-wordpress", '\uf19a');
        put("fa-wrench", '\uf0ad');
        put("fa-xing", '\uf168');
        put("fa-xing-square", '\uf169');
        put("fa-yahoo", '\uf19e');
        put("fa-yelp", '\uf1e9');
        put("fa-yen", '\uf157');
        put("fa-youtube", '\uf167');
        put("fa-youtube-play", '\uf16a');
        put("fa-youtube-square", '\uf166');
    }};

    public FontAwesomeEngine(Typeface typeface) {
        super(typeface, FONT_MAP);
    }
}
