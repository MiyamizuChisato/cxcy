<template>
  <t-layout>
    <meme-header class="meme-header">
    </meme-header>
    <t-content class="meme-content">
      <router-view>
      </router-view>
    </t-content>
    <meme-footer class="meme-footer">
    </meme-footer>
  </t-layout>
</template>
<script setup lang="ts">
import MemeHeader from "./components/MemeHeader.vue";
import MemeFooter from "./components/MemeFooter.vue";
</script>

<style lang="less">
.meme-header {
  position: sticky;
  top: 0;
  z-index: 1;
}

.meme-content {
  margin: 12px auto;
  padding: 20px;
  border-radius: 8px;
  width: 1280px;
  background-color: white;
}
</style>
