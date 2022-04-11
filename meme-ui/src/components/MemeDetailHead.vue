<template>
  <h1>梗词条</h1>
  <div class="author">
    <t-avatar :image="'https://tdesign.gtimg.com/site/avatar.jpg'" size="48px" :hide-on-load-failed="false"/>
    <div class="author-info">
      <div class="author-info-name">Miya</div>
      <div class="author-info-give">贡献：<span>12</span></div>
    </div>
  </div>
</template>

<script>
export default {
  name: "MemeDetailHead"
}
</script>

<style lang="less" scoped>
.author {
  display: flex;
  align-items: center;

  .author-info {
    margin-left: 12px;

    .author-info-name {
      font-size: 16px;
    }

    .author-info-give {
      color: #999;
    }
  }
}
</style>
