workspace(name = "innecto")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
	name = "rules_jvm_external",
	url = "https://github.com/bazelbuild/rules_jvm_external/archive/4.5.zip",
	sha256 = "b17d7388feb9bfa7f2fa09031b32707df529f26c91ab9e5d909eb1676badd9a6",
	strip_prefix = "rules_jvm_external-4.5",
)

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
	artifacts = [
		"org.apache.groovy:groovy:4.0.11",
	],
	fetch_sources = True,
	repositories = [
		"https://repo1.maven.org/maven2",
	],
	version_conflict_policy = "pinned",
)
