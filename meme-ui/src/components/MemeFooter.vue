<template>
  <t-footer class="t-footer">
    Copyright @ 2019-{{ new Date().getFullYear() }} CDNU. 创新创业课程作业
  </t-footer>
</template>

<script>
export default {
  name: "MemeFooter"
}
</script>

<style lang="less" scoped>
.t-footer {
  display: flex;
  align-items: center;
  justify-content: center;
}
</style>
