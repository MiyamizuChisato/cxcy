<template>
  <t-header>
    <t-head-menu id="t-head-menu">
      <template #logo>
        <h2> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;梗百科</h2>
      </template>
      <t-menu-item value="1">首页</t-menu-item>
      <t-menu-item value="2">热梗</t-menu-item>
      <t-menu-item value="3">随机</t-menu-item>
      <t-menu-item value="4" :disabled="true">FAQ</t-menu-item>
      <template #operations>
        <a @click.prevent="visibleModal=true">
          <t-icon class="t-menu__operations-icon" name="search"/>
        </a>
        <a>
          <t-icon class="t-menu__operations-icon" name="home"/>
        </a>
      </template>
      <t-dialog
          v-model:visible="visibleModal"
          header="搜索"
          placement="center"
          mode="modal"
          :closeOnOverlayClick="false"
          draggable
          :on-confirm="confirm">
        <template #body>
          <t-addon>
            <t-input placeholder="请输入内容"/>
          </t-addon>
        </template>
      </t-dialog>
    </t-head-menu>
  </t-header>
</template>

<script>
import {ref} from 'vue';

export default {
  name: "MemeHeader",
  setup() {
    const visibleModal = ref(false);
    const visibleModelessDrag = ref(false);
    const confirm = () => {
      alert("test");
    }
    return {
      visibleModal, visibleModelessDrag, confirm
    }
  }
}
</script>

<style lang="less">
#t-head-menu {
}
</style>
