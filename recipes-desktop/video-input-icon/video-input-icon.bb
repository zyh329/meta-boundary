# Simple recipe to add desktop icon and executable to run gstreamer
# command to display video input on screen in media player.

DESCRIPTION = "Video Input Desktop Icon/Executable"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=b7a244440f5854ed05acee9962562ba4"

PR = "r0"

SRC_URI = " \
	file://hdmi-input \
	file://hdmi-input.desktop \
	file://OV5640-MIPI-Test.desktop \
	file://ov5640-mipi-test \
	file://OV5642.desktop \
	file://ov5642-test \
	file://COPYING \
"

S = "${WORKDIR}"

do_install() {
	mkdir -p ${D}/usr/bin/
	mkdir -p ${D}/usr/share/applications/
	cp ${S}/hdmi-input ${D}/usr/bin/
	cp ${S}/hdmi-input.desktop ${D}/usr/share/applications/
	cp ${S}/ov5640-mipi-test ${D}/usr/bin/
	cp ${S}/OV5640-MIPI-Test.desktop ${D}/usr/share/applications/
	cp ${S}/OV5642.desktop ${D}/usr/share/applications/
	cp ${S}/ov5642-test ${D}/usr/bin/
}

FILES_${PN} = " \
	/usr/bin/* \
	/usr/share/applications/* \
"
