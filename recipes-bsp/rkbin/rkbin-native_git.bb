DESCRIPTION = "Rockchip binary tools"
LICENSE = "CLOSED"

SRCREV = "b2b2b8d928cf0f17694387429bce951811ea9723"
SRC_URI = "git://github.com/MacnicaDHW/rkbin.git;branch=master"

S = "${WORKDIR}/git"

inherit deploy

do_configure[noexec] = "1"
do_compile[noexec] = "1"
do_install[noexec] = "1"

do_deploy() {
    install -Dm 0755 ${S}/tools/rkdeveloptool ${DEPLOYDIR}/rkdeveloptool
    install -Dm 0755 ${S}/bin/rv11/RV1108_usb_boot.bin ${DEPLOYDIR}/RV1108_usb_boot.bin
}

addtask deploy before do_install after do_compile
